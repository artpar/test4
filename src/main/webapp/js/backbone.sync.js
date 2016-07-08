/**
 * Created by parth on 30/6/16.
 */
Backbone.sync = function (method, model, options) {

    var isCollection = typeof model.url != "function";

    var url = "";
    var modelName;
    var Id;
    if (isCollection) {
        url = model.url;
        url = url.substr(base.length);
        modelName = url;
    } else {
        url = model.url();
        url = url.substr(base.length);
        var parts = url.split("/");
        modelName = parts[0];
        Id = parts[1];
    }

    var resp, errorMessage, syncDfd = $.Deferred && $.Deferred(); //If $ is having Deferred - use it.

    var subscription = function (resp) {
        if (resp) {
            model.trigger("sync", model, resp, options);
            if (options && options.success)
                options.success(resp);
            if (syncDfd)
                syncDfd.resolve(resp);

        } else {
            errorMessage = errorMessage ? errorMessage
                : "Record Not Found";

            if (options && options.error)
                options.error(errorMessage);
            if (syncDfd)
                syncDfd.reject(errorMessage);
        }
        if (options && options.complete) options.complete(resp);
    };


    var values = model.attributes;
    if (values) {
        var keys = Object.keys(values);
        if (keys && keys.length > 0) {
            var toDelete = [];
            for (var i = 0; i < keys.length; i++) {
                var value = values[keys[i]];
                if (typeof  value == "string" && ( !value || value.length < 1)) {
                    toDelete.push(keys[i])
                }
            }
            for (var i = 0; i < toDelete.length; i++) {
                delete values[toDelete[i]];
            }

        }
    }
    switch (method) {
        case "read":
            if (Id) {
                jsonStore.load(modelName, Id).subscribe(subscription);
            } else {
                jsonStore.loadAll(modelName).subscribe(subscription);
            }
            break;
        case "create":
            jsonStore.create(modelName, values).subscribe(subscription);
            break;
        case "update":
            if (Id && Id.length > 0) {
                resp = jsonStore.update(modelName, Id, values).subscribe(subscription);
            } else {
                resp = jsonStore.create(modelName, values).subscribe(subscription);
            }
            break;
        case "patch":
            resp = jsonStore.update(modelName, Id, values).subscribe(subscription);
            break;
        case "delete":
            resp = jsonStore.destroy(modelName, Id).subscribe(subscription);
            break;
    }

    return syncDfd && syncDfd.promise();
};

/**
 * Created by parth on 30/6/16.
 */

var base = "/rest/rest1/";
function capitalizeFirstLetter(string) {
    return string.charAt(0).toUpperCase() + string.slice(1);
}
var worldName = window.location.search.substring(1).split("/")[0];
if (!worldName || worldName.length < 1) {
    window.location = window.location.pathname + "?world/list";
}

if (!window.location.hash) {
    window.location.hash = "#" + worldName;
}

var adapter = new Store.AjaxAdapter({base: base});
var jsonStore = new Store(adapter);


Store.attr.date = function (name, options) {
    var attr = Store.attr(name, options);
    attr.deserialize = function (data, key) {

        var val = data.attributes && data.attributes[name || key];
        var date = new Date(val);

        date.setTime(date.getTime() + date.getTimezoneOffset() * 60 * 1000);

        var s = date.toISOString();

        return s.substring(0, s.length - 1);
    };
    attr.serialize = function (resource, data, key) {
        var date = new Date();
        var dateValue = Date.parse(resource[key]);
        data.attributes[name || key] = dateValue - date.getTimezoneOffset() * 60 * 1000;
    };
    return attr;
};

jsonStore.define(["worlds", "world"], {
    name: Store.attr(),
    permission: Store.attr(),

    createdBy: Store.attr(),
    createdDate: Store.attr.date(),
    lastUpdated: Store.attr.date(),
    lastUpdatedBy: Store.attr(),

    state_: Store.attr(),
    uuid: Store.attr(),
    version: Store.attr()
});
jsonStore.define(["userGroups", "userGroup"], {
    name: Store.attr(),
    permission: Store.attr(),

    createdBy: Store.attr(),
    createdDate: Store.attr.date(),
    lastUpdated: Store.attr.date(),
    lastUpdatedBy: Store.attr(),

    state_: Store.attr(),
    uuid: Store.attr(),
    version: Store.attr()
});

jsonStore.define(["userAccount", "userAccounts"], {
    name: Store.attr(),
    permission: Store.attr(),

    createdBy: Store.attr(),
    createdDate: Store.attr.date(),
    lastUpdated: Store.attr.date(),
    lastUpdatedBy: Store.attr(),

    state_: Store.attr(),
    uuid: Store.attr(),
    version: Store.attr()
});

// Define the "categories" type.
if (["world", "userAccount", "userGroup"].indexOf(worldName) == -1) {


    jsonStore.define([worldName + "s", worldName], {
        name: Store.attr(),
        permission: Store.attr(),

        createdBy: Store.attr(),
        createdDate: Store.attr.date(),
        lastUpdated: Store.attr.date(),
        lastUpdatedBy: Store.attr(),

        state_: Store.attr(),
        uuid: Store.attr(),
        version: Store.attr()
    });
}


// Load all the products.


var datafetch = function (name, f) {
    return function () {
        console.log("call " + name + " !", arguments);
        var that = this;
        that.successFunction = null;
        that.failFunction = null;
        that.callDone = false;
        that.canCall = false;
        that.response = null;

        that.then = function (s, e) {
            console.log("call to " + name + " function with ", arguments);
            that.successFunction = s;
            that.failFunction = e;
            if (this.canCall) {
                s(that.response)
            }
        };

        f(name).subscribe(function (world) {
            console.log(name, world);
            that.response = world;
            that.canCall = true;
            if (!that.callDone) {
                if (that.successFunction) {
                    that.callDone = true;
                    that.successFunction(world.map(function (e) {
                        delete e._dependents;
                        return e;
                    }));
                }
            }
        });
        return this;
    }
};


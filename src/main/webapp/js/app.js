Evol.Config.localStorage = false;
Evol.Config.url = base;

jsonStore.loadAll("world").subscribe(function(worlds) {
    var worldList = $("worldList");
    d3.select("#worldList").selectAll("a").data(worlds).enter().append("a").text(function(d) {
        return capitalizeFirstLetter(d.name);
    }).style().attr("class", "list-group-item").attr("href", "#").on("click", function(d) {
        window.location = window.location.pathname + "?" + d.name;
    });
});



var myElement = $("#evol");
// - run App
new Evol.App({
    el: myElement,
    uiModels: [
        myUIModel
    ],
    style: 'panel-info',
    pageSize: 20
}).render();


$('#uimodel').html(Evol.DOM.input.textMJSON('uimodel2', myUIModel, 12)).slideDown();

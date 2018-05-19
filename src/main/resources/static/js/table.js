function tableInit(option){
    option.table.bootstrapTable({
        url:option.url?option.url:'',
        method:option.method?option.method:'get',
        dataField:option.dataField?option.dataField:'data',
        toolbar:option.toolbar?option.toolbar:'#toolbar',
        striped:option.striped?option.striped:true,
        cache:option.cache?option.cache:false,
        pagination:option.pagination?option.pagination:true,
        sortable:option.sortable?option.sortable:false,
        sortOrder:option.sortOrder?option.sortOrder:'asc',
        queryParams:option.queryParams?option.queryParams:{},
        sidePagination:option.sidePagination?option.sidePagination:'server',
        pageNumber:option.pageNumber?option.pageNumber:1,
        pageSize:option.pageSize?option.pageSize:15,
        pageList:option.pageList?option.pageList:[10,15,30,50,100],
        showColumns:option.showColumns?option.showColumns:true,
        showRefresh:option.showRefresh?option.showRefresh:true,
        minimumCountColumns:option.minimumCountColumns?option.minimumCountColumns:1,
        clickToSelect:option.clickToSelect?option.clickToSelect:true,
        height:option.height?option.height:768,
        uniqueId:option.uniqueId?option.uniqueId:'id',
        showToggle:option.showToggle?option.showToggle:false,
        cardView:option.cardView?option.cardView:false,
        detailView:option.detailView?option.detailView:false,
        columns:option.columns?option.columns:[],
        search:option.search?option.search:false,
        strictSearch:option.strictSearch?option.strictSearch:false,
        onLoadSuccess:option.onLoadSuccess?option.onLoadSuccess:function(res){if (res.code !== 0) alert(res.msg)},
        onLoadError:option.onLoadError?option.onLoadError:function(res){alert('系统异常');},
        onClickRow:option.onClickRow?option.onClickRow:function(row,element){},
        responseHandler:option.responseHandler?option.responseHandler:function (res) {return res;}
    });
}

function tableRefresh(option) {
    option.queryParams ?
        option.table.bootstrapTable('refresh', { query: option.queryParams} ) :
        option.table.bootstrapTable('refresh');
}

var error = function errorFunction(xhr, text, error) {
    alert(xhr.responseJSON.error);
    console.log(xhr);
    console.log(error);
};

function handleResult(res, func) {
    if (res.code === 0) {
        func(res);
    } else {
        alert(res.msg);
    }
}

function sendGetAjax(url, func, button, async) {
    if (typeof async === 'undefined') {
        async = true;
    }
    $.ajax({
        url: url,
        type: 'get',
        async: async,
        success: function (res) {
            handleResult(res, func);
        },
        error: error,
        beforeSend: function (xhr) {
            beforeSend(xhr, button)
        },
        complete: function (xhr, text) {
            complete(xhr, text, button)
        }
    });
}

function sendSyncGetAjax(url, func, button) {
    sendGetAjax(url, func, button, false)
}



function sendPostAjax(url, data, func, button) {
    $.ajax({
        url: url,
        type: 'post',
        data: data,
        success: function (res) {
            handleResult(res, func);
        },
        error: error,
        beforeSend: function (xhr) {
            beforeSend(xhr, button)
        },
        complete: function (xhr, text) {
            complete(xhr, text, button)
        }
    });
}

function uploadFile(url, data, func, button) {
    $.ajax({
        url: url,
        type: 'post',
        data: data,
        async: true,
        cache: false,
        contentType: false,
        processData: false,
        success: function (res) {
            handleResult(res, func);
        },
        beforeSend: function (xhr) {
            beforeSend(xhr, button);
        },
        complete: function (xhr, text) {
            complete(xhr, text, button);
        },
        error: error
    });
}

function beforeSend(xhr, button) {
    $(button).attr("disabled","disabled");
}

function complete(xhr, text, button) {
    $(button).removeAttr("disabled");
}
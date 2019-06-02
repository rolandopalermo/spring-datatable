$(document).ready(function () {
    $.ajax({
        method: "POST",
        url: 'get-all-employees',
        dataType: 'json',
        crossDomain: true,
        beforeSend: function (xhr) {
            //Set authentication headers
        },
        success: function (data, textStatus, jqXHR) {
            if (data.error) {
                alert(data.message);
            } else {
                var selector = $("#applications");
                selector.html("");
                selector.append(JSON.stringify(data));
                data = $.parseJSON(selector.text());
                console.log(data);
                table = $("#employees").DataTable({
                    data: data,
                    scrollX: true,
                    scrollCollapse: true,
                    fixedColumns: true,
                    columns: [{
                            data: "id",
                            visible: false
                        }, {
                            data: "name"
                        }, {
                            data: "surname"
                        }, {
                            data: "age"
                        }, {
                            data: "address"
                        }, {
                            data: "status",
                            render: function (value) {
                                switch (value) {
                                    case "ACTIVE":
                                        return '<span class=active></span>';
                                    case "PENDING":
                                        return '<span class=pending></span>';
                                    case "INACTIVE":
                                        return '<span class=inactive></span>';
                                    case "DELETED":
                                        return '<span class=deleted></span>';
                                    default:
                                        return '<span class=active></span>';
//                                        text = "Banana is good!";
//                                        break;
//                                    case "Orange":
//                                        text = "I am not a fan of orange.";
//                                        break;
//                                    case "Apple":
//                                        text = "How you like them apples?";
//                                        break;
//                                    default:
//                                        text = "I have never heard of that fruit...";
                                }
                            }
                        }
                    ]
                });
            }
        },
        error: function (xhr) { // if error occured
            alert('No se pudo procesar la solicitud.');
        },
        complete: function () {
        },
        xhrFields: {
            withCredentials: true
        }
    });
});
<%-- 
    Document   : view
    Created on : Jan 20, 2017, 7:15:31 PM
    Author     : Rolando
--%>

<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="<c:url value='/static/app/third-party/js/jquery-1.12.4.js' />"></script>
<script type="text/javascript" src="<c:url value='/static/app/third-party/datatables/js/jquery.dataTables.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/static/app/third-party/datatables/js/dataTables.buttons.min.js' />"></script>
<script type="text/javascript" src="<c:url value='/static/app/js/home.js' />"></script>
<link href="<c:url value='/static/app/third-party/datatables/css/jquery.dataTables.min.css'/>" rel="stylesheet"/>
<link href="<c:url value='/static/app/third-party/datatables/css/buttons.dataTables.min.css'/>" rel="stylesheet"/>
<link href="<c:url value='/static/app/css/master.css'/>" rel="stylesheet"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>How to use Jquery datatable in Spring MVC</title>
    </head>
    <body>
        <div id="applications" style="display: none"></div>
        <table id="employees" cellspacing="0" width="100%">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Age</th>
                    <th>Address</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </body>
</html>
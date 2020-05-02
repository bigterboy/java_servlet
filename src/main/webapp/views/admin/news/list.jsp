<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 5/2/20
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
</head>
<body>

<h2>HTML Table</h2>
<div class="main-container">

    <form action="<c:url value='/admin-new-list'/>" id="formSubmit" method="get ">
        <table>
            <tr>
                <th>Company</th>
                <th>Contact</th>
                <th>Country</th>
            </tr>

            <c:forEach var="item" items="${model.listResult}">
                <tr>
                    <td>${item.title}</td>
                    <td>${item.content}</td>
                    <td>${item.shortDescription}</td>
                </tr>

            </c:forEach>

        </table>
        <input type="hidden" value="" id="page" name="page"/>
        <input type="hidden" value="" id="magPageItem" name="magPageItem"/>
    </form>
</div>
<br>
<ul class="pagination" id="pagination"></ul>
<script type="text/javascript">
    var totalPage = ${model.totalPage};
    var currentPage = ${model.page};
    var visiblePages = ${model.maxPageItem};
    var limit = 2;
    $(function () {

        window.pagObj = $('#pagination').twbsPagination({
            totalPages: totalPage,
            visiblePages: visiblePages  ,
            startPage: currentPage,
            onPageClick: function (event, page) {
                if(currentPage != page){
                    console.info(page + ' (from options)');
                    $('page').setVal(page);
                    $('magPageItem').setVal(limit);
                    $('formSubmit').submit();
                }
            }
        }).on('page', function (event, page) {
            console.info(page + ' (from event listening)');
        });
    });
</script>
</body>
</html>
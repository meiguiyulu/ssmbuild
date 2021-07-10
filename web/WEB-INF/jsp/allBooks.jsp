<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LYJ
  Date: 2021/7/10
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍列表----所有书籍</small>
                    </h1>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
            </div>
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">显示全部书籍</a>
            </div>
            <div class="col-md-4 column">
                <form class="form-inline" method="post" action="${pageContext.request.contextPath}/book/queryBookByName">
                    <span style="color: red; font-weight: bold">${error}</span>
                    <div class="form-group">
                        <input type="text" class="form-control" name="queryBookName" placeholder="请输入要查询的书籍名称">
                    </div>
                    <button type="submit" class="btn btn-primary">搜索</button>
                </form>
            </div>
        </div>


        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名称</th>
                            <th>书籍数目</th>
                            <th>书籍详情</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="book" items="#{requestScope.get('books')}">
                            <tr>
                                <td>${book.getBookID()}</td>
                                <td>${book.getBookName()}</td>
                                <td>${book.getBookCounts()}</td>
                                <td>${book.getDetail()}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.getBookID()}" class="btn btn-warning">修改</a>
                                    &nbsp;|&nbsp;
                                    <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.getBookID()}" class="btn btn-danger">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>

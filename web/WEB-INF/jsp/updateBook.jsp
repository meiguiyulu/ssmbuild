<%--
  Created by IntelliJ IDEA.
  User: LYJ
  Date: 2021/7/10
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="col-md-4 column">
        <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
            <input type="text" hidden name="bookID" value="${QueriedBook.bookID}">
            <div class="form-group">
                <label for="bookName">书籍名称</label>
                <input type="text" class="form-control" name="bookName" id="bookName" placeholder="书籍名称" value="${QueriedBook.bookName}" required>
            </div>
            <div class="form-group">
                <label for="bookCounts">书籍数目</label>
                <input type="text" class="form-control" name="bookCounts" id="bookCounts" placeholder="书籍数目" value="${QueriedBook.bookCounts}" required>
            </div>
            <div class="form-group">
                <label for="detail">描述</label>
                <input type="text" class="form-control" name="detail" id="detail" placeholder="描述" value="${QueriedBook.detail}" required>
            </div>
            <input type="submit" class="btn btn-primary" value="修改">
        </form>
    </div>
</div>
</body>
</html>

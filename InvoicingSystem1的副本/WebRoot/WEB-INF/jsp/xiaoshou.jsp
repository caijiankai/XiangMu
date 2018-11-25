<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>查看库存</h1>
		<h2>商品名称:</h2>
		<form action="user/userList" method="post"> 
		<input type="text" name="search" placeholder="请输入关键字">
        <input type="submit" value="搜索"> 
    	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
		<tr>商品订购详情 <a href="see/addProduct">+</</a></tr>
		
		<tr>
		
			<th>商品名称</th>
			<th>商品展示</th>
			<th>商品单价</th>
			<th>订购数量</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${sp}" var="sp1" >
			<tr>
				<td>${sp1.name}</td>
				<td>${sp1.pic}</td>
				<td>${sp1.money }</td>
				<td>${sp1.quantity}</td>		
				<td><a href="see/delete?id=${sp1.id}" >删除</a></td>	
			</tr>
		</c:forEach>
		<tr>
			<td></td>
			<td>总价</td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		
	</table>
</body>
</html>
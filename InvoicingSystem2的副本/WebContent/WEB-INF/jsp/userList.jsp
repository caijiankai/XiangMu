<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
			<h1>会员管理</h1>
			<form action="user/userList" method="post">
				用户名:<input type="text" name="name" id="name" value="${name }"/>
				<input type="submit" value="查询">		
			</form>
			
			<hr>
			
			<table border="1">
			<tr>
					<th>序号</th>
					<th>用户名</th>
					<th>用户类型</th>
					<th>用户状态</th>
					<th>最后修改时间</th>
			
			</tr>
			<c:forEach items="${userList }" var="user" varStatus="status">
					<tr>
							<td>${status.index+1 }</td>
							<td>${user.name }</td>
							<td>${user.type_name } </td>
							
					</tr>
					<td>
						<c:if test="${user.status ==1}">正常</c:if>
						<c:if test="${user.status ==0}">异常</c:if>
					
					</td>
					<td>${user.lastModifyTime }</td>
			</c:forEach>
			</table>
			
			<a href="javascript:fenye(1)">首页</a>
			<a href="javascript:fenye(${dangye-1 })">上一页</a>
			<a href="javascript:fenye(${dangye-1 })">下一页</a>
			<a href="javascript:fenye(${zongjie })">尾页</a>
			<span>第 ${dangYe }页/共${zongYe }页 (${zongCount }条数)</span>
			<input type="hidden" id="zongYe" value="${zongYe }">

	</div>		
					
</body>
</html>
<script src="statics/js/jquery-1.9.1.min.js"></script>
<script>
		function fenye(dangye){
			if(dangye<=0){
				dangye=1;
			}else if(danye> $("#zongYe").val()){
				dangYe = $("#zongYe").val();
			}
		}
		var name = $("#name").val();
		window.location.href="user/userList?name="+name+"&dangYe="+dangYe;


</script>
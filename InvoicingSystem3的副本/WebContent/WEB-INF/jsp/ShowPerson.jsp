<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<select>	
		 <c:forEach var="cp" items="${cplist}">

				<option value="${cp.name}" >${cp.name}</option>.
				 		 
			</c:forEach>
			</select>		<a href="see/check?name="+${cp.name}+">查询</a>		&nbsp,$nbsp	<a href="see/addPerson">新增人员</a>
		<table border="1">
				<tr>人才信息列表</tr>
				<tr>
				<th>人才编号</th>
				<th>人才姓名</th>
				<th>工作年限</th>
				<th>所属部门</th>
				<th>毕业学校</th>
				<th>操作</th>
				</tr>
			<c:forEach items="${enList}" var="person" varStatus="status">
			<tr>
				
				<td>${person.id}</td>
				<td>${person.name}</td>
				<td>
					${person.workingLife}
				</td>
				<td>${person.departmentId}</td>
				<td>${person.graduateSchool }</td>
				<td><a>修改</a> <a href="see/deleteRencai">删除</a></td>
			</tr>
		</c:forEach>
		
		</table>
			<a href="javascript:fenYe(1)">首页</a>
	<a href="javascript:fenYe(${dangYe-1})">上一页</a>
	<a href="javascript:fenYe(${dangYe+1})">下一页</a>
	<a href="javascript:fenYe(${zongYe})">尾页</a>
	<span>第 ${dangYe }页/共${zongYe }页 (${zongCount }条数)</span>
	<input type="hidden" id="zongYe" value="${zongYe }">
</div>
</body>
</html>
<script src="statics/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">

	  $(document).ready(function(){
		$("tr:even").css("background-color","lightgreen");
		
	});  
	function fenYe(dangYe){
		if(dangYe <=0){
			dangYe = 1;
		}else if(dangYe > $("#zongYe").val()){
			dangYe = $("#zongYe").val();
		}
		var name = $("#name").val();
		window.location.href="see/userList?name="+name+"&dangYe="+dangYe;
	}
</script>

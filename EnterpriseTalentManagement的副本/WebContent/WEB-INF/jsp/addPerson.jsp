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

			<form action="see/addRencai" method="post">
			<table border="1">
					<tr>添加人才信息</tr>
					<tr><td>人才姓名(*)<td><td><input type="text" id="name1" /></td></tr>
					<tr><td>工作年限(*)<td><td><input type="text" id="name2" /></td></tr>
					<tr><td>所属部门(*)<td><td><select id="name3"><option value = "全部"selected = "selected"></option><option>ceshi</option><option>jishu</option><option>guanli</option></select></td></tr>
					<tr><td>毕业学校</td><td><input type="text" name="name" /></td></tr>
					<tr><td>个人简介</td><td><textarea rows="3" cols="20">

					</textarea></td></tr>
					<tr><td>工作经历</td><td><textarea rows="3" cols="20">

					</textarea></td></tr>
					<tr><button type="submit">提交</button><input type="button" value="返回" onclick="return()" /></tr>
			</table>
	
			</form>
	<script src="statics/js/jquery-1.9.1.min.js"></script>		
		<script>
		
		
		function return(){
			var name1=$("name1").val();
			var name3=$("name3").val();
			if(name1==""){
				alert("人才姓名不能为空!")
			}
			if(name3.equals("全部")){
				alert("所属部门不对!")
			}
			
			
			window.location.href="ShowPerson.jsp";
			
		}
	
		
		</script>	
			
			
</body>
</html>
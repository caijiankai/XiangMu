<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base target="_parent">
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/style.css" />
</head>
<body>
		
		<div><h3>欢迎,${userSession.userName}</h3> <a href="${pageContext.request.contextPath }/user/logout.html " onclick="return check()"
		>退出登录</a></div>
		
		<div>
		<ul>
			
			<li><a href="${pageContext.request.contextPath }/user/addXiaoShou.html" target="box">销售</a></li>
			<li><a href="${pageContext.request.contextPath }/user/XiaoShou.html" target="box" >销售信息查询</a></li>
			<li><a href="" target="box" >查看库存</a></li>
		</ul>
		</div>
		<div id="one">
		<iframe name ="box"  width="100%" height="100%">
				
		</iframe>
		</div>	
		
</body>
</html>
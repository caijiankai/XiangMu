<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>
			<!-- 显示struts action 中message的属性内容 -->
			<s:property value="message" />
		</h1>
	</div>
	</hr>
	<div>
		<form action="helloWorld.action" method="post">
			请输入您的姓名: <input name="name" type="text" /> <input type="submit"
				value="提交">

		</form>

	</div>
</body>
</html>

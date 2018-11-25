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
			<h2>添加销售</h2>
			<form action="user/saveProduct" method="post">
			商品名称:	<select name="product">
						
						<option value ="请选择商品">请选择商品</option>
  						<option value ="${pr.Id}">${pr.name}</option>
					</select>
                        <br>
            销售单价: <input id="" name="maktMaktx" list="wlmslist" value=""/> <br>         
			销售数量:	<input id="" name="maktMaktx" list="wlmslist" value=""/><br>
			<br>&nbsp &nbsp		<input type="submit" value="保存">
			</form>		
</body>
</html>
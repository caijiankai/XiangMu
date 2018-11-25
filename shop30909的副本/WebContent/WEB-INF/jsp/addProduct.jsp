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
<meta charset="UTF-8">
<title>Insert title here</title>
<style>


</style>

</head>
<body>
	<form>
	<table border="1" width=”100x">
		<tr><td colspan="6" id="one" valign="middle"> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 商品订购详情</td></tr>
		<tr><td>商品名称</td>
		<td> 
		<select onchange="product()" id="one">
			
			 <c:forEach var="cp" items="${cplist}">
				  
				 
				 <option value="${cp.name}" >${cp.name}</option>.
				 		 
			</c:forEach>
			 		
</select>	
			 		
			 		
			<!-- <option value ="请选择">
				<option>大麦</option>
				<option>小米</option>
				<option>面包</option>
			
			</option> -->
		
		</select>   
		</td>
		</tr>
		
		<tr><td>商品展示</td><td><img src=""  alt="" id="two"/>    </td></tr>
		<tr><td>商品单价</td><td>    </td><td>订购数量</td><td><input/>    </td></tr>
		<tr></tr>
		<tr></tr>
		<tr><td></td><td><button>保存</button></td><td><button>取消</button></td><td></tr>
		</form>
			

	</table>
	

<script src="../statics/js/jquery-1.9.1.min.js"></script>
<script>
function product(){
	var name=$("#one").selectedIndex;
	var text = $("#one").options[name].text(); 
	if(text.equals("大麦")){
		$("#two").attributes[0].value="../pic/11.jpg";
		return;
	}
	
	//var name=$('#one option:selected') .val();
	//var name=$("#one").val();
	//var d = $('#one option:selected').attr('value');
	//var c = $('#one option:selected').text();
	//var a = $('#two').val();
	//alert($("#one option:selected").text());
	//var a=$("one").val();
	//alert(name);
	//$("#two").attr("src",name);
	//var one=document.getElementById("one");
	//var index=one.selectedIndex;
	//var gv=one.value;
	//var gt=one[index].text;
	//alert(gt);
}

</script>
</body>
</html>
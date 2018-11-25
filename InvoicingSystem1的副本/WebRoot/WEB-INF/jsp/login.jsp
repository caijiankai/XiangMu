<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/login.css" />
</head>
<body class="login">
    <section class="loginBox">
        <header class="loginHeader">
            <h1>小型进销存系统</h1>
        </header>
        <section class="loginCont">
	        <form class="loginForm" action="${pageContext.request.contextPath }/user/dologin.html"  name="actionForm" id="actionForm"  method="post">
	        	
				<div class="info">${error }</div>
				<div class="inputbox">
                    <label for="user">用户名：</label>
					<input type="text" class="input-text" id="userName" name="userName" placeholder="请输入用户名" required/>
				</div>
				<br>	
				<div class="inputbox">
                    <label for="mima">密    &nbsp;&nbsp;码：</label>
                    <input  type="password" id="passWord" name="passWord" placeholder="请输入密码" required/>
                </div>	
				<div class="subBtn">
                    <input type="submit" value="登录"   onclick="return check()"/>
                    <input type="reset" value="重置"/>
                </div>	
			</form>
        </section>
    </section>

<script>
		
		function check(){
			var a=document.getElementById("userName");
			var b=document.getElementById("passWord");
			if(a.value == ""){
				alert("用户名必填");
				a.focus();	
				return false;
			}else if(b.value==""){
				alert("密码必填");
				b.focus();	
				return false;
			}			
			return true;
		}
</script>

</body>
</html>

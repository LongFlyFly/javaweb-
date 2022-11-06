<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
<title>用户订单首页</title>
<style type="text/css">
body{margin:0;padding:0;}
div{position:absolute;width:100%;height:100%}
#iframTop{width:100%;height:100px;}
#iframLeft{width:15%;height:100%;float:left;}
#iframRight{width:84%;height:100%;}
</style>

</head>
<body>
 <div>
	<iframe id="iframTop" name="iframTop" src="../index/top.jsp" class="embed-responsive-item" frameBorder="1"></iframe>
	<iframe id="iframLeft" name="iframLeft" src="../index/left.jsp" frameBorder="1"></iframe>
	<iframe id="iframRight" name="iframRight" src="../index/right.jsp" frameBorder="0"></iframe>
	
</div>
</body>
</html>
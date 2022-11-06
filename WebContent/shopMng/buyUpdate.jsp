<%@page import="org.apache.naming.java.javaURLContextFactory"%>
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
<title>Insert title here</title>
</head>
<body>
<body class="panel panel-primary">
 	<body class="panel-heading">
		<h3 class="panel-title">商品详情</h3>
   </body>
   
   <div class="panel-body">
   	  <form action="${pageContext.request.contextPath }/buyUpateSvlt"  name="form" class="form-inline"> 
   			<div class="form-group">
   				<label class="col-sm-2 control-label">收货地址</label>
   				<div class="col-sm-10">
   					<input type="text" value="${buy.getAddress()}" name="address" class="form-control">
   				</div>
   			</div>
		   	<div class="form-group">
			   	   <label class="col-sm-2 control-label">收货人</label>
			   	   <div class="col-sm-10">
			   	   	<input class="form-control" value="${buy.getShouHuoMan()}" name="name">
			   	   </div>
		   	 </div>
			   	<input type="hidden" name="buyId" value="${buy.getId()}">
			   	<input type="hidden" value='<%=session.getAttribute("shouHuoMan") %>'>
			   	<input type=hidden name="date" value='<%=new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date())%>'/>
			   	 
		   	 	<div class="form-grop">
		   		<div class="col-sm-offset-2 col-sm-10">
		   	       <button  type="submit"  class="btn btn-primary">修改</button>
		   	       <button  type="button"  class="btn btn-infp" onclick="history.back();">返回</button>
		   	    </div>
		   	</div>
		</form>
   </div>
</body>
</html>
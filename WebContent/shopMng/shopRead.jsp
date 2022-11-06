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
<div class="panel-body">
   <form class="form-horizontal" action="action=${pageContext.request.contextPath }/shopReadSvlt">
   
   	
   	<div class="form-group">
   	   <label class="col-sm-2 control-label">商品名称</label>
   	   <div class="col-sm-10">
   	   		<input type="text" value="${goods.getName()}" name="name" readonly="readonly" class="form-control">
   	   </div>
   	</div>
   	
   	<div class="form-group">
   	   <label class="col-sm-2 control-label">商品内容</label>
   	   <div class="col-sm-10">
   	   	<input type="text" value="${goods.getDiscrabe() }" readonly="readonly" class="form-control">
   	   </div>
   	</div>
   	
   	<div class="form-group">
   	   <label class="col-sm-2 control-label">商品价格</label>
   	   <div class="col-sm-10">
   	   	<input type="text" value="${goods.getPrice()}" readonly="readonly" class="form-control">
   	   </div>
   	</div>
   	
   	<div class="form-group">
   	   <label class="col-sm-2 control-label">折扣价格</label>
   	   <div class="col-sm-10">
   	   	<input type="text" value="${goods.getDiscount()}" readonly="readonly" class="form-control">
   	   </div>
   	</div>
   	
   	<div class="form-group">
   	   <label class="col-sm-2 control-label">商品地址</label>
   	   <div class="col-sm-10">
   	   	<input type="text" value="${goods.getAddress()}" readonly="readonly" class="form-control">
   	   </div>
   	</div>
   	
   	<div class="form-grop">
   		<div class="col-sm-offset-2 col-sm-10">
   	     <button  type="button"  class="btn btn-infp" onclick="history.back();">返回</button>
   	    </div>
   	</div>
   </form>
</div>
</body>
</html>
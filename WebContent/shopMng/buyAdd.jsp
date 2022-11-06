<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title">添加商品</h3>
    </div>
    <div class="panel-body">
        <form class="form-horizontal" action="${pageContext.request.contextPath }/buyAddSvlt">
            <div class="form-group">
               <div class="col-sm-10">
                <input type="text" class="form-control" name="address" placeholder="请输入地址"></input>
                 
                 </div>
            </div>
            <div class="form-group">
               <div class="col-sm-10">
                
                 <input type="text" class="form-control" name="shouHuoMan" placeholder="请输入收货人姓名"></input>
                 </div>
            </div>
            <input type=hidden name="u2" value='<%=session.getAttribute("u1")%>'>
            <input type=hidden name="date" value='<%=new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss")%>'>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">提交</button>
                    <input type="reset" name="cmdCancel" value="重置" class="btn btn-default">
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
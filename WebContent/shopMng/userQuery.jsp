<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布新闻</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>

<body>
<div class="panel panel-primary">
  <div class="panel-heading">
    <h3 class="panel-title">查看信息</h3>
  </div>
  <div class="panel-body">
  	  <form action="${pageContext.request.contextPath }/userQuerySvlt"  name="form" class="form-inline"> 
  	  	
  	 <%--  	<c:if test="${isCondition }"> --%>
  	  	<div class="queryDiv">
	  	  	<div class="form-group">
			  <label >用户</label>
			  <input type="text" name="uname" class="form-control"  placeholder="请输入关键字">
			</div>
			<div class="form-group">
			  <label >电话</label>
			  <input type="text" name="psw" class="form-control" >
			</div>
	  		 <button type="submit" class="btn btn-info">查询<span class="glyphicon glyphicon-search" aria-hidden="true"></button>
  		</div>
  		<%-- </c:if> --%>
  		
	   	<table class="table table-striped table-hover myTable">
		  <tr>
			  <td class="active">用户名</td>
			  <td class="success">电话</td>
			  <td class="warning">密码</td>
			  <td class="success">操作</td>
			 
		</tr>
		<c:forEach var="user" items="${rSet }">
		 <tr>
			
			  <td>${user.getName() }</td>
			  <td>${user.getTel() }</td>
			  <td>${user.getPsw() }</td>
			  <td>
				  <a href="${pageContext.request.contextPath }/userDeleteSvlt?userId=${user.getId() }"  formaction="../userDeleteSvlt"  data-whatever="${user.getId() }" data-toggle="modal" data-target="#myModal" class="btn btn-default btn-xs" onclick = "btnRst_Click()" role="button">删除</a>
			  </td>
		</tr>
		</c:forEach>
		</table>
	  </form>
  </div>
</div>

</body>

</html>
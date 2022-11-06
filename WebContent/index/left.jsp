<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
<style type="text/css">
 li{font-size:17px}
</style>
</head>
<body>

<ul class="nav nav-pills nav-stacked">
  <li  class="active">
    <a href="../shopMng/buyAdd.jsp" target="iframRight">
    	购买商品
    	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
    </a>
  </li>
  <!--  <li id="lil"><a href="../newsMng/query/newsQuery.jsp" target="iframRight">查看新闻<span class="glyphicon glyphicon-hand-right" aria-hidden="true"></a></li>-->
  <li >
  	<a href="../shopMng/buyQuery.jsp" target="iframRight">
  		查看商品
  		<span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span>
  	</a>
  </li>
  <li >
  	<a href="../shopMng/userQuery1.jsp" target="iframRight">
  	修改信息
  	<span class="glyphicon glyphicon-tree-deciduous" aria-hidden="true"></span>
  	</a>
  </li>
</ul>

</body>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("li").on("click",function(){
		$(".active").removeClass();
		$(this).addClass("active");
	})
});
</script>
</html>
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
  	  <form action="${pageContext.request.contextPath }/shopQuerySvlt"  name="form" class="form-inline"> 
  	  	
  	 <%--  	<c:if test="${isCondition }"> --%>
  	  	<div class="queryDiv">
	  	  	<div class="form-group">
			  <label >商品价格</label>
			  <input type="text" name="buyPrice" class="form-control"  placeholder="请输入关键字">
			</div>
			<div class="form-group">
			  <label >商品名称</label>
			  <input type="text" name="buyName" class="form-control" >
			</div>
	  		 <button type="submit" class="btn btn-info">查询<span class="glyphicon glyphicon-search" aria-hidden="true"></button>
  		</div>
  		<%-- </c:if> --%>
  		
	   	<table class="table table-striped table-hover myTable">
		  <tr>
			  <td class="active">订单号</td>
			  <td class="success">商品名称</td>
			  <td class="warning">价格</td>
			  <td class="danger">折扣价</td>
			  <td class="dangers">地址</td>
			  <td class="success">操作</td>
			 
		</tr>
		<c:forEach var="shop" items="${rSet }">
		 <tr>
			  <td>${shop.getId() }</td>
			  <td>${shop.getName() }</td>
			  <td>${shop.getPrice() }</td>
			  <td>${shop.getDiscount() }</td>
			  <td>${shop.getAddress() }</td>
			  <td>
				  <a href="${pageContext.request.contextPath }/shopReadSvlt?goodsId=${shop.getId() }&flag=1" class="btn btn-info btn-xs" role="button">详情</a>
				  <a href="${pageContext.request.contextPath }/shopReadSvlt?goodsId=${shop.getId() }&flag=2" class="btn btn-success btn-xs" role="button">修改</a>
				  <a href="${pageContext.request.contextPath }/shopDeleteSvlt?goodsId=${shop.getId() }"  formaction="../GoodsDeleteSvlt"  data-whatever="${shop.getId() }" data-toggle="modal" data-target="#myModal" class="btn btn-default btn-xs" onclick = "btnRst_Click()" role="button">删除</a>
			      <button data-whatever="${shop.getId() }"   data-toggle="modal" data-target="#myModal" class="btn btn-default btn-xs" type="button">删除2</button>
			  </td>
		</tr>
		</c:forEach>
		</table>
	  </form>
  </div>
</div>
<!--模态框（删除功能）  -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">删除商品</h4>
      </div>
      <div class="modal-body">
        <p>确定要删除此商品吗？</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
        <a href="#" type="button" class="btn btn-primary" id="del">删除</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</body>
<script type="text/javascript" src="./jquery/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="./bootstrap-3.3.7-dist/js/bootstrap.js"></script>

<script type="text/javascript">
$('#myModal').on('show.bs.modal', function (event) {
	  var button = $(event.relatedTarget) // Button that triggered the modal
	  var buyId = button.data('whatever') // Extract info from data-* attributes
	  var modal = $(this)
	  //测试用  测试完后注释掉
	  modal.find('.modal-body').text('确定要删除['+shopId+']此商品吗？ ' )
	  modal.find('#del').attr("href","${pageContext.request.contextPath }/shopDeleteSvlt?shopId="+shopId)
	})
  	
</script>

</html>
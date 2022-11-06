<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>在线支付</title>
    <style type="text/css">
    img{
    	wight:200px;
    	height:200px;
    }
    </style>
  </head>
  <body>
        <form action="./shopMng/buySucess.jsp" method="post"> <!--form规定当提交表单时向何处发送表单数据, 意思是当前的数据用post方法传递-->
          <table width="60%">
            <tr>  
                <td bgcolor="#F7FEFF" colspan="4"> <!--colspan 属性规定单元格可横跨的列数。-->
                     订单号：<input TYPE="text" NAME="orderid" placeholder="2">
                     支付金额：<INPUT TYPE="text" NAME="money" size="6" placeholder="78">元
                 </td>
            </tr>
            <tr><td><br/></td></tr>
         </table>
         <img src="./img/支付.jpg">
         <tr>
              <td><button οnclick="myFunction()" id="text1">确定支付</button></td>
            </tr>
      </form>
      
      
    <script src="./jquery/jquery-3.6.0.min.js"></script>       
 <script type="text/javascript">
		$(document).ready(function(){
			$("#text1").bind("click",function(){
				alert("确定支付吗？");
			});
		});
</script>
  </body>
</html>
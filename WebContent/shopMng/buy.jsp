<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <style>
        table{
            border-collapse: collapse;
            width: 1000px;
            margin: 0 auto;
        }
        .title{
            font-size: 14px;
        }
        .face{
            width: 80px;
        }
        .name{
            color: red;
            font-size: 12px;
            display: inline-block;
            width: 200px;
            margin-left: 10px;
        }
        td{
            padding: 10px 0;
            min-width: 60px;
        }
        .price{
            font-weight: bold;
            color: black;
        }
        .totle{
            font-weight: bold;
            color: red;
        }
        tr{
            border: 1px solid #d8d8d8;
            background-color: #f2f2f2;
        }
        .btn button{
            width: 30px;
            height: 30px;
            border-style: none;
            background-color: #e0e0e0;
            outline: none;
        }
        .btn input{
            width: 30px;
            height: 30px;
            border-style: none;
            text-align: center;
        }
    </style>
</head>
<body>
	 <form action="${pageContext.request.contextPath }/orderServlet">
<table>
    <tr class="title">
        <td><input class="ckbox" type="checkbox"/>全选</td>
        <td>商品信息</td>
        <td>单价</td>
        <td>数量</td>
        <td>金额</td>
        <td>操作</td>
    </tr>
    <tr >
        <td><input class="ckbtn" type="checkbox"/></td>
        <td><img align="left" class="face" src="../img/咖1.jpg" alt=""/>
            <span class="name">豫竹香辣牛肉方便面60包 袋装速食干吃面干脆面泡面整箱包邮特价</span>
        </td>
        <td><span class="price" data-price="39.00" name="price">￥39.00</span></td>
        <td class="btn"><button class="btnleft" type="button">-</button><input class="txt" type="text" name="number" value="1"/><button class="btnright"  type="button">+</button></td>
        <td><span class="totle" data-totle="39.00" >￥39.00</span></td>
        <td><button>删除</button></td>
    </tr>
    <tr>
        <td><input type="checkbox" class="ckbox"/>全选</td>
               <td colspan="2">已选商品<span class="number">0</span>&nbsp            剩余商品<span class="number1">1000</span>件</td>
		<td></td>
        <td>合计：<span class="totleprice">0</span>元</td>
       
        <td colspan="2"><button>结算</button></td>
        
    </tr>
</table>
</form>
<script>
	var btnck = document.getElementsByClassName("ckbox");
	var ckall = document.getElementsByClassName("ckbtn");
	var count=0;
	for (var i = 0; i < ckall.length; i++) {
	    ckall[i].onclick = function () {
	       if(this.checked){
	           count++;
	       }
	        else{
	           count--;
	       }
	        if(count==ckall.length)
	        {
	            btnck[0].checked=true;
	            btnck[1].checked=true;
	        }
	        else{
	            btnck[0].checked=false;
	            btnck[1].checked=false;
	        }
	        addtotle();
	    }
	}
	for (var index in btnck) {
	    btnck[index].index = index;
	    btnck[index].onclick = function () {
	        btnck[this.index == 0 ? 1 : 0].checked = !btnck[this.index == 0 ? 1 : 0].checked;
	        if(this.checked)
	        {
	            for (var i = 0; i < ckall.length; i++) {
	                ckall[i].checked = true;
	            }
	        }
	        else{
	            for (var i = 0; i < ckall.length; i++) {
	                ckall[i].checked = false;
	            }
	            count=0;
	        }
	        addtotle();
	    }
	}
	
	var btnleft = document.getElementsByClassName("btnleft");
	var btnright = document.getElementsByClassName("btnright");
	var txt = document.getElementsByClassName("txt");
	var price = document.getElementsByClassName("price");
	var totle = document.getElementsByClassName("totle");
	var tprice = document.getElementsByClassName("totleprice");
	var num=document.getElementsByClassName("number");
	var num1=document.getElementsByClassName("number1");
	for (var i = 0; i < btnleft.length; i++) {
	    btnleft[i].index = i;
	    btnleft[i].onclick = function () {
	        var val = txt[this.index].value;
	        val--;
	        if (val < 1) {
	            val = 1;
	        }
	        txt[this.index].value = val;
	        addprice(this.index, val);
	        addtotle();
	    }
	    btnright[i].index = i;
	    btnright[i].onclick = function () {
	        var val = txt[this.index].value;
	        val++;
	        txt[this.index].value = val;
	        addprice(this.index, val);
	        addtotle();
	    }
	}
	
	function addprice(index, value) {
	    totle[index].innerHTML = "共" + (price[index].getAttribute("data-price") * value).toFixed(2);
	    totle[index].setAttribute("data-totle", (price[index].getAttribute("data-price") * value).toFixed(2));
	}
	
	function addtotle() {
	    var totleprice = 0;
	    var number=0;
		var number1=1000;
	    for (var i = 0; i < ckall.length; i++) {
	        if (ckall[i].checked) {
	            totleprice += parseFloat(totle[i].getAttribute("data-totle"));
	            number+=parseInt(txt[i].value);
	            number1=1000-parseInt(txt[i].value);
	        }
	    }
	    tprice[0].innerHTML = "共" + totleprice.toFixed(2);
	    num[0].innerHTML=number;
	    num1[0].innerHTML=number1;
	}
</script>
</body>
</html>
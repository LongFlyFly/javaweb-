<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
 <style>
        #div1{
            background-color: rgb(228, 223, 223,0.5);
            width: 280px;
            height: 400px;
            border: 1px solid #ccc;
            position: absolute;
            left: 50%;top: 50%;
            margin-left: -150px;
            margin-top: -150px;
            border-radius: 15px;
          }
        .news{text-align: center;background-color: rgb(94, 235, 94,0.7);}
        .z1{display: block;height: 50px;margin-top: 60px;}
        .z2{display: block;height: 50px;}
        .z4{display: block;height: 50px;}
        #z7{display: block;height: 50px;}
        #z7 button{
            background-color:rgb(42, 243, 209);
            height: 40px;
            width: 120px;
            border-radius: 15px;
            }
     div img{width: 100%;
				height: 100%;
			     z-index: -3;
				 position:absolute;
				 background-size:cover;
 				 z-index:-1;}
      </style>
<body>
	<div><img src="./img/背景.jpg"></div>
     <form id="div1" action="LoginServlet">
            <div class="news">
              <h1>解忧饮品店</h1>
            </div>
              <div class="z1">
                  <label >用户账号</label>
                  <input type="text" class="form-control" name="uname" placeholder="请输入您的用户账号"><br>
              </div>
               <div class="z4">
                  <label >用户电话</label>
                  <input type="text" class="form-control" name="tel" placeholder="请输入您的电话号码"><br>
              </div>
              <div class="z2">
                  <label >输入密码</label>
                  <input type="password" class="form-control" name="psw" placeholder="请输入您的用户密码"><br>
              </div>
              <div id="z7" style="text-align: center;">
              <button type="login" class="an">立即登录</button>
               <h4><a href="ADstrator.jsp">管理员登录</a></h4>
              </div>
          </form>
</body>
</html>
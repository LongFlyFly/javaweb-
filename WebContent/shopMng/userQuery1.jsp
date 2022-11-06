<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
        #div1{
            background-color: rgb(48, 243, 9);
            width: 280px;
            height: 300px;
            border: 1px solid #ccc;
            position: absolute;
            left: 50%;top: 50%;
            margin-left: -150px;
            margin-top: -150px;
            border-radius: 15px;
          }
        .z1{display: block;height: 50px;margin-top: 30px;}
        .z2{display: block;height: 50px;}
        .z3{display: block;height: 50px;}
        #z7{display: block;height: 50px;}
        #z7 button{
            background-color:rgb(42, 243, 209);
            height: 40px;
            width: 120px;
            border-radius: 15px;
            }
      </style>
<body>
  <form id="div1" action="${pageContext.request.contextPath }/amendServlet">
              <div class="z1">
                  <label >修改账号</label>
                  <input type="text" class="form-control" name="uname" placeholder="请输入您的用户账号"><br>
              </div>
               <div class="z2">
                  <label >修改电话</label>
                  <input type="tel" class="form-control" name="tel" placeholder="请设置您的电话"><br>
              </div>
              <div class="z2">
                  <label >修改密码</label>
                  <input type="password" class="form-control" name="psw" placeholder="请设置您的用户密码"><br>
              </div>
              <div class="z3">
                  <label >确认密码</label>
                  <input type="password" class="form-control" name="dsw" placeholder="请确认您的用户密码"><br>
              </div> 
              <div id="z7" style="text-align: center;">
                    <button onclick="btn()">立即修改</button>
              </div>
         </form>
</body>
</html>
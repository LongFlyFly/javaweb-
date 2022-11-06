<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>请输入指令</h1>
    <form>
        <input id="input"  type="text" placeholder="请输入指令" />
    </form>
    <button onclick="btn()">进入</button>
   
    <script type="text/javascript">
            function btn(){
                var x=  document.getElementById("input").value //获取输入框元素
                if(x==123){
                    window.location.href="./GuanLiYuan/index.jsp";
                }else{
                    alert("指令错误！")
                }
            }

    </script>
</body>
</html>
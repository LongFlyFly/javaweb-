<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">

			* {
				font-size: 14px;
			}
			
			/*控制main和top的颜色及尺寸，方便调节，后面可以再将背景色去掉*/
			#top {
				width: 1000px;
				height: 220px;
				/* background-color: #87CEEB; */
				margin: 0 auto;/*上下外边距为0，左右自动对齐（居中）*/
			} 
			#main {
				width: 1000px;
				height: 500px;
				/* background-color: #DEB887; */
				margin: 0 auto;
			}
			
			/*a标签标示了超链接，这里采用鼠标Hover显示下划线的效果*/
			#top1 a{
				color: black;/*字体颜色黑色，由于文字都用a标签包裹，这里只能通过a标签精准调节，注意优先级*/
				text-decoration: none;/*下划线去掉*/
			}
			#top1 a:hover{
				text-decoration: underline;/*鼠标放上去显示下划线*/
			}
			
			/*top1的a与top3的a不同这里分别处理*/
			#top3 a{
				color: black;/*字体颜色黑色，由于文字都用a标签包裹，这里只能通过a标签精准调节，注意优先级*/
				text-decoration: none;/*下划线去掉*/
			}
			#top3 a:hover{
				text-decoration: underline;/*鼠标放上去显示下划线*/
			}
			
			/*分配top1、top2和top3全局*/
			#top1{
				height: 30px;
				border-radius: 5px;
				background-color: #888;
				text-indent: 2em;/*文字缩进2字符*/
				line-height: 30px;/*背景框高度是30px，所以这里也是写30，保证居中*/
			}
			#top2{
				height: 100px;
				margin-top: 10px;
			}
			#top3{
				height: 30px;
				border-radius: 5px;
				background-color: #888;
				text-indent: 2em;
				line-height: 30px;
			}
			#top4{
				height: 40px;
				border-radius: 5px;
				border: 1px solid gainsboro;/*实心框线*/
				line-height: 40px;
				text-indent: 2em;
			}
			
			/*主体部分全局控制*/
			#main table p{
				font-size: 12px;
				line-height: 5px; /*控制行间距，也可以直接控制p标签的margin*/
				margin-bottom: 0; /*p标签自带的有外边距，这里需要将底部的margin去除，将外框和该标签底部的间距消除*/
			}
			#main table td{
				border: 1px solid gainsboro;
				padding:10px;/*内边距，图片文字距离父容器的距离*/
				border-radius: 5px;
			}
			#main table button{
				margin-top:10px;
			}
            img{width: 100px;
            height: 100px;}
		</style>
</head>
<body>
   	<!--顶部-->
		<div id="top">
			
			<!--顶部第一部分，高度、圆角、背景色，此外，内部分两个div，一个左浮动，一个右浮动-->
			<div id="top1">
				<div style="float: left;">
					<a>解忧饮品店</a>
				</div>
				<div style="float: right;">
					<a href="#" style="color: red;">首页</a> <a href="../index/index.jsp">个人中心</a> <a href="../shopMng/buy.jsp">购物车</a> <a href="#">收藏夹</a> <a href="../shop/FenLei.jsp">商品分类</a>
					<a href="#">卖家中心</a href="#"> <a href="#">联系客服</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				</div>	
			</div>
		<form action="${pageContext.request.contextPath }/shopQuerySvlt">
			<!--顶部第二部分-->
			<div id="top2">
				<!--分两个div，都向左浮动，搜索框部分注意调整左外边距与顶外边距的距离-->
				<div style="float: left; margin-left: 10px;"> 
					<img src="../img/logo.jpg"/>
				</div>
				<!--搜索框div-->
				<div style="float: left; margin-left: 100px;">
					<!--搜索框和搜索框下面的文字拆分为两个标签部分，由于统一居中，所以这里搜索框需要进行重新定位-->
					<div style="margin-top: 20px;">
						<input type="text" name="search" style="width: 500px; height: 25px; border: 1px solid gray; outline: none; border-radius: 2px;"/>
						<input type="submit" value="搜索"/>
					</div>
					<!--底部文字部分-->
					<div>
						咖啡 气泡水 果汁 牛奶 茶
					</div>
				</div>
			</div>
			
			<!--顶部第三部分，左边相对图片的位置距离20px隔开-->
			<div id="top3">
				您是不是想找：<a href="#">咖啡</a> | <a href="#">气泡水</a> | <a href="#">果汁</a> | <a href="#">牛奶</a> | <a href="#">茶</a> 
			</div>
			
			<!--顶部第四部分-->
			<div id="top4" style="margin-top: 3px;">
				<!--同样分为了两个部分-->
				<div style="float: left;">
					价格： <input type="text" name="price1"/> 
					      <input type="submit" value="搜索"/>
				</div>
			</div>
		</div>
		</form>	
		
		
		<!--主体部分（商品展示，这里使用表格）-->
		<div id="main">
			<!--表格，宽度与浏览器宽度一致，列控制每列的宽度，复制后自适应数量-->
			<table width="100%">
				<!--两行五列-->
				<tr align="center">
					<td>
						<img src="../img/咖2.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 26 拿铁</p>
						<p>冬天里的第一杯温暖</p>
						<p style="color: gray;">送给你，温暖我</p>
						<a href="../index/index.jsp"><button style="color: red;" align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/咖8.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 22 雀巢</p>
						<p>你的心情</p>
						<p style="color: gray;">喜上眉梢</p>
					<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/奶4.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 33 果冻三剑客</p>
						<p>酸奶的味道</p>
						<p style="color: gray;">喝了才知道</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/奶6.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 20 大拼盘</p>
						<p>你想要的水果酸奶</p>
						<p style="color: gray;">我都有</p>
						<a href="../index/index.jsp"><button style="color: red;" align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/果1.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 12 鲜橙多汁</p>
						<p>不一样的品牌</p>
						<p style="color: gray;">不一样的味道</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
				</tr>
				<tr align="center">
					<td>
						<img src="../img/果8.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 26 水果大聚会</p>
						<p>再看，再看</p>
						<p style="color: gray;">我就喝了你</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气3.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 15 蜜桃四季春</p>
						<p>不仅好看</p>
						<p style="color: gray;">而且好喝</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气7.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 13 绿野仙踪</p>
						<p>最好的气泡水</p>
						<p style="color: gray;">只给有缘人喝</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/茶4.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 40 绿茶</p>
						<p>好茶喝</p>
						<p style="color: gray;">品好茶</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/茶9.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 47 茉莉花茶</p>
						<p>最好的茉莉</p>
						<p style="color: gray;">滋养最具香气的茶叶</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
				</tr>		
			</table>
		</div>
</body>
</html>
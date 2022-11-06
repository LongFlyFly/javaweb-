<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
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
<div id="main">
			<!--表格，宽度与浏览器宽度一致，列控制每列的宽度，复制后自适应数量-->
			<table width="100%">
				<!--两行五列-->
				<tr align="center">
					<td>
						<img src="../img/气1.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 26  蓝莓气泡</p>
						<p>夏日里里的第一杯</p>
						<p style="color: gray;">透心凉，心飞扬</p>
						<a href="../index/index.jsp"><button style="color: red;" align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气2.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 12  草莓气泡</p>
						<p>你的心情</p>
						<p style="color: gray;">喜上眉梢</p>
					<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气3.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 13 蜜桃气泡</p>
						<p>蜜桃的味道</p>
						<p style="color: gray;">喝了才知道</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气4.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 20  绿野仙踪</p>
						<p>最好的气泡水</p>
						<p style="color: gray;">只给有缘人喝</p>
						<a href="../index/index.jsp"><button style="color: red;" align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气5.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 12  葡萄气泡</p>
						<p>不一样的品牌</p>
						<p style="color: gray;">不一样的味道</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
				</tr>
				<tr align="center">
					<td>
						<img src="../img/气6.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 26 柚子气泡</p>
						<p>再看，再看</p>
						<p style="color: gray;">我就喝了你</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气7.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 15 柠檬气泡</p>
						<p>不仅好看</p>
						<p style="color: gray;">而且好喝</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气8.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 13 双子杯</p>
						<p>兄弟情</p>
						<p style="color: gray;">双子杯</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气9.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 14  双分天下</p>
						<p>好喝</p>
						<p style="color: gray;">品好</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
					<td>
						<img src="../img/气10.jpg" width="150px"/><br/>
						<!--&yen表示人民币-->
						<p style="color: orange;">&yen 17 果粒气泡</p>
						<p>丰富果粒</p>
						<p style="color: gray;">聚气会神</p>
						<a href="../index/index.jsp"><button style="color: red;"align="right">购买</button></a>
					</td>
				</tr>		
			</table>
		</div>
</body>
</html>
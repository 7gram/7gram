<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="/7gram/css/main.css">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<section>
	<article id="main_c">
		<div class="content" style="width:650px;height:450px;overflow:hidden; margin:50px auto;">
		<div>
			<fieldset style="width:800px; height: 200px; margin: 0px auto;">슬라이드 사진영역</fieldset>
		</div>
		
		<div id="slider">
			<a href=""><img alt="" src="/7gram/img/1.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/2.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/3.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/4.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/5.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/6.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/7.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/8.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/9.jpg"></a>
			<a href=""><img alt="" src="/7gram/img/10.jpg"></a>
		</div>
		</div>
		<script src="vmc.slider.full.js"></script>
<script>
$('#slider').vmcSlider({
		width: 600,
		height: 450,
		gridCol: 10,
		gridRow: 5,
		gridVertical: 20,
		gridHorizontal: 10,
		autoPlay: true,
		ascending: true,
		effects: [
			'fade', 'fadeLeft', 'fadeRight', 'fadeTop', 'fadeBottom', 'fadeTopLeft', 'fadeBottomRight',
			'blindsLeft', 'blindsRight', 'blindsTop', 'blindsBottom', 'blindsTopLeft', 'blindsBottomRight',
			'curtainLeft', 'curtainRight', 'interlaceLeft', 'interlaceRight', 'mosaic', 'bomb', 'fumes'
		],
		ie6Tidy: false,
		random: true,
		duration: 2000,
		speed: 900
	});
</script>
	</article>
</section>
<%@include file="footer.jsp" %>
</body>
</html>
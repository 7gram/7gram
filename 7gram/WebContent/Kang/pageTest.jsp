<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>
<link rel="stylesheet" type="text/css" href="/7gram/css/jquery.fullPage.css">

<script src="/7gram/js/jquery.fullPage.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="fullpage">
	<section class="section">
		<h2>하이</h2>
	</section>
	
	<section class="section">
		<h2>바이</h2>
	</section>
	
	<section class="section">
		<h2>헤이</h2>
	</section>
</div>
</body>
<script>
		$(document).ready(function() {
			$('#fullpage').fullpage({
				sectionsColor: ['#14b0bf', '#0172BD', '#58D3F7'],
				scrollBar: true
			});
		});
	</script>
</html>
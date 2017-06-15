<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
<style>
#view {
	perspective: 500px;
	width: 200px;
	height: 200px;
	margin: 200px auto;
	perspective-origin: 250px -50px;
}

@keyframes scroll { 100%{
	transform: rotate3d(1, 1, 1, 360deg);
}

}
#cube {
	position: relative;
	width: 200px;
	height: 200px;
	animation: scroll 2s linear 7s infinite;
	transform-style: preserve-3d;
}

.item {
	width: 200px;
	height: 200px;
	border: 1px solid black;
	background-color: #BBFFFF ;
	font-size: 150px;
	text-align: center;
	opacity: 0.5;
	position: absolute;
}

@keyframes item1 { 100%{
	transform: rotateY(-90deg);
}

}
#item1 {
	z-index: 6;
	transform-origin: left;
	animation: item1 1s linear 1s both;
}

@keyframes item2 { 100%{
	transform: rotateY(90deg);
}

}
#item2 {
	z-index: 5;
	transform-origin: right;
	animation: item2 1s linear 2s both;
}

@keyframes item3 { 100%{
	transform: rotateX(90deg);
}

}
#item3 {
	z-index: 4;
	transform-origin: top;
	animation: item3 1s linear 3s both;
}

@keyframes item4 { 100%{
	transform: rotateX(-90deg);
}

}
#item4 {
	z-index: 3;
	transform-origin: bottom;
	animation: item4 1s linear 4s both;
}

@keyframes item5 { 100%{
	transform: translateZ(200px);
}

}
#item5 {
	z-index: 2;
	animation: item5 1s linear 5s both;
}

@keyframes item6 { 100%{
	transform: rotateY(180deg);
}

}
#item6 {
	z-index: 1;
	animation: item6 1s linear 6s both;
}
body {
			margin:0px;
			 width:100%;
			 height:100%;

            background: linear-gradient(to bottom left, orange, blue);
}
</style>
</head>
<body>
	<div id="view">
		<div id="cube">
			<div class="item" id="item1">*</div>
			<div class="item" id="item2">*</div>
			<div class="item" id="item3">*</div>
			<div class="item" id="item4">*</div>
			<div class="item" id="item5">*</div>
			<div class="item" id="item6">*</div>
		</div>
	</div>


	<center>
		<audio controls> 
			<source src="audio/music.mp3" type="audio/mpeg" /> 
			<source src="audio/music.wav" type="audio/wav" />
		</audio>
	</center>
</body>
</html>
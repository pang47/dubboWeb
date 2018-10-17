<html>
<head>
	<title>success</title>
</head>
<script type="text/javascript">
	function fun(n,o){
		console.log(o);
		return {
			fun:function(m){
				return fun(m,n);
			}
		};
		
	}
	
	var a = fun(0);a.fun(1);a.fun(2);a.fun(3);
</script>
<body>
<h2>Hello World!</h2>
</body>
</html>

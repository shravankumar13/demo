<head>
<script type="text/javascript">
function m1()
{
var n=document.f1.eno.value;
if(n=="enter eno")
document.f1.eno.value=" ";
}
function m2()
{
var n=document.f1.eno.value;
if(n==" ")
document.f1.eno.value="enter eno";
}

function validate(){
var a=document.f1.eno.value;
if(a=="enter eno")
alert("enter valid number");
else
alert("please select search button");
}
</script>
</head>
<body>
<form action="retrieve.do" name="f1">
<center>
<u>Employee information</u><br>
Emp number<br>
<input type="text" name="eno" value="enter eno" onFocus="m1()" onBlur="m2()"> 
<input type="button" value="validate" onClick="validate()"/>
<input type="submit" value="search" />
</center>
</form>
</body>
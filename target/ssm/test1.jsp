<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="//cdn.bootcss.com/jquery/3.2.1/jquery.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--左侧菜单栏-->
    <div class="sidebar-nav">
        <ul>
            <li id="li-one" class="active nav-header collapsed" data-toggle="collapse">首页</li>
            <!-- 根据data-target关联你的子列表 -->
            <li data-target=".premium-menu" data-toggle="collapse" class="nav-header collapsed">列表一</li>
                <li>
                    <ul class="premium-menu nav nav-list collapse">
                        <li id="li-two">    子列表-</li>
                        <li id="li-three">  子列表二</li>
                        <li id="li-four">   子列表三</li>
                        <li id="li-five">   子列表四</li>
                        <li id="li-six">    子列表五</li>
                        <li id="li-seven">  子列表六</li>
                    </ul>
                </li>
            <li id="li-eight" class="nav-header collapsed" data-toggle="collapse">列表二</li>
            <li id="li-nine" class="nav-header collapsed" data-toggle="collapse">列表三</li>
            <li id="li-ten" class="nav-header collapsed" data-toggle="collapse">列表四</li>
            <li id="li-eleven" class="nav-header collapsed" data-toggle="collapse">列表五</li>
        </ul>
    </div>
    
   <!--右侧主体内容 用bootstrap的content类包含在一起-->
    <div class="content">
        <div id="matter1" >
            <!--引入外部文件，即需要在右侧加载的内容-->
            <jsp:include page="test2.jsp"/>
        </div>

        <div id="matter2" style="display: none">
            <jsp:include page="test3.jsp"/>
        </div>

        <!--
            ...........中间的都一样的，只不过加载的文件不一样而已
        -->
        <div id="matter10" style="display: none">
            <jsp:include page="test2.jsp"/>
        </div>

        <div id="matter11" style="display: none">
            <jsp:include page="test2.jsp"/>
        </div>
    </div>
    
    	
	</body>


</body>

	
	<script>
		$(function(){
			var temp = "none";
   alert(temp);
    $("#li-one").click(function () {
    	
    	alert("ssss1");
        openMatter(1);
    });
    $("#li-two").click(function () {
        openMatter(2);
    });
    $("#li-three").click(function () {
        openMatter(3);
    });
    $("#li-four").click(function () {
        openMatter(4);
    });
    $("#li-five").click(function () {
        openMatter(5);
    });
    $("#li-six").click(function () {
        openMatter(6);
    });
    $("#li-seven").click(function () {
        openMatter(7);
    });
    $("#li-eight").click(function () {
        openMatter(8);
    });
    $("#li-nine").click(function () {
        openMatter(9);
    });
    $("#li-ten").click(function () {
        openMatter(10);
    });
    $("#li-eleven").click(function () {
        openMatter(11);
    });
    function openMatter(obj) {
        for (var i = 1; i < 12; i++) {
            if (i == obj) {
                temp = "block";
            } else {
                temp = "none";
            }
          //document.getElementById("matter" + i).style.display = temp;
			$('#matter'+i).css('display',temp);
        }
    }
});
</script>
</html>
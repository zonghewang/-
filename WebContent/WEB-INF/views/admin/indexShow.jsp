<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<shiro:hasPermission name="首页展示">
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>首页</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico"> <link href="${pageContext.request.contextPath}/resources/lib/hplus/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/lib/hplus/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <!-- Morris -->
    <link href="${pageContext.request.contextPath}/resources/lib/hplus/css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">

    <!-- Gritter -->
    <link href="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/gritter/jquery.gritter.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/resources/lib/hplus/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/lib/hplus/css/style.min.css?v=4.0.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content">
        <div class="row">
            <div class="col-sm-6">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <span class="label label-success pull-right">总计</span>
                        <h5>员工数</h5>
                    </div>
                    <div class="ibox-content">
                        <h1 class="no-margins">${employeeNum}</h1>
                        <div class="stat-percent font-bold text-success">
<!--                         <i class="fa fa-bolt"></i> -->
                        </div>
                        <small>人</small>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <span class="label label-info pull-right">总计</span>
                        <h5>商品总数</h5>
                    </div>
                    <div class="ibox-content">
                        <h1 class="no-margins">${productNum}</h1>
                        <div class="stat-percent font-bold text-info"> 
<!--                         <i class="fa fa-level-up"></i> -->
                        </div>
                        <small>件</small>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <span class="label label-primary pull-right">总计</span>
                        <h5>顾客总数</h5>
                    </div>
                    <div class="ibox-content">
                        <h1 class="no-margins">${customerNum}</h1>
                        <div class="stat-percent font-bold text-navy"> 
<!--                         <i class="fa fa-level-up"></i> -->
                        </div>
                        <small>人</small>
                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <span class="label label-danger pull-right">总计</span>
                        <h5>总金额</h5>
                    </div>
                    <div class="ibox-content">
                        <h1 class="no-margins">${pricesNum/100}</h1>
                        <div class="stat-percent font-bold text-danger">
<!--                         <i class="fa fa-level-down"></i> -->
                        </div>
                        <small>元</small>
                    </div>
                </div>
            </div>
        </div>
 </div>

    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/bootstrap.min.js?v=3.3.5"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/flot/jquery.flot.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/flot/jquery.flot.tooltip.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/flot/jquery.flot.spline.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/flot/jquery.flot.resize.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/flot/jquery.flot.pie.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/flot/jquery.flot.symbol.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/peity/jquery.peity.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/demo/peity-demo.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/content.min.js?v=1.0.0"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/jquery-ui/jquery-ui.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/easypiechart/jquery.easypiechart.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/sparkline/jquery.sparkline.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/lib/hplus/js/demo/sparkline-demo.min.js"></script>
    <script>
        $(document).ready(function(){$(".chart").easyPieChart({barColor:"#f8ac59",scaleLength:5,lineWidth:4,size:80});$(".chart2").easyPieChart({barColor:"#1c84c6",scaleLength:5,lineWidth:4,size:80});var data2=[[gd(2012,1,1),7],[gd(2012,1,2),6],[gd(2012,1,3),4],[gd(2012,1,4),8],[gd(2012,1,5),9],[gd(2012,1,6),7],[gd(2012,1,7),5],[gd(2012,1,8),4],[gd(2012,1,9),7],[gd(2012,1,10),8],[gd(2012,1,11),9],[gd(2012,1,12),6],[gd(2012,1,13),4],[gd(2012,1,14),5],[gd(2012,1,15),11],[gd(2012,1,16),8],[gd(2012,1,17),8],[gd(2012,1,18),11],[gd(2012,1,19),11],[gd(2012,1,20),6],[gd(2012,1,21),6],[gd(2012,1,22),8],[gd(2012,1,23),11],[gd(2012,1,24),13],[gd(2012,1,25),7],[gd(2012,1,26),9],[gd(2012,1,27),9],[gd(2012,1,28),8],[gd(2012,1,29),5],[gd(2012,1,30),8],[gd(2012,1,31),25]];var data3=[[gd(2012,1,1),800],[gd(2012,1,2),500],[gd(2012,1,3),600],[gd(2012,1,4),700],[gd(2012,1,5),500],[gd(2012,1,6),456],[gd(2012,1,7),800],[gd(2012,1,8),589],[gd(2012,1,9),467],[gd(2012,1,10),876],[gd(2012,1,11),689],[gd(2012,1,12),700],[gd(2012,1,13),500],[gd(2012,1,14),600],[gd(2012,1,15),700],[gd(2012,1,16),786],[gd(2012,1,17),345],[gd(2012,1,18),888],[gd(2012,1,19),888],[gd(2012,1,20),888],[gd(2012,1,21),987],[gd(2012,1,22),444],[gd(2012,1,23),999],[gd(2012,1,24),567],[gd(2012,1,25),786],[gd(2012,1,26),666],[gd(2012,1,27),888],[gd(2012,1,28),900],[gd(2012,1,29),178],[gd(2012,1,30),555],[gd(2012,1,31),993]];var dataset=[{label:"订单数",data:data3,color:"#1ab394",bars:{show:true,align:"center",barWidth:24*60*60*600,lineWidth:0}},{label:"付款数",data:data2,yaxis:2,color:"#464f88",lines:{lineWidth:1,show:true,fill:true,fillColor:{colors:[{opacity:0.2},{opacity:0.2}]}},splines:{show:false,tension:0.6,lineWidth:1,fill:0.1},}];var options={xaxis:{mode:"time",tickSize:[3,"day"],tickLength:0,axisLabel:"Date",axisLabelUseCanvas:true,axisLabelFontSizePixels:12,axisLabelFontFamily:"Arial",axisLabelPadding:10,color:"#838383"},yaxes:[{position:"left",max:1070,color:"#838383",axisLabelUseCanvas:true,axisLabelFontSizePixels:12,axisLabelFontFamily:"Arial",axisLabelPadding:3},{position:"right",clolor:"#838383",axisLabelUseCanvas:true,axisLabelFontSizePixels:12,axisLabelFontFamily:" Arial",axisLabelPadding:67}],legend:{noColumns:1,labelBoxBorderColor:"#000000",position:"nw"},grid:{hoverable:false,borderWidth:0,color:"#838383"}};function gd(year,month,day){return new Date(year,month-1,day).getTime()}var previousPoint=null,previousLabel=null;$.plot($("#flot-dashboard-chart"),dataset,options);var mapData={"US":298,"SA":200,"DE":220,"FR":540,"CN":120,"AU":760,"BR":550,"IN":200,"GB":120,};$("#world-map").vectorMap({map:"world_mill_en",backgroundColor:"transparent",regionStyle:{initial:{fill:"#e4e4e4","fill-opacity":0.9,stroke:"none","stroke-width":0,"stroke-opacity":0}},series:{regions:[{values:mapData,scale:["#1ab394","#22d6b1"],normalizeFunction:"polynomial"}]},})});
    </script>
</body>

</html>
</shiro:hasPermission>
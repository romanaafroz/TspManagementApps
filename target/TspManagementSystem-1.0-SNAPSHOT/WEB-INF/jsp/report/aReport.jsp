
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
<!--<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">-->
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Report Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Report</li>
        </ul>
    </div>	
    <!--Card--> 
    <br>

    <h1><center>Asset Report</center></h1>
    <!-- Card -->

    <div class="row">
        <div class="col-md-6 col-lg-4 col-xl-4 col-sm-6 col-12">
            <div class="widget-card widget-bg1">					 
                <div class="wc-item">
                    <h4 class="wc-title">
                        Total Buying Cost
                    </h4>
                    <span class="wc-des">
                        All Product Value
                    </span>
                    <span class="wc-stats">
                        <span class="counter">
                            <h1 id="earning" class="mr-2 text-white">${map.buyingCost}</h1>
                            <!--<p class="text-center">TK</p>-->
                        </span>
                    </span>		
                    <div class="progress wc-progress">
                        <div class="progress-bar" role="progressbar" style="width: 78%;" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <span class="wc-progress-bx">
                        <span class="wc-change">
                            Change
                        </span>
                        <span class="wc-number ml-auto">
                            78%
                        </span>
                    </span>
                </div>				      
            </div>
        </div>
        <div class="col-md-6 col-lg-4 col-xl-4 col-sm-6 col-12">
            <div class="widget-card widget-bg2">					 
                <div class="wc-item">
                    <h4 class="wc-title">
                        Total Service Cost
                    </h4>
                    <span class="wc-des">
                        Service Review
                    </span>
                    <span class="wc-stats counter">
                      <h1 id="earning" class="mr-2 text-white">${map.serviceCost}</h1>
                    </span>		
                    <div class="progress wc-progress">
                        <div class="progress-bar" role="progressbar" style="width: 88%;" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <span class="wc-progress-bx">
                        <span class="wc-change">
                            Change
                        </span>
                        <span class="wc-number ml-auto">
                            88%
                        </span>
                    </span>
                </div>				      
            </div>
        </div>

        <div class="col-md-6 col-lg-4 col-xl-4 col-sm-6 col-12">
            <div class="widget-card widget-bg4">					 
                <div class="wc-item">
                    <h4 class="wc-title">
                        Total Cost
                    </h4>
                    <span class="wc-des">
                        Cost Review
                    </span>
                    <span class="wc-stats counter">
                       <h1 id="earning" class="mr-2 text-white">${map.totalCost}</h1>
                    </span>		
                    <div class="progress wc-progress">
                        <div class="progress-bar" role="progressbar" style="width: 90%;" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <span class="wc-progress-bx">
                        <span class="wc-change">
                            Change
                        </span>
                        <span class="wc-number ml-auto">
                            90%
                        </span>
                    </span>
                </div>				      
            </div>
        </div>
    </div>
    <!-- Card END -->
    <br><br>

    <div class="row">
        <div class="col-lg-12 col-12">
            <table id="aTable" class="border border-dark">
                <thead class="border border-dark widget-bg2">
                    <tr class="text-center border border-dark">
                        <th class="border border-dark text-white">Product Name</th>
                        <th class="border border-dark text-white">Buying Cost</th>
                        <th class="border border-dark text-white">Service Cause</th>
                        <th class="border border-dark text-white">Service Cost</th>
                        <th class="border border-dark text-white">Total Cost</th>                       
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="a" items="${map.aList}">
                        <tr class="text-center border border-dark">
                            <td class="text-center border border-dark">${a.productName}</td>
                            <td class="text-center border border-dark">${a.buyingCost}</td>
                            <td class="text-center border border-dark">${a.serviceCause}</td>
                            <td class="text-center border border-dark">${a.serviceCost}</td>
                            <td class="text-center border border-dark">${a.totalCost}</td>                      
                        </tr>
                    </c:forEach>
                </tbody>               
            </table>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />



<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<!--<script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>-->
<script>
//    $(document).ready(function () {
//        $('#aTable').DataTable();
//    });

    $(function () {
        $("#aTable").dataTable();
    });
</script>
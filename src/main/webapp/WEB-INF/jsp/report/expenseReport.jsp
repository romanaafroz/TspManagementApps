<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
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
<h1><center>Expense Report</center></h1>
    
    <!-- Card -->
     
<!--        <div class="row">
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
                            $<span class="counter">18</span>M 
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
                            120 
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
                            350 
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
        </div>-->
        <!-- Card END -->
    <br><br>
    <div class="row">
        <div class="col-12">
            <table id="myTable2" class="border border-dark">
                <thead class="border border-dark widget-bg2">
                    <tr class="text-center border border-dark text-white">                       
                        <th class="border border-dark text-white">Electricity Bills</th>
                        <th class="border border-dark text-white">Internet Bills</th>
                        <th class="border border-dark text-white">Water Bills</th>
                        <th class="border border-dark text-white">Rent</th>
                        <th class="border border-dark text-white">Tax</th>
                        <th class="border border-dark text-white">Others</th>
                        <th class="border border-dark text-white">Total Amount</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.exList}" var="e" >
                        <tr class="text-center border border-dark">
                            <td class="text-center border border-dark">${e.electricityBills}</td>
                            <td class="text-center border border-dark">${e.internetBills}</td>
                            <td class="text-center border border-dark">${e.waterBills}</td>
                            <td class="text-center border border-dark">${e.rent}</td>
                            <td class="text-center border border-dark">${e.tax}</td>
                            <td class="text-center border border-dark">${e.others}</td>
                            <td class="text-center border border-dark">${e.total}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />


<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>
    $(function () {
        $("#myTable2").dataTable();
    });
</script>

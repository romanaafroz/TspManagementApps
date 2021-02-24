<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<!--Main container start -->

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title"> Accounting Dashboard</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Profit Report</li>
        </ul>
    </div>	
    <!-- Card -->

    <div class="row">

        <div class="col-12"> 
            <form action="/profit/save" method="post">
                <div class="bg-white">					 
                    <!--<input type="hidden" id="daily" name="daily"/>-->
                    <h2 class="text-black"><center>Profit Report</center></h2>
                    <!--<button class="btn btn-info"><a href="/payment/payCreate" class="text-white">New Add</a></button><br><br>-->
                    <table class="table table-bordered table-striped">
                        <thead class="bg-info border border-dark widget-bg2">
                            <tr class="text-center">
                                <th class="text-white">Profit ID</th>
<!--                                <th class="text-white">Daily Expense</th>
                                <th class="text-white">Monthly Expense</th>
                                <th class="text-white">yearly Expense</th>-->
                                <th class="text-white">Total Eearing Amount</th>                          
                                <th class="text-white">Total Expense Amount</th>
                                <th class="text-white">Total Profit Amount</th> 
                            </tr>
                        </thead>
                        <tbody>
                           
                                <tr >
                                    <td>1</td>
<!--                                    <td id="earning">${map.earning}</td>
                                    <td id="expense">${map.expense}</td>-->
                                    <td id="profit"></td>
                        <label id="earning">${map.earning}</label>
                        <input type="text" id ="pro"/>
                                  
                                </tr>
                          
                        </tbody>
                    </table>

                </div>
            </form>
        </div>
    </div>
</div>


<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />
<script>
    $( document ).ready(function() {
        var earning = $("#earning").text();
        var expense = $("#expense").text();
        var profit = (parseInt(earning) - parseInt(expense));
        $("#profit").text(earning);
        $("#pro").text(earning);
});
</script>
<script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<!--Main container start -->

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title"> Expense Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Expense</li>
        </ul>
    </div>	
    <!-- Card -->

    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-11"> 

            <div class="bg-white">					 

                <h2 class="text-black"><center>View Expense</center></h2>
                <button class="btn btn-info"><a href="/expense/create" class="text-white"> + Create New Expense</a></button><br><br>
                <table class="table table-bordered table-striped">
                    <thead class="bg-info border border-dark widget-bg2">
                        <tr class="text-center">
                            <th class="text-white text-center"> #ID</th>
                            <th class="text-white text-center">Electricity Bills</th>
                            <th class="text-white text-center">Internet Bills</th>
                            <th class="text-white text-center">Water Bills</th>
                            <th class="text-white text-center">Rent</th>
                            <th class="text-white text-center">Tax</th>
                            <th class="text-white text-center">Others</th>
                            <th class="text-white text-center">Total</th>
                            <th class="text-white text-center">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="e" items="${map.eList}">
                            <tr class="text-center">
                                <td class="text-center">${e.exId}</td>
                                <td class="text-center">${e.electricityBills}</td>
                                <td class="text-center">${e.internetBills}</td>
                                <td class="text-center">${e.waterBills}</td>
                                <td class="text-center">${e.rent}</td>
                                <td class="text-center">${e.tax}</td>
                                <td class="text-center">${e.others}</td>
                                <td class="text-center">${e.total}</td>
                                <td class="text-center">
                                    <button class="btn btn-primary"><a href="/expense/edit/${e.exId}" style="color: green" class="text-blue">Edit</a></button>
                                    <button class="btn btn-danger"><a href="/expense/delete/${e.exId}" style="color: red" class="text-red">Delete</a></button>
                                </td>
                            </tr>
                        </c:forEach>
                        <!--${map.total}-->
                    </tbody>
                </table>
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-lg-7">

                        </div>
                        <div class="col-lg-5">
                            Total Amount:<input type="text" value="${map.total}" class="col-sm-5 py-2"/> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />
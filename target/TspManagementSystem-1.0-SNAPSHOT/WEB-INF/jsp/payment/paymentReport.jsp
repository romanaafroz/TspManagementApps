<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<!--Main container start -->

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title"> Payment Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Payment </li>
        </ul>
    </div>	
    <!-- Card -->

    <div class="row">

        <div class="col-12"> 

            <div class="bg-white">					 

                <h2 class="text-black"><center>Payment Report</center></h2>
                <!--<button class="btn btn-info"><a href="/payment/payCreate" class="text-white">New Add</a></button><br><br>-->
                <table class="table table-bordered table-striped">
                    <thead class="bg-info border border-dark widget-bg2">
                        <tr class="text-center">
                            <th class="text-white">Payment ID</th>
                            <!--                            <th class="text-white">Card Type</th>
                                                        <th class="text-white">Expire Date</th>
                                                        <th class="text-white">Card No</th>
                                                        <th class="text-white">CVC No</th>-->
                            <th class="text-white">Trainee Name</th>
                            <th class="text-white">Course</th>
                            <th class="text-white">Code</th>
                            <th class="text-white">Round</th>
                            <th class="text-white">Batch</th>
                            <th class="text-white">Email</th>

                            <!--<th class="text-white">Total Trainee</th>-->
                            <th class="text-white"> Amount</th>
                            <!--<th class="text-white">Total Amount</th>-->
                            <th class="text-white">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="e" items="${map.payList}">
                            <tr >
                                <td>${e.payId}</td>
<!--                                <td>${e.cardType}</td>
                                <td>${e.expireDate}</td>
                                <td>${e.cardNo}</td>
                                <td>${e.cvcNo}</td>-->
                                <td>${e.tName}</td>
                                <td>${e.cName}</td>
                                <td>${e.code}</td>
                                <td>${e.round}</td>
                                <td>${e.batch}</td>
                                <td>${e.email}</td>
                                <!--<td>${e.totalTrainee}</td>-->
                                <td>${e.payAmount}</td>
                                <!--<td>${e.totalAmount}</td>-->
                                <td>
                                    <button class="btn btn-primary"><a href="/payment/edit/${e.payId}" style="color: green" class="text-blue">Edit</a></button>
                                    <button class="btn btn-danger"><a href="/payment/delete/${e.payId}" style="color: red" class="text-red">Delete</a></button>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-lg-8">

                        </div>
                        <div class="col-lg-4">
                            Total Amount:<input type="text" value="${map.total}" class="col-sm-5 py-2"/> 
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>


<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />
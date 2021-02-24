<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<!--Main container start -->

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Asset Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Asset</li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-11 col-12">
            <div class="bg-white">					 
                <h2 class="text-black"><center>View Asset</center></h2>
                <button class="btn btn-info"><a href="/asset/create" class="text-dark"> + New Create Asset</a></button><br><br>
                <table class="table table-bordered table-striped">
                    <thead class="bg-info border border-dark widget-bg2">
                        <tr class="align-content-center">
                            <th class="text-white">Id</th>
                            <th class="text-white">Product Name</th>
                            <th class="text-white">Buying Cost</th>
                            <th class="text-white"> Service Cause</th>
                            <th class="text-white">Service Cost</th>
                            <th class="text-white">Total Cost</th>
                            <th class="text-white">Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="a" items="${map.aList}">
                            <tr >
                                <td>${a.assetId}</td>
                                <td>${a.productName}</td>
                                <td>${a.buyingCost}</td>
                                <td>${a.serviceCause}</td>
                                <td>${a.serviceCost}</td>
                                <td>${a.totalCost}</td>
                                <td>
                                    <button class="btn btn-primary"><a href="/asset/edit/${a.assetId}" style="color: green" class="text-primary">Edit</a></button>
                                    <button class="btn btn-danger"><a href="/asset/delete/${a.assetId}" style="color: red" class="text-red">Delete</a></button>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-lg-7">

                        </div>
                        <div class="col-lg-4">
                            Total Amount:<input type="text" value="${map.totalCost}" class="col-sm-5 py-2"/> 
                        </div>
                        <div class="col-lg-2">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />






<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<!--Main container start -->

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title"> Accounting Dashboard</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Update Asset </li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6 col-12">
            <div class="bg-white">
                
                <h2 class="text-black"><center>Update Asset</center></h2>
                <form action="/asset/update" method="post" class="widget-card widget-bg2">
                    <label for="assetId">Asset Id:</label>
                    <input type="text" class="form-control" id="assetId" placeholder="Enter Id" name="assetId" value="${a.assetId}">
                    <label for="productName">Product Name:</label>
                    <input type="text" class="form-control" id="productName" placeholder="Enter Product Name" name="productName" value="${a.productName}">
                     <label for="buyingCost">Buying Cost:</label>
                    <input type="text" class="form-control" id="buyingCost" placeholder="Enter Buying Cost" name="buyingCost" value="${a.buyingCost}">
                    <label for="serviceCause">Service Cause:</label>
                    <input type="text" class="form-control" id="serviceCause" placeholder="Enter Service Cause" name="serviceCause" value="${a.serviceCause}">
                    <label for="serviceCost">Service Cost:</label>
                    <input type="text" class="form-control" id="serviceCost" placeholder="Enter Service Cost" name="serviceCost" value="${a.serviceCost}">
                    <label for="totalCost">Total Cost:</label>
                    <input type="text" class="form-control" id="totalCost" placeholder="Enter Total Cost" name="totalCost" value="${a.totalCost}">
                    <button type="submit" class="btn btn-primary">Update</button>
                </form>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />





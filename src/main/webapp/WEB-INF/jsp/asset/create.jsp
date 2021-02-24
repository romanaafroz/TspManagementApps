<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<!--Main container start -->

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title"> Accounting Dashboard</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li> Create Asset </li>
        </ul>
    </div>	
    <!-- Card -->
    <p><center>${map.status}</center></p>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6 col-12">
            <div class="widget-card widget-bg2">					 

                <h2 class="text-white"><center>Add Asset</center></h2>
                <form action="/asset/save" method="post">
                    <label for="productName">Product Name:</label>
                    <input type="text" class="form-control" id="productName" placeholder="Enter Product Name" name="productName">
<!--                    <label for="price">Price:</label>
                    <input type="text" class="form-control" id="price" placeholder="Enter Price" name="price">-->
                    <label for="buyingCost">Buying Cost:</label>
                    <input type="text" class="form-control" id="buyingCost" placeholder="Enter Buying Cost" name="buyingCost">
                    <label for="serviceCause">Service Cause:</label>
                    <input type="text" class="form-control" id="price" placeholder="Enter Service Cause" name="serviceCause">
                    <label for="serviceCost">Service Cost:</label>
                    <input type="text" class="form-control" id="serviceCost" placeholder="Enter Service Cost" name="serviceCost">
                    <label for="totalCost">Total Cost:</label>
                    <input type="text" class="form-control" id="totalCost" placeholder="Enter Total Cost" name="totalCost">
                    <button type="submit" class="btn btn-primary">Submit</button>
                     <button class="btn btn-primary"><a href="/asset/view" class="text-dark">View</a></button>
                </form>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />
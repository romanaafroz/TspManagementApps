
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<p><center>${map.status}</center></p>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6 border border-dark bg-gray">
            <h2><center>Add Asset</center></h2>
            <form action="/asset/save" method="post">
                <label for="productName">Product Name:</label>
                <input type="text" class="form-control" id="productName" placeholder="Enter Product Name" name="productName">
                <label for="price">Price:</label>
                <input type="text" class="form-control" id="price" placeholder="Enter Price" name="price">
                <label for="buyingCost">Buying Cost:</label>
                <input type="text" class="form-control" id="buyingCost" placeholder="Enter Buying Cost" name="buyingCost">
                <label for="cause">Cause:</label>
                <input type="text" class="form-control" id="price" placeholder="Enter Cause" name="cause">
                <label for="serviceCost">Service Cost:</label>
                <input type="text" class="form-control" id="serviceCost" placeholder="Enter Service Cost" name="serviceCost">
                <label for="totalCost">Total Cost:</label>
                <input type="text" class="form-control" id="totalCost" placeholder="Enter Total Cost" name="totalCost">
                <button type="submit" class="btn btn-primary">Submit</button>
<!--                <a href="/asset/view" class="btn-button btn-primary">View</a>-->
                <button class="btn btn-info"><a href="/asset/view" class="text-dark">View</a></button>
            </form>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
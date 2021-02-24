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
    <p><center>${map.status}</center></p>
<div class="row">
    <div class="col-md-3"></div>
    <div class="col-md-6 col-12">      
        <div class="widget-card widget-bg2">					 

            <h2 class="text-white"><center>Add Expense</center></h2>
            <form action="/expense/save" method="post">
                <label for="electricityBills">Electricity Bills:</label>
                <input type="text" class="form-control" id="electricityBills" placeholder="Enter Electricity Bills" name="electricityBills">
                <label for="internetBills">Internet Bills:</label>
                <input type="text" class="form-control" id="internetBills" placeholder="Enter Internet Bills" name="internetBills">
                <label for="waterBills">Water Bills:</label>
                <input type="text" class="form-control" id="waterBills" placeholder="Enter Water Bills" name="waterBills">
                <label for="rent">Rent</label>
                <input type="text" class="form-control" id="rent" placeholder="Enter Rent" name="rent">
                <label for="tax">Tax:</label>
                <input type="text" class="form-control" id="tax" placeholder="Enter Tax" name="tax">
                <label for="others">Others:</label>
                <input type="text" class="form-control" id="others" placeholder="Enter Others" name="others">
                <label for="total">Total:</label>
                <input type="text" class="form-control" id="total" placeholder="Enter Total" name="total">
                <button type="submit" class="btn btn-primary">Create</button>
                <button class="btn btn-info"><a href="/expense/view" class="text-dark">View</a></button>
            </form>
        </div>
    </div>
</div>
</div>


<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />
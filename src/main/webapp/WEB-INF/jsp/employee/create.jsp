<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!--<p><center>${map.status}</center></p>-->

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Employee Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Employee</li>
        </ul>
    </div>	
    <!-- Card -->

    <p><center>${map.status}</center></p>
<div class="row">
    <div class="col-md-3"></div>
    <div class="col-md-6 col-12">      
        <div class="widget-card widget-bg2 border border-dark">
            <h1 class="text-white"><center>Create Employee</center></h1>
            <form action="/employee/save" method="post">
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
                </div>
                <div class="form-group">
                    <label for="gender">Gender:</label>
                    <div class="form-check-inline">
                        <label class="form-check-label" for="male">
                            <input type="radio" class="form-check-input" id="male" name="gender" value="male" checked>Male
                        </label>
                    </div>
                    <div class="form-check-inline">
                        <label class="form-check-label" for="female">
                            <input type="radio" class="form-check-input" id="female" name="gender" value="female">Female
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="designation">Designation:</label>
                    <input type="text" class="form-control" id="designation" placeholder="Enter Designation" name="designation">
                </div>
                <div class="form-group">
                    <label for="salary">Salary:</label>
                    <input type="text" class="form-control" id="salary" placeholder="Enter Salary" name="salary">
                </div>

                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" id="email" placeholder="Enter Email" name="email">
                </div>
                <div class="form-group">
                    <label for="contact">Contact:</label>
                    <input type="text" class="form-control" id="contact" placeholder="Enter Contact" name="contact">
                </div>

                <div class="form-group">
                    <label for="address">Address:</label>
                    <input type="text" class="form-control" id="address" placeholder="Enter Address" name="address">
                </div>
                <button type="submit" class="btn btn-success">Create</button>
                <button type="submit" class="btn btn-primary">Back</button>
                <button class="btn btn-info"><a href="/employee/view" class="text-dark">View</a></button>    
            </form>
        </div>
    </div>

</div>
</div>



<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
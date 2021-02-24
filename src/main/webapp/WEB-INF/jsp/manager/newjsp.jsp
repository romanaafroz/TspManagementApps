
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container-fluid">
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6 border border-dark bg-tpb4">
            <h1><center>Update Employee</center></h1>
            <form action="/employee/update" method="post">
                <div class="form-group">
                    <label for="id">Id:</label>
                    <input type="text" class="form-control" id="id" placeholder="Enter Id" name="id">
                </div>
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
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
                <button type="submit" class="btn btn-primary">Update</button>
                <!--                <button id="btnCreate" class="btn btn-primary">Create Ajax Emp</button><br>-->
            </form>
        </div>
        <div class="col-3"></div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
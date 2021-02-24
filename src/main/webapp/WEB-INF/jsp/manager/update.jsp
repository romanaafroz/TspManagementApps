<jsp:include page="/WEB-INF/jsp/common/header.jsp" />


<div class="container-fluid">
    <h1><center>Pay Salary Detailes</center></h1>
    <div class="row  border border-dark bg-tpb4">
        <div class="col-6">

            <form action="/payroll/update" method="post">
                <div class="form-group">
                    <label for="id">Id:</label>
                    <input type="text" class="form-control" id="id" placeholder="Enter Id" name="id" value="${p.id}">
                </div>

                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name" value="${p.name}">
                </div>
                <div class="form-group">
                    <label for="gender">Gender:</label>
                    <div class="form-check-inline">
                        <label class="form-check-label" for="male">
                            <input type="radio" class="form-check-input" id="male" name="gender" value="male" checked value="${p.gender}">Male
                        </label>
                    </div>
                    <div class="form-check-inline">
                        <label class="form-check-label" for="female">
                            <input type="radio" class="form-check-input" id="female" name="gender" value="female" value="${p.gender}">Female
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="designation">Designation:</label>
                    <input type="text" class="form-control" id="designation" placeholder="Enter Designation" name="designation" value="${p.designation}">
                </div>
                <div class="form-group">
                    <label for="salary">Monthly Salary:</label>
                    <input type="text" class="form-control" id="salary" placeholder="Enter Monthly Salary" name="salary">
                </div>

                <div class="col-6">

                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="text" class="form-control" id="email" placeholder="Enter Email" name="email" value="${p.email}">
                    </div>
                    <div class="form-group">
                        <label for="contact">Contact:</label>
                        <input type="text" class="form-control" id="contact" placeholder="Enter Contact" name="contact" value="${p.contact}">
                    </div>

                    <div class="form-group">
                        <label for="address">Address:</label>
                        <input type="text" class="form-control" id="address" placeholder="Enter Address" name="address" value="${p.address}">
                    </div>

                    <div class="form-group">
                        <label for="increment">Increment%:</label>
                        <input type="text" class="form-control" id="increment" placeholder="Enter Increment%" name="increment " value="${p.increment}">
                    </div>
                    <div class="form-group">
                        <label for="fCount">Festeble Bonus Count Year:</label>
                        <input type="text" class="form-control" id="fCount" placeholder="Enter Festeble Bonus Count Year" name="fCount" value="${p.fCount}">
                    </div> 

                    <div class="form-group">
                        <label for="bonus">Bonus%:</label>
                        <input type="text" class="form-control" id="bonus" placeholder="Enter bonus" name="bonus" value="${p.bonus}">
                    </div>
                </div>
                <button type="submit" class="btn btn-primary" value="update">Update</button>
            </form>
        </div>

    </div>
</div>



<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
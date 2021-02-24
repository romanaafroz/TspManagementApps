<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<!--<p><center>${map.status}</center></p>-->

<div class="container-fluid">
    <h1><center>Create  Payroll</center></h1>
    <div class="row">
        <div class="col-4"></div>
        <div class="col-4 center">
            <div class="dropdown center">
                <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                    Salary
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="/payroll/create">Employee</a>
                    <a class="dropdown-item" href="#">Faculty</a>
                </div>
            </div>
            <div class="col-4"></div>
        </div>
    </div><br><br>

    <div class="row  border border-dark bg-tpb4">
        <div class="col-6">
            <form action="/payroll/save" method="post">
                <div class="form-group">
                    <label for="empId">Emp_Id:</label>
                    <input type="text" class="form-control" id="empId" placeholder="Enter Emp_Id" name="empId">
                </div>

                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
                </div>

                <div class="form-group">
                    <label for="mSalary">Monthly Salary:</label>
                    <input type="text" class="form-control" id="mSalary" placeholder="Enter Monthly Salary" name="mSalary">
                </div>

                <div class="form-group">
                    <label for="increment">Increment%:</label>
                    <input type="text" class="form-control" id="increment" placeholder="Enter Increment%" name="increment ">
                </div>
                <div class="form-group">
                    <label for="fCount">Festeble Bonus Count Year:</label>
                    <input type="text" class="form-control" id="fCount" placeholder="Enter Festeble Bonus Count Year" name="fCount">
                </div> 
        </div>
        <div class="col-6">
            <div class="form-group">
                <label for="bonus">Bonus%:</label>
                <input type="text" class="form-control" id="bonus" placeholder="Enter bonus" name="bonus">
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
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="submit" class="btn btn-primary">Back</button>
            <button class="btn btn-info"><a href="/payroll/view" class="text-dark">View</a></button>    
            </form>
        </div>

    </div>
</div>



<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />


<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Employee Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Employee</li>
        </ul>
    </div>	
    <!-- Card -->


    <!--    <div class="row  border border-dark bg-tpb4">
            <div class="col-md-6">-->

    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6 col-12">      
            <div class="widget-card widget-bg2">
                <h1 class="text-white"><center>Update Employee</center></h1>
                <form action="/employee/update" method="post">
                    <div class="form-group">
                        <label for="id">Id:</label>
                        <input type="text" class="form-control" id="id" placeholder="Enter Id" name="id" value="${e.id}">
                    </div>
                    <div class="form-group">
                        <label for="name">Name:</label>
                        <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name" value="${e.name}">
                    </div>
                    <div class="form-group">
                        <label for="gender">Gender:</label>
                        <div class="form-check-inline">
                            <label class="form-check-label" for="male">
                                <input type="radio" class="form-check-input" id="male" name="gender" value="male" checked value="${e.gender}">Male
                            </label>
                        </div>
                        <div class="form-check-inline">
                            <label class="form-check-label" for="female">
                                <input type="radio" class="form-check-input" id="female" name="gender" value="female" value="${e.gender}">Female
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="designation">Designation:</label>
                        <input type="text" class="form-control" id="designation" placeholder="Enter Designation" name="designation" value="${e.designation}">
                    </div>
                    <div class="form-group">
                        <label for="salary">Salary:</label>
                        <input type="text" class="form-control" id="salary" placeholder="Enter Salary" name="salary" value="${e.salary}">
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="text" class="form-control" id="email" placeholder="Enter Email" name="email" value="${e.email}">
                    </div>
                    <div class="form-group">
                        <label for="contact">Contact:</label>
                        <input type="text" class="form-control" id="contact" placeholder="Enter Contact" name="contact" value="${e.contact}">
                    </div>

                    <div class="form-group">
                        <label for="address">Address:</label>
                        <input type="text" class="form-control" id="address" placeholder="Enter Address" name="address" value="${e.address}">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary btn-block" value="update">Update</button>
                    </div>
                </form>
            </div>

        </div>
    </div>

</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
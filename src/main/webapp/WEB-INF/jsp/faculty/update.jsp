<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container-fluid">

    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Faculty Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Faculty</li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <div class="col-2"></div>
        <div class="col-md-6 col-12 border border-dark widget-card widget-bg2">
            <h1 class="text-white"><center>Create Faculty</center></h1>
            <form action="/faculty/update" method="post">
                <div class="form-group">
                    <label for="id">Faculty ID:</label>
                    <input type="text" class="form-control" id="id" placeholder="Enter Your ID" name="id" value="${f.id}">
                </div>
                <div class="form-group">
                    <label for="name">Faculty Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter Your Name" name="name" value="${f.name}">
                </div>
                <div class="form-group">
                    <label for="gender">Gender:</label>
                    <div class="form-check-inline">
                        <label class="form-check-label" for="male">
                            <input type="radio" class="form-check-input" id="male" name="gender" checked value="${f.gender}">Male
                        </label>
                    </div>
                    <div class="form-check-inline">
                        <label class="form-check-label" for="female">
                            <input type="radio" class="form-check-input" id="female" name="gender" checked value="${f.gender}">Female
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="salary">Salary:</label>
                    <input class="form-control" type="salary" id="salary" placeholder="Enter Salary" name="salary" value="${f.salary}">
                </div>

                <div class="form-group">
                    <label for="email">Email:</label>
                    <input class="form-control" type="email" id="email" placeholder="Enter Your Email" name="email" value="${f.email}">
                </div>

                <div class="form-group ">
                    <label for="contact">Contact</label>
                    <input class="form-control" type="contact" id="contact" placeholder="Enter Your Contact" name="contact" value="${f.contact}">
                </div>
                <div class="form-group ">
                    <label for="address">Address</label>
                    <input class="form-control" type="text" id="address" placeholder="Enter Your Address" name="address" value="${f.address}">
                </div>
                <button type="submit" class="btn btn-primary" value="update">Update</button>
            </form>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Faculty Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Faculty</li>
        </ul>
    </div>	
    <!-- Card -->
    
    <p><center>${map.status}</center></p>
<div class="row">
    <div class="col-3"></div>
    <div class="col-md-6 col-12 border border-dark widget-card widget-bg2">
        <h1 class="text-white"><center>Create Faculty</center></h1>
        <form action="/faculty/save" method="post">
            <div class="form-group">
                <label for="name"> Faculty Name:</label>
                <input type="text" class="form-control" id="name" placeholder="Enter Your Name" name="name">
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
                <label for="salary">Salary:</label>
                <input class="form-control" type="text" id="salary" placeholder="Enter Salary" name="salary">
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input class="form-control" type="text" id="email" placeholder="Enter Your Email" name="email">
            </div>
            <div class="form-group ">
                <label for="contact">Contact</label>
                <input class="form-control" type="text" id="contact" placeholder="Enter Your Contact" name="contact">
            </div>
            <div class="form-group ">
                <label for="address">Address</label>
                <input class="form-control" type="text" id="address" placeholder="Enter Your Address" name="address">
            </div>
            <!--<div class="form-group"><button class="btn  btn-primary btn-block" type="submit">Submit</button></div>-->
            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block" style="color: white">Create</button>
                <button class="btn btn-info btn-block"><a href="faculty/view" class="text-white">View</a></button>

                <!--<button class="btn btn-info btn-block"><a href="/faculty/view" class="text-white">View</a></button>-->
            </div>
        </form>
    </div>
</div>
</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
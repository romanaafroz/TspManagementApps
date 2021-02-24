<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Courses Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Courses</li>
        </ul>
    </div>	
    <!-- Card -->

    <br>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-md-6 col-12 border border-dark widget-card widget-bg2">
            <h1 class="text-white"><center>Update Courses</center></h1>
            <form action="/courses/update" method="post">
                <div class="form-group">
                    <label for="cId">Courses Id:</label>
                    <input type="text" class="form-control" id="cId" placeholder="Enter Id" name="cId" value="${c.cId}">
                </div>
                <div class="form-group">
                    <label for="cName"> Courses Name:</label>
                    <input type="text" class="form-control" id="cName" placeholder="Enter Name" name="cName" value="${c.cName}">
                </div>
                <div class="form-group">
                    <label for="code"> Courses Code:</label>
                    <input type="text" class="form-control" id="code" placeholder="Enter Code" name="code" value="${c.code}">
                </div>
                <div class="form-group">
                    <label for="duration">Duration:</label>
                    <input type="text" class="form-control" id="duration" placeholder="Enter Duration" name="duration" value="${c.duration}">
                </div>
                <button type="submit" class="btn btn-primary" value="update" style="color: white">Update</button>
                <!--            <button id="btnCreate" class="btn btn-primary">Create Ajax Emp</button><br>-->
            </form>
        </div>
        <div class="col-3">

        </div>

    </div>
</div>


<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
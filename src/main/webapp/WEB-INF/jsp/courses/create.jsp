<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<p><center>${map.status}</center></p>

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
        <h1 class="text-white"><center>Create Courses</center></h1>            
            <form action="/courses/save" method="post">
                <div class="form-group">
                    <label for="cName"> Courses Name:</label>
                    <input type="text" class="form-control" id="cName" placeholder="Enter Name" name="cName">
                </div>
                <div class="form-group">
                    <label for="code">Courses Code:</label>
                    <input type="text" class="form-control" id="code" placeholder="Enter Code" name="code">
                </div>
                <div class="form-group">
                    <label for="duration">Duration:</label>
                    <input type="text" class="form-control" id="duration" placeholder="Enter Duration" name="duration">
                </div>
                <button type="submit" class="btn btn-primary" style="color: white">Create</button>
<!--                <a href="/courses/view" class="btn-button btn-primary">View</a>-->
                <button class="btn btn-info">  <a href="/courses/view" class="text-white">View</a></button>
            </form>
        </div>
        <div class="col-3">

        </div>

    </div>
</div>


<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />

<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<p><center>${map.status}</center></p>
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Lab Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Lab</li>
        </ul>
    </div>	
    <!-- Card -->
    <br>

   <div class="row">
    <div class="col-3"></div>
    <div class="col-md-6 col-12 border border-dark widget-card widget-bg2">
        <h1 class="text-white"><center>Create Lab</center></h1>
            <form action="/lab/save" method="post">
                <label for="labNo">Lab No:</label>
                <input type="text" class="form-control" id="labNo" placeholder="Enter Lab No" name="labNo">
                <label for="labName">Lab Name:</label>
                <input type="text" class="form-control" id="labName" placeholder="Enter Lab Name" name="labName">
                <label for="labCode">Lab Code:</label>
                <input type="text" class="form-control" id="labCode" placeholder="Enter Lab Code" name="labCode">
                <label for="schedule">Lab Schedule:</label>
                <input type="text" class="form-control" id="schedule" placeholder="Enter Lab Schedule" name="schedule">
                <label for="des">Lab Description:</label>
                <textarea type="text" class="form-control" id="des" placeholder="Enter Lab Description:" name="des"></textarea><br>
                <button type="submit" class="btn btn-primary" style="color: white">Create</button>
                <button class="btn btn-info">  <a href="/lab/view" class="text-white">View</a></button>
            </form>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />

<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

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
        <h1 class="text-white"><center>Update Lab</center></h1>
            <form action="/lab/update" method="post">
                <label for="lId">Lab Id:</label>
                <input type="text" class="form-control" id="lId" placeholder="Enter Id" name="lId" value="${lab.lId}">
                <label for="labNo">Lab No:</label>
                <input type="text" class="form-control" id="labNo" placeholder="Enter Lab No" name="labNo" value="${lab.labNo}">
                <label for="labName">Lab Name:</label>
                <input type="text" class="form-control" id="labName" placeholder="Enter Lab Name" name="labName" value="${lab.labName}">
                <label for="labCode">Lab Code:</label>
                <input type="text" class="form-control" id="labCode" placeholder="Enter Lab Code" name="labCode" value="${lab.labCode}"> 
                <label for="schedule">Schedule:</label>
                <input type="text" class="form-control" id="schedule" placeholder="Enter Schedule" name="schedule" value="${lab.schedule}">
                <label for="des">Lab Description:</label>
                <textarea type="text" class="form-control" id="des" placeholder="Enter Lab Description:" name="des" value="${lab.des}"></textarea><br>
                <button type="submit" class="btn btn-primary" value="update" style="color: white">Update</button>
            </form>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
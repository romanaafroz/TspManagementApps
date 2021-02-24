
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<p><center>${map.status}</center></p>
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Trainee Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Trainee</li>
        </ul>
    </div>	
    <!-- Card -->
    <br>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-md-6 col-12 border border-dark widget-card widget-bg2">
            <h1 class="text-white"><center>Create Trainee</center></h1>  

            <form action="/trainee/save" method="post">               
                <div class="form-group">
                    <label for="tName">Trainee Name:</label>
                    <input type="text" class="form-control" id="tName" name="tName">
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
                    <label for="batch">Trainee Batch:</label>
                    <input type="text" class="form-control" id="batch" name="batch">

                </div>


                <div class="form-group">
                    <label for="dateOfBirth">D/O/B:</label>
                    <input class="form-control" type="date" value="2011-08-19" id="dateOfBirth" name="dateOfBirth">
                </div>

                <div class="form-group">
                    <label for="round">Trainee Round:</label>
                    <input type="text" class="form-control" id="round" name="round">
                </div>

                <div class="form-group">
                    <label for="email">Trainee Email:</label>
                    <input class="form-control" type="email" id="email" name="email">
                </div>
                <div class="form-group ">
                    <label for="contact">Trainee Contact:</label>
                    <input class="form-control" type="contact" id="contact" name="contact">
                </div>

                <div class="form-group ">
                    <label for="address">Trainee Address:</label>
                    <input class="form-control" type="text" id="address" name="address">
                </div>
                <div class="form-group ">
                    <label for="totalTrainee">Total Trainee:</label>
                    <input class="form-control" type="text" id="totalTrainee" name="totalTrainee">
                </div>
                <button type="submit" class="btn btn-primary" style="color: white">Create</button>
                <button type="submit" class="btn btn-info" style="color: white">Back</button>
                <button class="btn btn-info"><a href="/trainee/view" class="text-white">View</a></button>
            </form>
        </div>

    </div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">User Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>User</li>
        </ul>
    </div>	
    <!-- Card -->
    <br>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-md-6 col-12 border border-dark widget-card widget-bg2">
            <h1 class="text-white"><center>Create User</center></h1>            
            <form action="/user/userSave" method="post">
                <div class="form-group">
                    <label for="uName"> User Name:</label>
                    <input type="text" class="form-control" id="uName" placeholder="Enter User Name" name="uName">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" id="email" placeholder="Enter Email" name="email">
                </div>
                <div class="form-group">
                    <label for="pass">Password:</label>
                    <input type="password" class="form-control" id="pass" placeholder="Enter Password:" name="pass">
                </div>
                <button type="submit" class="btn btn-primary" style="color: white">Create</button>
            </form>
        </div>
        <div class="col-3">

        </div>

    </div>
</div>


<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
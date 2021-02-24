
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">-->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.min.css">
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Report Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Report</li>
        </ul>
    </div>	
    <!--Card--> 
    <br>

    <div class="row">
        <div class="col-lg-12 col-12">
            <h1><center>Trainee Report</center></h1>


            <table id="traineeTable" class="cell-border border-dark" style="width:100%">
                <thead class="widget-bg2">
                    <tr class="text-center">
                        <th class="border border-dark text-white">Name</th>
                        <th class="border border-dark text-white">Gender</th>
                        <th class="border border-dark text-white">Batch</th>
                        <th class="border border-dark text-white">D/O/B</th>
                        <th class="border border-dark text-white">Round</th>                       
                        <th class="border border-dark text-white">Email</th>
                        <th class="border border-dark text-white">Contact</th>
                        <th class="border border-dark text-white">Address</th>
                        <th class="border border-dark text-white">Total Trainee</th>
                    </tr>                   
                </thead>
                <tbody>
                    <c:forEach var="t" items="${map.traineeList}">
                       <tr class="text-center">
                            <td>${t.tName}</td>
                            <td>${t.gender}</td>
                            <td>${t.batch}</td>
                            <td>${t.dateOfBirth}</td>
                            <td>${t.round}</td>
                            <td>${t.email}</td>
                            <td>${t.contact}</td>
                            <td>${t.address}</td>
                            <td>${t.totalTrainee}</td>
                       </c:forEach>
                </tbody>
                <tfoot>
                    <tr>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Batch</th>
                        <th>D/O/B</th>
                        <th>Round</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Address</th>
                        <th>Total Trainee</th>
                    </tr>
                </tfoot>
            </table>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />



<!--<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>-->
<script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function () {
        $('#traineeTable').DataTable();
    });

//    $(function () {
//        $("#traineeTable").dataTable();
//    });
</script>
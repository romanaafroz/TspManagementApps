
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
            <h1><center>Employee Report</center></h1>


            <table id="empTable" class="cell-border border-dark" style="width:100%">
                <thead class="border border-dark widget-bg2">
                    <tr class="text-center border border-dark text-white">
                        <th class="border border-dark text-white">Name</th>
                        <th class="border border-dark text-white">Gender</th>
                        <th class="border border-dark text-white">Designation</th>
                        <th class="border border-dark text-white">Salary</th>
                        <th class="border border-dark text-white">Email</th>
                        <th class="border border-dark text-white">Contact</th>
                        <th class="border border-dark text-white">Address</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="e" items="${map.empList}">
                        <tr class="text-center">
                            <td>${e.name}</td>
                            <td>${e.gender}</td>
                            <td>${e.designation}</td>
                            <td>${e.salary}</td>
                            <td>${e.email}</td>
                            <td>${e.contact}</td>
                            <td>${e.address}</td>                          
                        </tr>
                    </c:forEach>
                </tbody>
                <tfoot>
                    <tr>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Designation</th>
                        <th>Salary</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Address</th>
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
        $('#empTable').DataTable();
    });

//    $(function () {
//        $("#myTable").dataTable();
//    });
</script>
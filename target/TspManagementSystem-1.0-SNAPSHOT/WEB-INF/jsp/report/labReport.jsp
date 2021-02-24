
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
            <h1><center>Lab Report</center></h1>


            <table id="labTable" class="cell-border border-dark" style="width:100%">
                <thead class="widget-bg2">
                    <tr class="text-center">
                        <th class="border border-dark text-white">Lab No</th>
                        <th class="border border-dark text-white">Lab Name</th>
                        <th class="border border-dark text-white">Lab Code</th>
                        <th class="border border-dark text-white">Schedule</th>
                        <th class="border border-dark text-white">Description</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="lab" items="${map.labList}">
                        <tr class="text-center">
                            <td>${lab.labNo}</td>
                            <td>${lab.labName}</td>
                            <td>${lab.labCode}</td>
                            <td>${lab.schedule}</td>
                            <td>${lab.des}</td>                    
                        </tr>
                    </c:forEach>
                </tbody>
                <tfoot>
                    <tr>
                        <th>Lab No</th>
                        <th>Lab Name</th>
                        <th>Lab Code</th>
                        <th>Schedule</th>
                        <th>Description</th>
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
        $('#labTable').DataTable();
    });

//    $(function () {
//        $("#myTable").dataTable();
//    });
</script>
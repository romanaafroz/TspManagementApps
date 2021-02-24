
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
            <h1><center>Courses Report</center></h1>


            <table id="cTable" class="cell-border border-dark" style="width:100%">
                <thead class="widget-bg2">
                    <tr class="text-center">
                        <th class="border border-dark text-white"> Course Name</th>
                        <th class="border border-dark text-white">Course Code</th>
                        <th class="border border-dark text-white">Duration</th>                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="c" items="${map.cList}">
                        <tr class="text-center">
                            <td>${c.cName}</td>
                            <td>${c.code}</td>
                            <td>${c.duration}</td>                       
                        </tr>
                    </c:forEach>
                </tbody>
                <tfoot>
                    <tr>
                        <th>Course Name</th>
                        <th>Course Code</th>
                        <th>Duration</th>
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
        $('#cTable').DataTable();
    });

//    $(function () {
//        $("#myTable").dataTable();
//    });
</script>
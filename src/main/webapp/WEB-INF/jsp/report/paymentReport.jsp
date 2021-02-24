<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
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
        <div class="col-12">
            <h1><center>Payment Report</center></h1>
            <table id="myTable1" class="border border-dark">
                <thead class="border border-dark widget-bg2">
                    <tr class="text-center border border-dark">  
                        <th class="border border-dark text-white">Trainee Name</th>
                        <th class="border border-dark text-white">Course</th>
                        <th class="border border-dark text-white">Code</th>
                        <th class="border border-dark text-white">Round</th>
                        <th class="border border-dark text-white">Batch</th>
                        <th class="border border-dark text-white">Email</th>
                        <th class="border border-dark text-white">Total Amount</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.payList}" var="e" >
                        <tr class="text-center border border-dark">
                            <td class="text-center border border-dark">${e.tName}</td>
                            <td class="text-center border border-dark">${e.cName}</td>
                            <td class="text-center border border-dark">${e.code}</td>
                            <td class="text-center border border-dark">${e.round}</td>
                            <td class="text-center border border-dark">${e.batch}</td>
                            <td class="text-center border border-dark">${e.email}</td>
                            <td class="text-center border border-dark">${e.totalAmount}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />


<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>
    $(function () {
        $("#myTable1").dataTable();
    });
</script>

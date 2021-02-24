<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Payroll Report</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Report</li>
        </ul>
    </div>	
    <!--Card--> 
    <br>

    <div class="row">
        <div class="col-12">
            <h1><center>Payroll Report</center></h1>
            <table id="myPayrollTable" class="border border-dark">
                <thead class="border border-dark widget-bg2">
                    <tr class="text-center border border-dark text-white">  
                        <th class="border border-dark text-white">Name</th>
                        <th  class="border border-dark text-white"class="border border-dark text-white">Designation</th>
                        <th class="border border-dark text-white">Email</th>
                        <th class="border border-dark text-white">Contact</th>
                        <th class="border border-dark text-white">Salary</th>
                        <th class="border border-dark text-white">Bonus</th>
                        <th class="border border-dark text-white">Payment Status</th>
                        <th class="border border-dark text-white">month</th>
                        <th class="border border-dark text-white">year</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.pList}" var="p" >
                        <tr class="text-center border border-dark">
                           <td class="text-center border border-dark">${p.name}</td>
                            <td class="text-center border border-dark">${p.designation}</td>
                            <td class="text-center border border-dark">${p.email}</td>
                            <td class="text-center border border-dark">${p.contact}</td>
                            <td class="text-center border border-dark">${p.salary}</td>
                            <td class="text-center border border-dark">${p.bonus}</td>
                            <td class="text-center border border-dark">${p.paymentStatus}</td>
                            <td class="text-center border border-dark">${p.month}</td>
                            <td class="text-center border border-dark">${p.year}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />


<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>
    $(function () {
        $("#myPayrollTable").dataTable();
    });
</script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Employee Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Employee</li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <!--<div class="col-md-1"></div>-->
        <div class="col-md-12"> 

            <div class="bg-white">
                <h1 class="text-black"><center>View Employee</center></h1>
                <button class="btn btn-info"><a href="/employee/create" class="text-dark"> + Create New Employee</a></button><br><br>
            <table class="table table-bordered table-striped">
                <thead class="bg-info border border-dark widget-bg2">
                    <tr class="text-center">
                        <th>ID</th>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Designation</th>
                        <th>Salary</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Address</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="e" items="${map.eList}">
                        <tr class="text-center">

                            <td>${e.id}</td>
                            <td>${e.name}</td>
                            <td>${e.gender}</td>
                            <td>${e.designation}</td>
                            <td>${e.salary}</td>
                            <td>${e.email}</td>
                            <td>${e.contact}</td>
                            <td>${e.address}</td>
                            <td>
                                <button class="btn btn-primary"> <a href="/employee/edit/${e.id}" style="color: green">Edit</a></button>
                                <button class="btn btn-danger"><a href="/employee/delete/${e.id}" style="color: red">Delete</a></button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>

        <div class="col-1">

        </div>  
    </div>
</div>



<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />

<script>
//   $("#btnViewAll").on("load", function () {
//    $("#btnViewAll").on("click", function () {
//        $("#empTable tbody").empty();
//        $.ajax({
//            url: '/employee/getAllEmployees',
//            type: 'GET',
//            dataType: 'json',
//            success: function (data, textStatus, jqXHR) {
//                for (i = 0; i < data.length; i++) {
//                    var html = '<tr>';
//                    html += '<td>' + data[i].id + '</td>';
//                    html += '<td>' + data[i].name + '</td>';
//                    html += '<td>' + data[i].salary + '</td>';
//                    html += '<td>' + data[i].nid + '</td>';
//                    html += '<td>' + data[i].area + '</td>';
//                    html += '<td>' + data[i].city + '</td>';
//                    html += '</tr>';
//                    $("#empTable tbody").append(html);
//                }
//            }
//        });
//
//
//    });
//
//    $("#btnCreate").on("click", function () {
//
//        $.ajax({
//            url: '/employee/save1',
//            type: 'POST',
//            dataType: 'json',
//            data: {
//                name: $("#name").val(),
//                salary: $("#salary").val(),
//                nid: $("#nid").val(),
//                area: $("#area").val(),
//                city: $("#city").val()
//            }
//
//        });
//
//
//    });

</script>
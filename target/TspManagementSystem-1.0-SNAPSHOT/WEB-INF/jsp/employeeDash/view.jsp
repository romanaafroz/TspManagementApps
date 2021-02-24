<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <div class="row">  

        <div class="col-12">
            <h1><center>View Employee's Salary</center></h1>
            <button class="btn btn-info"><a href="/employeeSalary/create" class="text-dark">New Add</a></button>
            <table class="table table-bordered">
                <thead class="bg-info border border-dark">
                    <tr class="align-content-center">
                        <th>ID</th>
                        <th>Name</th>
                        <th>Designation</th>
                        <th>Salary</th>
                        <th>Increment%</th>
                        <th>Festeble Bonus<br> Count Year</th>
                        <th>Bonus%</th>
                        <th>Amount</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="e" items="${map.eList}">
                        <tr >

                            <td>${e.eId}</td>
                            <td>${e.name}</td>
                            <td>${e.designation}</td>
                            <td>${e.salary}</td>
                            <td>${e.increment}</td>
                            <td>${e.fCount}</td>
                            <td>${e.bonus}</td>
                            <td>${e.amount}</td>
                            <td>${e.email}</td>
                            <td>${e.contact}</td>

                            <td>
                                <a href="/employeeSalary/edit/${e.id}" style="color: green">Edit</a>
                                <a href="/employeeSalary/delete/${e.id}" style="color: red">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

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
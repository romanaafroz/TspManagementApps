
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
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
        <div class="col-12 bg-white">
            <h1 class="text-black"><center>View Trainee</center></h1> 
            <button class="btn btn-info"><a href="/trainee/create" class="text-white"> + Create New Trainee</a></button><br><br>
            <table class="table table-bordered table-striped">
                <thead class="bg-info border border-dark widget-bg2">
                    <tr class="text-center">
                        <th class="text-white"> #Id</th>
                        <th class="text-white">Name</th>
                        <th class="text-white">Gender</th>
                        <th class="text-white">Batch</th>
                        <th class="text-white">D/O/B</th>
                        <th class="text-white">Round</th>
                        <th class="text-white">Email</th>
                        <th class="text-white">Contact</th>
                        <th class="text-white">Address</th>
                        <th class="text-white">Total Trainee</th>
                        <th class="text-white">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="t" items="${map.tList}">
                       <tr class="text-center">
                            <td>${t.tId}</td>
                            <td>${t.tName}</td>
                            <td>${t.gender}</td>
                            <td>${t.batch}</td>
                            <td>${t.dateOfBirth}</td>
                            <td>${t.round}</td>
                            <td>${t.email}</td>
                            <td>${t.contact}</td>
                            <td>${t.address}</td>
                            <td>${t.totalTrainee}</td>
                            <td>
                                <button class="btn btn-primary"><a href="/trainee/edit/${t.tId}" style="color: green">Edit</a></button>
                                <button class="btn btn-danger"><a href="/trainee/delete/${t.tId}" style="color: red">Delete</a></button>
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

    //        $("#btnViewAll").on("click", function () {
    //            $("#uniTable tbody").empty();
    //            $.ajax({
    //                url: '/university/getAllUniversities',
    //                type: 'GET',
    //                dataType: 'json',
    //                success: function (data, textStatus, jqXHR) {
    //                    for (i = 0; i < data.length; i++) {
    //                        var html = '<tr>';
    //                        html += '<td>' + data[i].id + '</td>';
    //                        html += '<td>' + data[i].name + '</td>';
    //                        html += '<td>' + data[i].code + '</td>';
    ////                        html += '<td>' + data[i].delete / {id} + '</td>';
    ////                        html += '<td>' + data[i].area + '</td>';
    ////                        html += '<td>' + data[i].city + '</td>';
    //                        html += '</tr>';
    //                        $("#uniTable tbody").append(html);
    //                    }
    //                }
    //            });
    //
    //
    //        });
</script>
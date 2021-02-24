<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Dashboard</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/home"><i class="fa fa-home"></i>Home</a></li>
            <li>View Faculty</li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <div class="col-1">

        </div>
        <div class="col-11 bg-white">
            <h1 class="card-title text-black"> <center>View Faculty</center></h1>
            <button class="btn btn-outline-info"><a href="/faculty/create" class="text-white"> + Create New Faculty</a></button><br><br>
            <table class="table table-bordered table-striped">
                <thead class="bg-info border border-dark widget-bg2">
                    <tr class="text-center">
                        <th class="text-white">#ID</th>
                        <th class="text-white">Name</th>
                        <th class="text-white">Gender</th>
                        <th class="text-white">Salary</th>
                        <th class="text-white">Email</th>
                        <th class="text-white">Contact</th>
                        <th class="text-white">Address</th>
                        <th class="text-white">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="f" items="${map.fList}">
                        <tr class="text-center">
                            <td>${f.id}</td>
                            <td>${f.name}</td>
                            <td>${f.gender}</td>
                            <td>${f.salary}</td>
                            <td>${f.email}</td>
                            <td>${f.contact}</td>
                            <td>${f.address}</td>
                            <td>
                                <button class="btn btn-primary"> <a href="/faculty/edit/${f.id}" style="color: green">Edit</a></button>
                                <button class="btn btn-danger"><a href="/faculty/delete/${f.id}" style="color: red">Delete</a></button>
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
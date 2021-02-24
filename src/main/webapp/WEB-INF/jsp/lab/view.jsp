<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container-fluid">
     <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Lab Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Lab</li>
        </ul>
    </div>	
    <!-- Card -->
    <br>
    
    <div class="row">
        <div class="col-1">

        </div>
        <div class="col-10 bg-white">
            <h1 class="card-title"> <center>View Courses</center></h1>
            <button class="btn btn-info"><a href="/lab/create" class="text-dark"> +Create New Lab</a></button><br><br>
            <table class="table table-bordered table-striped">
                <thead class="bg-info border border-dark widget-bg2">
                    <tr class="text-center">       
                        <th>#ID</th>
                        <th>Lab No</th>
                        <th>Lab Name</th>
                        <th>Lab Code</th>
                        <th>Schedule</th>
                        <th>Description</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="lab" items="${map.labList}">
                        <tr class="text-center">
                            <td>${lab.lId}</td>
                            <td>${lab.labNo}</td>
                            <td>${lab.labName}</td>
                            <td>${lab.labCode}</td>
                            <td>${lab.schedule}</td>
                            <td>${lab.des}</td>
                            <td>
                                <button class="btn btn-primary"><a href="/lab/edit/${lab.lId}" style="color: green">Edit</a></button>
                                <button class="btn btn-danger"><a href="/lab/delete/${lab.lId}" style="color: red">Delete</a></button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="col-3">

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
//                        html += '</tr>';
//                        $("#uniTable tbody").append(html);
//                    }
//                }
//            });
//
//
//        });
</script>
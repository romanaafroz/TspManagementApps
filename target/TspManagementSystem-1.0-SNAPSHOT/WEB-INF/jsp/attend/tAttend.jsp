
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Attendance Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Attendance</li>
        </ul>
    </div>
    <br>
    <!-- Card -->
    <h1 class="text-uppercase"><center>Create   Attendance</center></h1><br><br>
    <div class="row">
        <div class="col-md-8">
            <form action="/assign/search">
                <label for="rounds">Round:</label>
                <select id="rounds" name="rounds" class="col-sm-3">
                    <c:forEach var="a" items="${map.asList}">
                        <option value="${a.round}">${a.round}</option>
                    </c:forEach>
                </select>
                <label for="batchs">Batch:</label>
                <select id="batchs" name="batchs" class="col-sm-3">
                    <c:forEach var="a" items="${map.asList}">
                        <option value="${a.batch}">${a.batch}</option>
                    </c:forEach>
                </select>
                <input id="search" type="button" value="Search" style="color: #00CC00"/>
            </form>
        </div>
        <form action="/attend/save" method="post">
            <div class="col-md-8">              


                <!--<label for="times">Time:</label>-->
                <input type="hidden" id="time" name="time" class="col-sm-3">
                <!--<label for="dates">Date:</label>-->
                <input type="hidden" id="date" name="date" class="col-sm-3">

                <!--<button type="button" class="btn btn-primary" id="showAtt">Show</button>-->
            </div>

            <br>
            <div class="col-lg-12">
                <table class="table table-bordered" id="myTable">
                    <thead class="table table-bordered table-striped">
                        <tr class="border border-dark widget-bg2 text-center">

                            <th class="text-white">Select</th>
                            <th class="text-white">Trainee Id</th>
                            <th class="text-white">Name</th>
                            <th class="text-white">Round</th>
                            <th class="text-white">Email</th>
                            <th class="text-white">Courses</th>
                            <th class="text-white">Code</th>
                            <th class="text-white">Lab No</th>
                            <th class="text-white">Attendance Note</th>
                            <th class="text-white">Action</th>  
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
                <button type="submit" class="btn btn-outline-primary" style="color: white">Post Attend</button>
            </div>
        </form>
    </div>
</div>

<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
<script>
    $("#search").on("click", function () {
        $("#myTable tbody").empty();
        $.get("/assign/search1",
                {rounds: $("#rounds :selected").val(),
                    batchs: $("#batchs :selected").val()
                },
        function (data, status) {
            var html = "";
            for (i = 0; i < data.length; i++) {
                html += '<tr>'
                        + '<td>'
                        + '<input type = "checkbox" class="border" name="attStatus[]" value="'+data[i].id+'">'
                        + '</td>'
                        + '<td>' + data[i].id + '</td>'
                        + '<td>' + data[i].tName + '</td>'
                        + '<td>' + data[i].round + '</td>'
                        + '<td>' + data[i].email + '</td>'
                        + '<td>' + data[i].cName + '</td>'
                        + '<td>' + data[i].code + '</td>'
                        + '<td>' + data[i].labNo + '</td>'
                        + '<td>'
                        + '<input type = "text" id ="attNote" name = "attNote[]" value=""/>'
                        + '</td>'
                        + '<td>'
                        + '<button type = "button" class = "btn btn-info"> Absent </button>'
                        + '<input type = "hidden" id = "" value = "' + data[i].id + '" name = "assignID[]"/>'
                        + '<input type = "hidden" id = "" value = "' + data[i].tName + '" name = "tName[]"/>'
                        + '<input type = "hidden" id = "" value = "' + data[i].round + '" name = "round[]"/>'
                        + '<input type = "hidden" id = "" value = "' + data[i].email + '" name = "email[]"/>'
                        + '<input type = "hidden" id = "" value = "' + data[i].cName + '" name = "cName[]"/>'
                        + '<input type = "hidden" id = "" value = "' + data[i].code + '" name = "code[]"/>'
                        + '<input type = "hidden" id = "" value = "' + data[i].labNo + '" name = "labNo[]"/>'
                        + '</td>'
                        + '</tr>';
            }
            $("#myTable tbody").append(html);
        });
    });

//
//
//    $("#times").on("change", function () {
//        $("#time").val($("#time :selected").val());
//    });
//
//    $("#dates").on("change", function () {
//        $("#date").val($("#date :selected").val());
//    });
//


//    $(document).ready(function () {
//
//        $('#myTable tbody tr').each(function()){
//        $(this).find(".check-box").each(function ()){
//        $('#check-box').click(function () {
//            if ($(".check-box").is(":checked") == true) {
//                $('.att-status').val('Present');
//            } else {
//                $('.att-status').val('Absent');
//            }
//        });
//        }
//        }
//    });





//    $(document).ready(function() {
//        $("button").click(function(){
//            var status = $("input[name='checkB']);
//            if($("input[name='checkB']:checked")){
//                status = "present";
//            } else {
//                status = "absent";
//            }
//            var favorite = [];
//            $.each($("input[name='checkB']:checked"), function(){
//                favorite.push($(this).val(status));
//            });
//            alert("My favourite sports are: " + favorite.join(", "));
//        });
//    });



//    $(document).ready(function () {
//        $('.att-status').val('Absent');
//
//        $('.check-box').click(function () {
//            if ($(".check-box").is(":checked") == true) {
//                $('.att-status').val('Present');
//            } else {
//                $('.att-status').val('Absent');
//            }
//        });
//
//    });


</script>



<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Payroll Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a hrCreateef="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Payroll</li>
        </ul>
    </div>	
    <!-- Card -->
    <br>
    <!--<h1 class="text-uppercase"><center>Payroll System</center></h1>-->
    <div class="row">
        <div class="col-12 bg-white">
            <h1 class="card-title"> <center>Create Payroll</center></h1>
            <form action="/payroll/save" method="post">
                <div class="col-md-8">
                    <label for="months">Month:</label>
                    <select id="months" name="months" class="col-sm-3">
                        <option value="" disabled selected>Select</option>
                        <option value="January">January</option>
                        <option value="February">February</option>
                        <option value="March">March</option>
                        <option value="April">April</option>
                        <option value="May">May</option>
                        <option value="June">June</option>
                        <option value="July">July</option>
                        <option value="August">August</option>
                        <option value="September">September</option>
                        <option value="October">October</option>
                        <option value="November">November</option>
                        <option value="December">December</option>
                    </select>

                    <label for="years">Year:</label>
                    <select id="years" name="years" class="col-sm-3">
                        <option value="" disabled selected>Select</option>
                        <option value="2009">2009</option>
                        <option value="2010">2010</option>
                        <option value="2011">2011</option>
                        <option value="2012">2012</option>
                        <option value="2013">2013</option>
                        <option value="2014">2014</option>
                        <option value="2015">2015</option>
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                        <option value="2019">2019</option>
                        <option value="2020">2020</option>
                        <option value="2020">2021</option>
                    </select>
                    <button type="button" class="btn btn-primary" id="showEmp" style="color: white">Show</button>
                    <input type="hidden" value="" name="month" id="month"/>
                    <input type="hidden" value="" name="year" id="year"/>
                </div>
                <br><br>
                <div class="col-lg-12">
                    <table class="table table-bordered table-striped" id="myTable">
                        <thead class="border border-dark widget-bg2 text-center">
                            <tr class="text-center">

                                <th class="text-white">Select</th>
                                <th class="text-white">#ID</th>
                                <th class="text-white">Name</th>
                                <th class="text-white">Designation</th>
                                <th class="text-white">Email</th>
                                <th class="text-white">Salary</th>
                                <!--<th class="text-white">Bonus</th>-->
                                <th class="text-white">Pay Note</th>
                                <th class="text-white">Status</th>
                            </tr>
                        </thead>
                        <tbody>


                        </tbody>
                    </table>
                    <button type="submit" class="btn btn-outline-primary" style="color: white">Process Payroll</button>
                </div>
            </form>
        </div>
    </div>
</div>

    <jsp:include page="/WEB-INF/jsp/common/footer.jsp" />



    <script>

        $("#showEmp").on("click", function () {
            $.get("/payroll/getAllEmployees", function (data, status) {
                var html = "";
                for (i = 0; i < data.length; i++) {
                    console.log(data[i].name);
                    html += '<tr>'
                            + '<td>'
                            + '<input type = "checkbox" class="border" name="paymentStatus" value = "data[i].id">'
                            + '</td>'
                            + '<td>' + data[i].id + '</td>'
                            + '<td>' + data[i].name + '</td>'
                            + '<td>' + data[i].designation + '</td>'
                            + '<td>' + data[i].email + '</td>'
                            + '<td>' + data[i].salary + '</td>'
//                            + '<td>'
//                            + '<input type = "hidden" id = "empBonus" value = "" name = "empBonus[]"/>'
//                            + '</td>'
                            + '<td>'
                            + '<input type = "text" id ="payNote" value = "" name = "payNote[]"/>'
                            + '</td>'
                            + '<td>'
                            + '<button type = "button" class = "btn btn-info"> NOT PAID </button>'
                            + '<input type = "hidden" id = "" value = "' + data[i].id + '" name = "empID[]"/>'
                            + '<input type = "hidden" id = "" value = "' + data[i].name + '" name = "name[]"/>'
                            + '<input type = "hidden" id = "" value = "' + data[i].designation + '" name = "desig[]"/>'
                            + '<input type = "hidden" id = "" value = "' + data[i].email + '" name = "email[]"/>'
                            + '<input type = "hidden" id = "" value = "' + data[i].salary + '" name = "salary[]"/>'
                            + '<input type = "hidden" id = "" value = "' + data[i].contact + '" name = "contact[]"/>'
                            + '</td>'
                            + '</tr>';

                }

                $("#myTable tbody").append(html);

            });
        });





        $("#months").on("change", function () {
            $("#month").val($("#months :selected").val());
        });

        $("#years").on("change", function () {
            $("#year").val($("#years :selected").val());
        });
    </script>


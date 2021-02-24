<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <h1 class="text-uppercase"><center>Payroll Report List</center></h1>
    <div class="row">
        <div class="col-md-6">
            <form action="/payroll/search">
                <label for="months">Month:</label>
                <select id="months" name="months" class="col-sm-3">
                    <c:forEach var="p" items="${map.pList}">
                        <option value="${p.month}">${p.month}</option>
                    </c:forEach>
                </select>
                <label for="years">Year:</label>
                <select id="years" name="years" class="col-sm-3">
                    <c:forEach var="p" items="${map.pList}">
                        <option value="${p.year}">${p.year}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="Search"/>

            </form>
        </div><br><br>
        <div class="col-lg-12">

            <table class="table table-bordered">
                <thead class="table table-bordered table-striped">
                    <tr class="border border-dark widget-bg2 text-center">
                        <th class="text-white">#Id</th>
                        <th class="text-white">Name</th>
                        <th class="text-white">Designation</th>
                        <th class="text-white">Email</th>
                        <th class="text-white">Contact</th>
                        <th class="text-white">Salary</th>
                        <!--<th class="text-white">Bonus</th>-->
                        <th class="text-white">Payment Status</th>
                        <th class="text-white">month</th>
                        <th class="text-white">year</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.pList}" var="p" >
                        <tr >
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td>${p.designation}</td>
                            <td>${p.email}</td>
                            <td>${p.contact}</td>
                            <td>${p.salary}</td>
                            <!--<td>${p.bonus}</td>-->
                            <td>${p.paymentStatus}</td>
                            <td>${p.month}</td>
                            <td>${p.year}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

    </div>

    <jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
    <script>

//        $("#months").on("change", function () {
//            $("#month").val(this.value);
//            console.log(this.value);
//        });
//
//        $("#years").on("change", function () {
//            $("#year").val(this.value);
//            console.log(this.value);
//        });


    </script>
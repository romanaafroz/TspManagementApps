<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <h1 class="text-uppercase"><center>Payroll Report List</center></h1>
    <div class="row">
        <div class="col-md-6">
            <form action="/payroll/search">
                <label for="months">Month:</label>
                <select id="months" name="months" class="col-sm-2">
                    <c:forEach var="p" items="${map.pList}">
                        <option value="${p.month}">${p.month}</option>
                    </c:forEach>
                </select>
                <label for="years">Year:</label>
                <select id="years" name="years" class="col-sm-2">
                    <c:forEach var="p" items="${map.pList}">
                        <option value="${p.year}">${p.year}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="Search"/>
            </form>
        </div><br><br>
        <div class="col-lg-12">
            
            <table class="table table-bordered">
                <thead class="border-dark">
                    <tr class="align-content-center bg-tpb4">
                        <th>#Id</th>
                        <th>Name</th>
                        <th>Designation</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Salary</th>
                        <th>Bonus</th>
                        <th>Payment Status</th>
                        <th>month</th>
                        <th>year</th>
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
                            <td>${p.bonus}</td>
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
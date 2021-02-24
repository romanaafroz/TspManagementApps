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
    <!-- Card -->

    <h1 class="text-uppercase"><center>Attendances Report</center></h1>
    <div class="row">
        <div class="col-md-6">
            <form action="/attend/search">
                <label for="dates">Date:</label>
                <select id="dates" name="dates" class="col-sm-3">
                    <c:forEach var="p" items="${map.attList}">
                        <option value="${p.date}">${p.date}</option>
                    </c:forEach>
                </select>
                <label for="rounds">Round:</label>
                <select id="rounds" name="rounds" class="col-sm-3">
                    <c:forEach var="a" items="${map.attList}">
                        <option value="${a.round}">${a.round}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="Search" style="color: #00CC00"/>
            </form>
        </div><br><br>
        <div class="col-lg-12">

            <table class="table table-bordered">
                <thead class="table table-bordered table-striped">
                    <tr class="border border-dark widget-bg2 text-center">
                        <th class="text-white">Trainee Id</th>
                        <th class="text-white">Name</th>
                        <th class="text-white">Round</th>
                        <th class="text-white">Email</th>
                        <th class="text-white">Courses</th>
                        <th class="text-white">Code</th>
                        <th class="text-white">Lab No</th>
                        <th class="text-white">Attendance Note</th>
                        <th class="text-white">Attendance Status</th>
                        <th class="text-white">Date</th>
                        <th class="text-white">Time</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.attList}" var="t" >
                        <tr >
                            <td>${t.id}</td>
                            <td>${t.tName}</td>
                            <td>${t.round}</td>
                            <td>${t.email}</td>
                            <td>${t.cName}</td> 
                            <td>${t.code}</td> 
                            <td>${t.labNo}</td> 
                            <td>${t.attNote}</td> 
                            <td>${t.attStatus}</td> 
                            <td>${t.date}</td>
                            <td>${t.time}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />

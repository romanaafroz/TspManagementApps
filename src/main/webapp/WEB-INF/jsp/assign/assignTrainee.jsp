
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Trainee Assignment Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Assignment</li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <div class="col-md-3">

        </div>
        <div class="col-md-6 widget-card widget-bg2">
            <form action="/assign/assignSave" method="post">
                <h2 class="text-center text-white">Assign Trainee</h2>

                Trainee Name:
                <div class="form-group">
                    <select name="tName" id="selectTrainee" class="form-control mb-3"> 
                        <c:forEach items="${map.tList}" var="t">
                            <option value="${t.tId}">${t.tName}</option>
                        </c:forEach>
                    </select>
                </div>
                Courses Name:
                <div class="form-group"><select name="cName" id="selectCourses" class="form-control mb-3"> 
                        <c:forEach items="${map.cList}" var="c">
                            <option value="${c.cId}">${c.cName}</option>

                        </c:forEach>
                    </select>
                </div>
                Lab Name::
                <div class="form-group"><select name="labNo" class="form-control mb-3" id="selectLab">

                        <c:forEach items="${map.lList}" var="lab">
                            <option value="${lab.lId}">${lab.labNo}</option>
                        </c:forEach>
                    </select>
                </div>


                <!--For Trainee Select -->  
                <c:forEach var="t" items="${map.tList}">
                    <input type="hidden" name="tId" value="${t.tId}" id="tId"/>
                    <input type="hidden" name="tName" value="${t.tName}" id="tName"/>

                    <input type="hidden" name="gender" value="${t.gender}" id="gender"/>
                    <input type="hidden" name="batch" value="${t.batch}" id="batch"/>
                    <input type="hidden" name="dateOfBirth" value="${t.dateOfBirth}" id="dateOfBirth"/>
                    <input type="hidden" name="round" value="${t.round}" id="round"/>
                    <input type="hidden" name="email" value="${t.email}" id="email"/>
                    <input type="hidden" name="contact" value="${t.contact}" id="contact"/>
                    <input type="hidden" name="address" value="${t.address}" id="address"/>
                    <input type="hidden" name="totalTrainee" value="${t.totalTrainee}" id="totalTrainee"/>
                </c:forEach>

                <!--For Courses Select --> 
                <c:forEach var="c" items="${map.cList}">
                    <input type="hidden" name="cId" value="${c.cId}" id="cId"/>
                    <input type="hidden" name="cName" value="${c.cName}" id="cName"/>
                    <input type="hidden" name="code" value="${c.code}" id="code"/>
                    <input type="hidden" name="duration" value="${c.duration}" id="duration"/>
                </c:forEach>
                <!--For Lab Select --> 
                <c:forEach var="lab" items="${map.lList}">
                    <input type="hidden" name="lId" value="${lab.lId}" id="lId"/>
                    <input type="hidden" name="labNo" value="${lab.labNo}" id="labNo"/>
                    <input type="hidden" name="labName" value="${lab.labName}" id="labName"/>
                    <input type="hidden" name="labCode" value="${lab.labCode}" id="labCode"/>
                    <input type="hidden" name="schedule" value="${lab.schedule}" id="schedule"/>
                    <input type="hidden" name="des" value="${lab.des}" id="des"/>
                </c:forEach>

                <div class="form-group"><button class="btn  btn-primary btn-block" type="submit">Submit</button></div>


            </form>
        </div>
        <div class="col-md-3">

        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
<script>
    $("#selectTrainee").change(function () {

        $.ajax({
            url: 'getTrainee/' + this.value,
            type: 'GET',
            dataType: 'json',
            success: function (data) {
//                alert(data.email);
                //$("#id").val(data.id);
                $("#id").val(data.id);
                $("#tName").val(data.tName);
                $("#gender").val(data.gender);
                $("#batch").val(data.batch);
                $("#dateOfBirth").val(data.dateOfBirth);
                $("#round").val(data.round);
                $("#email").val(data.email);
                $("#contact").val(data.contact);
                $("#address").val(data.address);
                $("#totalTrainee").val(data.totalTrainee);

            }

        });

    });

    $("#selectCourses").change(function () {

        $.ajax({
            url: 'getCourses/' + this.value,
            type: 'GET',
            dataType: 'json',
            success: function (data) {
//                alert(data.email);
                //$("#id").val(data.id);
                $("#cId").val(data.cId);
                $("#cName").val(data.cName);
                $("#code").val(data.code);
                $("#duration").val(data.duration);

            }

        });

    });

    $("#selectLab").change(function () {

        $.ajax({
            url: 'getLab/' + this.value,
            type: 'GET',
            dataType: 'json',
            success: function (data) {
//                alert(data.email);
                //$("#id").val(data.id);
                $("#lId").val(data.lId);
                $("#labNo").val(data.labNo);
                $("#schedule").val(data.schedule);
            }

        });

    });
</script>

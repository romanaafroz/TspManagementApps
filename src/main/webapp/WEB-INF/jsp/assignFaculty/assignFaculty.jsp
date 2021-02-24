
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Faculty Assignment Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/home"><i class="fa fa-home"></i>Home</a></li>
            <li>Assignment</li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <div class="col-md-3">

        </div>
        <div class="col-md-6 widget-card widget-bg2">
            <form action="/assignFaculty/assignSave" method="post">
                <h2 class="text-center text-white">Assign Faculty</h2>

                Faculty Name:
                <div class="form-group">
                    <select name="name" id="selectFaculty" class="form-control mb-3"> 
                        <c:forEach items="${map.fList}" var="t">
                            <option value="${t.id}">${t.name}</option>
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
                Lab Name:
                <div class="form-group"><select name="labNo" class="form-control mb-3" id="selectLab">

                        <c:forEach items="${map.lList}" var="lab">
                            <option value="${lab.lId}">${lab.labNo}</option>
                        </c:forEach>
                    </select>
                </div>


                <!--For Trainee Select -->  
                <c:forEach var="t" items="${map.fList}">
                    <input type="hidden" name="id" value="${t.id}" id="id"/>
                    <input type="hidden" name="name" value="${t.name}" id="name"/>

                    <input type="hidden" name="gender" value="${t.gender}" id="gender"/>
                    <input type="hidden" name="salary" value="${t.salary}" id="salary"/>

                    <input type="hidden" name="email" value="${t.email}" id="email"/>
                    <input type="hidden" name="contact" value="${t.contact}" id="contact"/>
                    <input type="hidden" name="address" value="${t.address}" id="address"/>
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
    $("#selectFaculty").change(function () {

        $.ajax({
            url: 'getFaculty/' + this.value,
            type: 'GET',
            dataType: 'json',
            success: function (data) {
//                alert(data.email);
                //$("#id").val(data.id);
                $("#id").val(data.id);
                $("#name").val(data.name);
                $("#gender").val(data.gender);
                $("#salary").val(data.salary);
                $("#email").val(data.email);
                $("#contact").val(data.contact);
                $("#address").val(data.address);

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
                $("#schedule").val(data.schedule)
            }

        });

    });
</script>

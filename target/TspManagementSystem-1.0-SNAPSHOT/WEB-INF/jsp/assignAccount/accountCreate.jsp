
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />

<div class="container-fluid">
    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title">Assign Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/home"><i class="fa fa-home"></i>Home</a></li>
            <li>Assign Account</li>
        </ul>
    </div>	
    <!-- Card -->
    <div class="row">
        <div class="col-md-3">

        </div>
        <div class="col-md-6 widget-card widget-bg2">
            <form action="/assignAccount/accountSave" method="post">
                <h2 class="text-center text-white">Assign Account</h2>

                Select Expense:
                <div class="form-group">
                    <select name="electricityBills" id="selectExpense" class="form-control mb-3"> 
                        <c:forEach items="${map.eList}" var="t">
                            <option value="${t.exId}">${t.electricityBills}</option>
                        </c:forEach>
                    </select>
                </div>
                Select Payment:
                <div class="form-group"><select name="cardType" id="selectPayment" class="form-control mb-3"> 
                        <c:forEach items="${map.payList}" var="c">
                            <option value="${c.payId}">${c.cardType}</option>

                        </c:forEach>
                    </select>
                </div>


                <!--For Expense Select -->  
                <c:forEach var="t" items="${map.eList}">
                    <input type="hidden" name="exId" value="${t.exId}" id="exId"/>
                    <input type="hidden" name="electricityBills" value="${t.electricityBills}" id="electricityBills"/>

                    <input type="hidden" name="internetBills" value="${t.internetBills}" id="internetBills"/>
                    <input type="hidden" name="waterBills" value="${t.waterBills}" id="waterBills"/>
                    <input type="hidden" name="rent" value="${t.rent}" id="rent"/>
                    <input type="hidden" name="tax" value="${t.tax}" id="tax"/>
                    <input type="hidden" name="others" value="${t.others}" id="others"/>
                    <input type="hidden" name="total" value="${t.total}" id="total"/>

                </c:forEach>

                <!--For Payment Select --> 
                <c:forEach var="c" items="${map.payList}">
                    <input type="hidden" name="payId" value="${c.payId}" id="payId"/>
                    <input type="hidden" name="cardType" value="${c.cardType}" id="cardType"/>
                    <input type="hidden" name="expireDate" value="${c.expireDate}" id="expireDate"/>
                    <input type="hidden" name="cardNo" value="${c.cardNo}" id="cardNo"/>
                    <input type="hidden" name="cvcNo" value="${c.cvcNo}" id="cvcNo"/>
                    <input type="hidden" name="tName" value="${c.tName}" id="tName"/>
                    <input type="hidden" name="cName" value="${c.cName}" id="cName"/>
                    <input type="hidden" name="code" value="${c.code}" id="code"/>
                    <input type="hidden" name="round" value="${c.round}" id="round"/>
                    <input type="hidden" name="batch" value="${c.batch}" id="batch"/>
                    <input type="hidden" name="email" value="${c.email}" id="email"/>
                    <input type="hidden" name="totalTrainee" value="${c.totalTrainee}" id="totalTrainee"/>
                    <input type="hidden" name="payAmount" value="${c.payAmount}" id="payAmount"/>
                    <input type="hidden" name="totalAmount" value="${c.totalAmount}" id="totalAmount"/>
                </c:forEach>


                <div class="form-group"><button class="btn  btn-primary btn-block" type="submit">Submit</button></div>


            </form>
        </div>
        <div class="col-md-3">

        </div>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />
<script>
    $("#selectExpense").change(function () {

        $.ajax({
            url: 'getExpense/' + this.value,
            type: 'GET',
            dataType: 'json',
            success: function (data) {
//                alert(data.email);
                //$("#id").val(data.id);
                $("#exId").val(data.exId);
                $("#electricityBills").val(data.electricityBills);
                $("#internetBills").val(data.internetBills);
                $("#waterBills").val(data.waterBills);
                $("#rent").val(data.rent);
                $("#tax").val(data.tax);
                $("#others").val(data.others);
                $("#total").val(data.total);

            }

        });

    });

    $("#selectPayment").change(function () {

        $.ajax({
            url: 'getPayment/' + this.value,
            type: 'GET',
            dataType: 'json',
            success: function (data) {
//                alert(data.email);
                //$("#id").val(data.id);
                $("#payId").val(data.payId);
                $("#cardType").val(data.cardType);
                $("#expireDate").val(data.expireDate);
                $("#cardNo").val(data.cardNo);
                $("#cvcNo").val(data.cvcNo);
                $("#tName").val(data.tName);
                $("#cName").val(data.cName);
                $("#code").val(data.code);
                $("#round").val(data.round);
                $("#batch").val(data.batch);
                $("#email").val(data.email);
                $("#totalTrainee").val(data.totalTrainee);
                $("#payAmount").val(data.payAmount);

            }

        });

    });

   
</script>

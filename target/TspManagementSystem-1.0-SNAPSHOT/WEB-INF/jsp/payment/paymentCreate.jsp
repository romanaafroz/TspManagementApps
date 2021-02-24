<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />

<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body {
                font-family: Arial;
                font-size: 17px;
                padding: 8px;
            }

            * {
                box-sizing: border-box;
            }

            .row {
                display: -ms-flexbox; /* IE10 */
                display: flex;
                -ms-flex-wrap: wrap; /* IE10 */
                flex-wrap: wrap;
                margin: 0 -16px;
            }

            .col-25 {
                -ms-flex: 25%; /* IE10 */
                flex: 25%;
            }

            .col-50 {
                -ms-flex: 50%; /* IE10 */
                flex: 50%;
            }

            .col-75 {
                -ms-flex: 75%; /* IE10 */
                flex: 75%;
            }

            .col-25,
            .col-50,
            .col-75 {
                padding: 0 16px;
            }

            .container {
                background-color: #f2f2f2;
                padding: 5px 20px 15px 20px;
                border: 1px solid lightgrey;
                border-radius: 3px;
            }

            input[type=text] {
                width: 100%;
                margin-bottom: 20px;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            label {
                margin-bottom: 10px;
                display: block;
            }

            .icon-container {
                margin-bottom: 20px;
                padding: 7px 0;
                font-size: 24px;
            }

            .btn {
                background-color: #4CAF50;
                color: white;
                padding: 12px;
                margin: 10px 0;
                border: none;
                width: 100%;
                border-radius: 3px;
                cursor: pointer;
                font-size: 17px;
            }

            .btn:hover {
                background-color: #45a049;
            }

            a {
                color: #2196F3;
            }

            hr {
                border: 1px solid lightgrey;
            }

            span.price {
                float: right;
                color: grey;
            }

            /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
            @media (max-width: 800px) {
                .row {
                    flex-direction: column-reverse;
                }
                .col-25 {
                    margin-bottom: 20px;
                }
            }
        </style>
    </head>

    <body>



        <div class="container-fluid">
            <div class="db-breadcrumb">
                <h4 class="breadcrumb-title"> Payment Database</h4>
                <ul class="db-breadcrumb-list">
                    <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
                    <li>Payment</li>
                </ul>
            </div>	
            <p><center>${map.status}</center></p>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6 border border-dark">

                <div class="row">
                    <div class="col-md-3"></div> 
                    <div class="col-md-6">

                        <h3 class="text-center text-uppercase">Create Payment</h3>
                        <label for="pName" class="text-center font-size-4 text-black">Accepted Cards</label>
                        <div class="icon-container text-center">
                            <i class="fa fa-cc-visa" style="color:navy;"></i>
                            <i class="fa fa-cc-amex" style="color:blue;"></i>
                            <i class="fa fa-cc-mastercard" style="color:red;"></i>
                            <i class="fa fa-cc-discover" style="color:orange;"></i>
                        </div>
                    </div>

                </div>
                <hr>
                <form action="/payment/save" method="post" class="widget-bg2">
                    <div class="form-group">
                        <label for="tName" class="text-white">Trainee Name:</label>
                        <select id="tName" name="tName">
                            <c:forEach var="a" items="${map.asList}">
                                <option value="${a.tName}">${a.tName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="cName" class="text-white">Course:</label>
                        <select id="cName" name="cName">
                            <c:forEach var="a" items="${map.asList}">
                                <option value="${a.cName}">${a.cName}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="cardType" class="text-white">Card Type:</label>
                        <select name="cardType" id="cardType">
                            <option>Select Card</option>
                            <option value="debit">Debit or credit Card</option>    
                            <option value="paypal">Paypal</option>
                            <option value="payoner">Payoneer</option>
                            <option value="bkash">Bkash</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="expireDate" class="text-white">Expire Date:</label>
                        <input class="form-control" id="expireData" name="expireDate" type="date">
                    </div>
                    <div class="form-group"> 
                        <label for="cardNo" class="text-white">Card No:</label>
                        <input id="caedno" class="form-control" name="cardNo" placeholder="Enter Card Number" type="number">
                    </div>
                    <div class="form-group"> 
                        <label for="cvcNo" class="text-white">CVC NO:</label>
                        <input id="cvcNo" class="form-control" name="cvcNo" placeholder="CVC Number" required="" type="number">
                    </div>
                    <div class="form-group"> 
                        <label for="payAmount" class="text-white">Total Amount:</label>

                        <input type="text" id="payAmount" placeholder="Enter Amount" name="payAmount">
                    </div>
                    <input type="hidden" id="totalAmount" name="totalAmount"/>

                    <div class="checkout-btn">
                        <button class="btn btn-primary text-white" type="submit" id="submitbtn">Confirm Payment</button>
                        <button class="btn btn-info text-white"> NOT NOW</button>
                    </div>

                    <c:forEach var="a" items="${map.asList}">
                        <input id="code" name="id" type="hidden" value="${a.id}">                     
                        <input id="code" name="code" type="hidden" value="${a.code}">                     
                        <input id="round" name="round" type="hidden" value="${a.round}">                     
                        <input id="batch" name="batch" type="hidden" value="${a.batch}">                     
                        <input id="email" name="email" type="hidden" value="${a.email}">
                        <input id="duration" name="duration" type="hidden" value="${a.duration}">
                        <input id="totalTrainee" name="totalTrainee" type="hidden" value="${a.totalTrainee}">
                    </c:forEach>
                </form>
            </div>
        </div>
    </div>              

</body>                    
</html>
<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp"/>

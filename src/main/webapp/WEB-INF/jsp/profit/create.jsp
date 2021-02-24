
<jsp:include page="/WEB-INF/jsp/dashcommon/dashheader.jsp" />

<div class="container-fluid">

    <div class="db-breadcrumb">
        <h4 class="breadcrumb-title"> Profit Database</h4>
        <ul class="db-breadcrumb-list">
            <li><a href="/index"><i class="fa fa-home"></i>Home</a></li>
            <li>Profit</li>
        </ul>
    </div>	
    <!-- Card -->

<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/bootstrap-extended.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/fonts/simple-line-icons/style.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/colors.min.css">
<link rel="stylesheet" type="text/css" href="https://pixinvent.com/stack-responsive-bootstrap-4-admin-template/app-assets/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet">

<div class="grey-bg container-fluid">
    <section id="stats-subtitle">
        <div class="row">
            <div class="col-12 mt-3 mb-1">
                <h2 class="text-uppercase text-center">TSP management System</h2>
                <p class="text-center font-size-3">Profit Report.</p>
            </div>
        </div>

        <div class="row">
            <div class="col-xl-4 col-md-12">
                <div class="card">
                    <div class="card-content">
                        <div class="card-body cleartfix">
                            <div class="media align-items-stretch">
                                <div class="align-self-center">
                                    <h1 id="earning" class="mr-2">${map.earning}</h1>
                                    <p class="text-center">TK</p>
                                </div>
                                <div class="media-body">
                                    <h4>Total Eearing</h4>
                                    <span>Monthly Eearing</span>
                                </div>
                                <div class="align-self-center">
                                    <i class="icon-heart danger font-large-2"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="col-xl-4 col-md-12">
                <div class="card">
                    <div class="card-content">
                        <div class="card-body cleartfix">
                            <div class="media align-items-stretch">
                                <div class="align-self-center">
                                    <h1 id="expense" class="mr-2">${map.expense}</h1>
                                    <p class="text-center">TK</p>
                                </div>
                                <div class="media-body">
                                    <h4>Total Expense</h4>
                                    <span>Monthly Expense</span>
                                </div>
                                <div class="align-self-center">
                                    <i class="icon-wallet success font-large-2"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xl-4 col-md-12">
                <div class="card">
                    <div class="card-content">
                        <div class="card-body cleartfix">
                            <div class="media align-items-stretch">
                                <div class="align-self-center">
                                    <h1 id="cProfit" class="mr-2"></h1> 
                                    <p class="text-center">TK</p>
                                </div>
                                <div class="media-body">
                                    <h4>Total Profit</h4>
                                    <span>Monthly Profit</span>
                                </div>
                                <div class="align-self-center">
                                    <i class="icon-heart danger font-large-2"></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </section>
</div>




<jsp:include page="/WEB-INF/jsp/dashcommon/dashfooter.jsp" />


<script>
    $(document).ready(function () {
        var earning = $("#earning").text();
        var expense = $("#expense").text();
        var profit = (parseInt(earning) - parseInt(expense));
        $("#profit").text(profit);
        $("#cProfit").text(profit);

    });
</script>





<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

<div class="container">
    <div class="row">
        <div class="col-md-3">

        </div>
        <div class="col-md-6">

            <!-- Material form login -->
            <div class="card">

                <h5 class="card-header bg-info white-text text-center py-4">
                    <strong>Sign in</strong>
                </h5><br>

                <!--Card content-->
                <div class="card-body px-lg-5 pt-0">

                    <!-- Form -->
                    <form class="text-center" style="color: #757575;" action="#!">

                        <!-- Email -->
                        <div class="md-form border-dark">
                            <label for="materialLoginFormEmail">E-mail</label>
                            <input type="email" id="materialLoginFormEmail" class="form-control">
                            
                        </div>

                        <!-- Password -->
                        <div class="md-form">
                             <label for="materialLoginFormPassword">Password</label>
                            <input type="password" id="materialLoginFormPassword" class="form-control">
                           
                        </div>

                        <div class="d-flex justify-content-around">
                            <div>
                                <!-- Remember me -->
                                <div class="form-check">
                                    <input type="checkbox" class="form-check-input" id="materialLoginFormRemember">
                                    <label class="form-check-label" for="materialLoginFormRemember">Remember me</label>
                                </div>
                            </div>
                            <div>
                                <!-- Forgot password -->
                                <a href="">Forgot password?</a>
                            </div>
                        </div>

                        <!-- Sign in button -->
                        <button class="btn btn-outline-info btn-rounded btn-block my-4 waves-effect z-depth-0" type="submit">Sign in</button>

                        <!-- Register -->
                        <p>Not a member?
                            <a href="">Register</a>
                        </p>

                        <!-- Social login -->
                        <p>or sign in with:</p>
                        <a type="button" class="btn-floating btn-fb btn-sm">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a type="button" class="btn-floating btn-tw btn-sm">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a type="button" class="btn-floating btn-li btn-sm">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                        <a type="button" class="btn-floating btn-git btn-sm">
                            <i class="fab fa-github"></i>
                        </a>

                    </form>
                    <!-- Form -->

                </div>

            </div>
            <!-- Material form login -->
        </div>
        <div class="col-md-3">

        </div>

    </div>

</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />

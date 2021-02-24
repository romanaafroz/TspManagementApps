<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<div class="container-fluid">
    <div class="col-3">

    </div>
    <div class="col-6">
        <table class="table table-striped">
            <tbody>
                <tr>
                    <td colspan="1">
                        <form class="well form-horizontal">
                            <fieldset>
                                <div class="form-group">
                                    <label class="control-label">Full Name</label>
                                    <div class="inputGroupContainer">
                                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span><input id="fullName" name="fullName" placeholder="Full Name" class="form-control" required="true" value="" type="text"></div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class=" control-label">Email</label>
                                    <div class="inputGroupContainer">
                                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span><input id="email" name="email" placeholder="Email" class="form-control" required="true" value="" type="text"></div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Phone Number</label>
                                    <div class="inputGroupContainer">
                                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span><input id="phoneNumber" name="phoneNumber" placeholder="Phone Number" class="form-control" required="true" value="" type="text"></div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Address</label>
                                    <div class="inputGroupContainer">
                                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="address" name="address" placeholder=" Enter Address " class="form-control" required="true" value="" type="text"></div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label">City</label>
                                    <div class="inputGroupContainer">
                                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="city" name="city" placeholder="City" class="form-control" required="true" value="" type="text"></div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class=" control-label">Salary</label>
                                    <div class=" inputGroupContainer">
                                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="salary" name="salary" placeholder=" Enter Salary" class="form-control" required="true" value="" type="text"></div>
                                    </div>
                                </div>
                                <!--                                <div class="form-group">
                                                                    <label class="control-label">Postal Code/ZIP</label>
                                                                    <div class="inputGroupContainer">
                                                                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span><input id="postcode" name="postcode" placeholder="Postal Code/ZIP" class="form-control" required="true" value="" type="text"></div>
                                                                    </div>
                                                                </div>-->
                                <div class="form-group">
                                    <label class="control-label">Country</label>
                                    <div class="inputGroupContainer">
                                        <div class="input-group">
                                            <span class="input-group-addon" style="max-width: 100%;"><i class="glyphicon glyphicon-list"></i></span>
                                            <select class="selectpicker form-control">
                                                <option>Select Country</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>

                                <input type="submit" value="Submit"/>
                            </fieldset>
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="col-3">

    </div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />
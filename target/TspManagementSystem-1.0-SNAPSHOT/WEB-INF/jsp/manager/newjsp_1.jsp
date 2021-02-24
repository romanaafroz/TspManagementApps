 <div class="col-md-12">
                            
                        </div>


                        <div class="col-md-12">
                             </div>
                        <br>

                        <div class="col-md-12">
                            <div class="form-group">

                                Card No: <input class="form-control" id="caedno" name="cardNo" placeholder="Number" type="text">
                            </div>
                        </div>

                        <div class="col-md-12">
                            <div class="form-group">  
                                CVC NO: <input class="form-control" id="caedno" name="cvvNo" placeholder="CVV Number" required="" type="number">
                            </div>
                        </div>
                        <div class="col-md-4">
                            <input type="text" class="form-control" autocomplete="off" maxlength="3" pattern="\d{3}" title="Three digits at back of your card" required="" placeholder="CVC">
                        </div>
                        <div class="row">
                            <label class="col-md-12">Total Amount</label>
                        </div>
                        <div class="form-inline">
                            <div class="input-group">
                                <div class="input-group-prepend"><span class="input-group-text">$</span></div>
                                <input type="text" class="form-control text-right" id="exampleInputAmount" placeholder="39">
                                <div class="input-group-append"><span class="input-group-text">.00</span></div>
                            </div>
                        </div>
                        <hr>
                        <div class="checkout-btn">
                            <button class="example1 btn btn-primary" type="submit" id="submitbtn">Confirm Payment</button>
                            <button class="btn btn-info"> NOT NOW</button>
                        </div>
                    </form>

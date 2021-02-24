<div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" value="${e.name}" class="form-control" id="name" placeholder="Enter Name" name="name">
                </div>
                <div class="form-group">
                    <input type="hidden" name="gender" value="${e.gender}" />
                </div>
                <div class="form-group">
                    <label for="designation">Designation:</label>
                    <input type="text" class="form-control" value="${e.designation}" id="designation" placeholder="Enter Designation" name="designation">
                </div>
                <div class="form-group">
                    <label for="salary"> Monthly Salary:</label>
                    <input type="text" class="form-control" value="${e.salary}" id="salary" placeholder="Enter Monthly Salary" name="salary">
                </div>
                <div class="form-group">
                    <label for="increment">Increment%:</label>
                    <input type="text" class="form-control" value="${e.increment}" id="increment" placeholder="Enter Increment%" name="increment ">
                </div>
                <div class="form-group">
                    <label for="fCount">Festeble Bonus Count Year:</label>
                    <input type="text" class="form-control" value="${e.fCount}" id="fCount" placeholder="Enter Festeble Bonus Count Year" name="fCount">
                </div>

        </div>
        <div class="col-md-6"> 
            <div class="form-group">
                <label for="bonus">Bonus%:</label>
                <input type="text" class="form-control" value="${e.bonus}" id="bonus" placeholder="Enter bonus" name="bonus">
            </div>

            <div class="form-group">
                <label for="amount">Total Amount:</label>
                <input type="text" class="form-control" value="${e.amount}" id="amount" placeholder="Enter Total Amount" name="amount">
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" class="form-control" value="${e.email}" id="email" placeholder="Enter Email" name="email">
            </div>
            <div class="form-group">
                <label for="contact">Contact:</label>
                <input type="text" class="form-control" value="${e.contact}" id="contact" placeholder="Enter Contact" name="contact">
            </div>

            <div class="form-group">
                <label for="address"></label>
                <input type="hidden" class="form-control" value="${e.address}" id="address" placeholder="Enter Address" name="address">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <button type="submit" class="btn btn-primary">Back</button>
            <button class="btn btn-info"><a href="/employeeSalary/view" class="text-dark">View</a></button>    


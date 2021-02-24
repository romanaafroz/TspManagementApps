<form class="" action="#">
    <label for="email">Month:</label>
    <select class="" name="months">

        <option value="" disabled selected>Select your month</option>
        <option value="January">January</option>
        <option value="February">February</option>
        <option value="March">March</option>
        <option value="April">April</option>
        <option value="May">May</option>
        <option value="June">June</option>
        <option value="July">July</option>
        <option value="August">August</option>
        <option value="September">September</option>
        <option value="October">October</option>
        <option value="November">November</option>
        <option value="December">December</option>

    </select>
    <label for="year">Year:</label>
    <select class="" name="months">

        <option value="" disabled selected>Select your year</option>
        <option value="July">2009</option>
        <option value="August">2010</option>
        <option value="September">2011</option>
        <option value="October">2012</option>
        <option value="November">2013</option>
        <option value="December">2014</option>
        <option value="January">2015</option>
        <option value="February">2016</option>
        <option value="March">2017</option>
        <option value="April">2018</option>
        <option value="May">2019</option>
        <option value="June">2020</option>


    </select>
    <button type="submit" class="btn btn-primary">Go</button>
</form>


</div>
<div class="col-1"></div>
</div>
<div class="row">
    <div class="col-12">
        <h1><center>Pay Salary List</center></h1>
        <!--            <button class="btn btn-info"><a href="/payroll/create" class="text-dark">New Add</a></button>-->
        <table class="table table-bordered">
            <thead class="bg-info border border-dark">
                <tr class="align-content-center">
                    <th>ID</th>
                    <th>Name</th>
                    <th>designation</th>
                    <th>Email</th>
                    <th>Contact</th>
                    <th>Address</th>
                    <th>salary</th>
                    <th>Bonus</th>
                    <th>Status</th>

                </tr>
            </thead>
            <tbody>
            <c:forEach items="${map.eList}" var="p" >
                <tr >
                    <td>${p.id}</td>
                    <td>${p.name}</td>
<!--                            <td>${p.gender}</td>-->
                    <td>${p.designation}</td>

                    <td>${p.email}</td>
                    <td>${p.contact}</td>
                    <td>${p.address}</td>
                    <td>${p.salary}</td> 
                    <td>
                        <input type="text" name="empBonus[]" />
                    </td>
                    <td>
                        <button class="btn btn-info">Paid</button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <button type="submit" class="btn btn-outline-primary">Process Payroll</button>
    </div>  
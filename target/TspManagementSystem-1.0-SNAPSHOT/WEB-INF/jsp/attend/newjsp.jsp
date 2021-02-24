<div class="col-md-3">
    <div class="form-group">
        <label for="name">Courses:</label>
        <select class="ml-auto" name="cId">
            <c:forEach var="c" items="${map.cList}">
                <option value="${c.id}">${c.name}</option>
            </c:forEach>

        </select>
        <button type="button" class="btn btn-primary" id="showEmp">Show</button>
    </div>
</div>
<br><br>
<div class="col-lg-12">
    <table class="table table-bordered">
        <thead class="border-dark">
            <tr class="align-content-center">

                <th>Select</th>
                <th>Trainee Id</th>
                <th>Name</th>
                <th>Round</th>
                <th>Courses</th>
                <th>Note</th>
                <th>Attend Status</th>
                <th>Action</th>  
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${map.tList}" var="t" >
            <tr >
                <td>
                    <input type="checkbox" id="" class="border" name="paymentStatus" value="">
                </td>
                <td>${t.id}</td>
                <td>${t.name}</td>
                <td>${t.round}</td>
                <td>${t.courses}</td> 
                <td>
                    <input type="hidden" id="note" value="${p.note}" name="note[]" />
                </td>
                <td>
                    <input type="text" id="attendStatus" value="${p.attendStatus}" name="attendStatus[]" />
                </td>
                <td>
                    <input type="hidden" id="tId" value="${p.id}" name="eId[]" />
                    <input type="hidden" id="name" value="${p.name}" name="name[]" />
                    <input type="hidden" id="designation" value="${p.round}" name="round[]" />
                    <input type="hidden" id="email" value="${p.courses}" name="courses[]" />
                </td>
                <td>
                    <button type="button" class="btn btn-info">Send SMS</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <button type="submit" class="btn btn-outline-primary">All Attend</button>
</div>
                
                <c:forEach items="${map.tList}" var="t">
                            <tr >
                                <td>
                                    <input type="checkbox" id="" class="border" name="attStatus" value="">
                                </td>
                                <td>${t.id}</td>
                                <td>${t.name}</td>
                                <td>${t.round}</td>
                                <td>${t.email}</td> 
<!--                                <td>${c.courses}</td>
                                <td>${c.code}</td> -->
                                <td>
                                    <input type="hidden" id="note" value="{c.courses}" name="attNote[]" />
                                </td>
                                <td>
                                    <input type="text" id="note" value="" name="attNote[]" />
                                </td>
                                <td>
                                    <input type="text" id="attendStatus" value="" name="attendStatus[]" />
                                </td>
                                <td>
                                    <button type="button" class="btn btn-info">Send SMS</button>
                                </td>
                            </tr>
                        </c:forEach>


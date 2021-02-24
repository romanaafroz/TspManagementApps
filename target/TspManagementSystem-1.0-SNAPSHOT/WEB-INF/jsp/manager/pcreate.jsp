<div class="form-group">
    <label for="emp_id">Emp_Id:</label>

    <select class="form-control" name="emp_id">
        <c:forEach var="e" items="${map.eList}">
            <option value="${e.id}">${e.id}</option>
        </c:forEach>

    </select>
</div>

<div class="form-group">
    <label for="name">Name:</label>
    <select class="form-control" name="name">
        <c:forEach var="e" items="${map.eList}">
            <option value="${e.id}">${e.name}</option>
        </c:forEach>
    </select>
</div>

<div class="form-group">
    <label for="gender">gender:</label>
    <select class="form-control" name="gender">
        <c:forEach var="e" items="${map.eList}">
            <option value="${e.id}">${e.gender}</option>
        </c:forEach>
    </select>
</div>
        
        
            <div class="form-group">
                <label for="email">Email:</label>
                <select class="form-control" name="name">
                    <c:forEach var="e" items="${map.eList}">
                        <option value="${e.id}">${e.Email}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label for="contact">Contact:</label>
                <select class="form-control" name="name">
                    <c:forEach var="e" items="${map.eList}">
                        <option value="${e.id}">${e.contact}</option>
                    </c:forEach>
                </select>
            </div>
                    
                    

            <div class="form-group">
                <label for="address">Address:</label>
                <select class="form-coneLtrol" name="name">
                    <c:forEach var="e" items="${map.ist}">
                        <option value="${e.id}">${e.address}</option>
                    </c:forEach>
                </select>
            </div>-->
            
            
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td>${p.gender}</td>
                            <td>${p.designation}</td>
                            <td>${p.salary}</td>                          
                            <td>${p.email}</td>
                            <td>${p.contact}</td>
                            <td>${p.address}</td>
                            
<!--                            <td>${p.increment}</td>
                            <td>${p.fCount}</td>
                            <td>${p.bonus}</td>-->
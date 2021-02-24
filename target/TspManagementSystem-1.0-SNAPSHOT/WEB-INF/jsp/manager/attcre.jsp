<c:forEach var="a" items="${map}">
    <td><input type = "checkbox" class="border" name="attStatus" value = ""></td>
    <td>${a.tList.id}</td>
    <td>${a.tList.name}</td>
    <td>${a.tList.round}</td>
    <td>${a.tList.email}</td>
    <td>
        <input type = "text" id ="attNote" value = ""/>
    </td>
    <td>
        <input type = "text" id = "attStatus" value = ""/>
    </td>
    <td>
        <button type = "button" class = "btn btn-info"> Absent </button>
    </td>
</c:forEach>
<input type="hidden" value="" name="date" id="date"/>
<input type="hidden" value="" name="time" id="time"/>
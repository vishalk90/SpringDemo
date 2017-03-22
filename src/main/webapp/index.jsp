<html>
<body>
<h2>Hello World!</h2>
<form action="add">
    <input type="text" name="f1">
    <input type="text" name="f2">
    <input type="submit">
    <%=
    "Result = "
            + request.getAttribute("result")
    %>
</form>
</body>
</html>

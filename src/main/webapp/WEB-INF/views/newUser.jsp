
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>newUser</title>
</head>
<body>
<h3> User Registration</h3>

<form action="addUser" method = "post">

    User Name: <input type="text" name="userLogin"><br>
    First Name: <input type="text" name="firstName"><br>
    Last Name: <input type="text" name="lastName"><br>
    Phone Number: <input type="tel" name="phoneNumber"><br>
    Password: <input type="password" name="password"><br>
        <input type="submit" value="submit">
    </form>

</body>
</html>

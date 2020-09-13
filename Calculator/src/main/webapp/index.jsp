<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body style="text-align: center;margin-top: 10%;">

    <form action="/calculate" method="POST">
        
        <label for="fname">Number 1:</label>
        <input type="text" id="fnum" name="a"><br><br>
        <label for="lname">Number 2:</label>
        <input type="text" id="lnum" name="b"><br><br>
        <button type="submit" value="add" name="func">Add</button>
        <button type="submit" value="sub" name="func">Subtract</button>
        <button type="submit" value="mul" name="func">Multiply</button>
        <button type="submit" value="div" name="func">Divide</button>


    </form>
    <h2>Answer:${ans}</h2>
  
</body>
</html>
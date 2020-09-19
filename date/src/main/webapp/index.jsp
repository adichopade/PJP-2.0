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
        
        <label for="fname">Date 1:</label>
        <input type="text" id="fnum"  name="a"><br><br>
        <label for="lname">Date 2:</label>
        <input type="text" id="lnum" name="b"><br><br><br><br>
        <select name="item">
		    <option value="1">Tomorrow</option>
		    <option value="2">Day-after- tomorrow</option>
		    <option value="3">yesterday</option>
		    <option value="4">Day-before-yesterday</option>
		    <option value="5">Last week</option>
		    <option value="6">Last Month</option>
		    <option value="7">Next week</option>
		    <option value="8">Next month</option>
		    <option value="9">Next Year</option>
		    <option value="10">Last year</option>
		    <option value="11">n weeks from now</option>
		    <option value="12">n days from now</option>
		    <option value="13">n months from now</option>
		    <option value="14">n days earlier</option>
		    <option value="15">n weeks earlier</option>
		    <option value="16">n months earlier</option>
		    <option value="17">n years earlier</option>
		    <option value="18">n years from now</option>
		    <option value="19">Difference between dates</option>
		    <option value="20">Get Day</option>
		    <option value="21">Get Week</option>
		    <option value="22">Difference between months</option>
		    <option value="23">Difference between years</option>
  		</select><br><br><br>
  		<input type="text" name="number" value=0><br><br>
        <button type="submit" name="func">Find</button>
        
           


    </form>
    
    <h2>Answer:${ans}</h2>
    
    
  
</body>
</html>
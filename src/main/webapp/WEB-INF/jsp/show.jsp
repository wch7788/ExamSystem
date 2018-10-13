<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台查看</title>
</head>
<body>
<table border="1" align="center">
<tr>
<th>考生ID</th>
<th>试卷编号</th>
<th>成绩</th>
<th>试卷及答案</th>
</tr>
<c:forEach var="user" items="${users}">
<tr>
<td>${user.id}</td>
<td>${user.paper.id}</td>
<td>${user.paper.grade}</td>
<td><p>题目:${user.paper.paperquestions[0].question.question} 答案:${user.paper.paperquestions[0].question.trueanswer.answer}</p>
<p>题目:${user.paper.paperquestions[1].question.question} 答案:${user.paper.paperquestions[1].question.trueanswer.answer}</p>
<p>题目:${user.paper.paperquestions[2].question.question} 答案:${user.paper.paperquestions[2].question.trueanswer.answer}</p>
<p>题目:${user.paper.paperquestions[3].question.question} 答案:${user.paper.paperquestions[3].question.trueanswer.answer}</p>
<p>题目:${user.paper.paperquestions[4].question.question} 答案:${user.paper.paperquestions[4].question.trueanswer.answer}</p>
<p>题目:${user.paper.paperquestions[5].question.question} 答案:${user.paper.paperquestions[5].question.trueanswer.answer}</p>


</td>
</tr>
</c:forEach> 


</table>
</body>
</html>
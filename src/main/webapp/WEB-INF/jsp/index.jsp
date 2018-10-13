<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考试界面</title>
</head>
<body>
<h1>考试界面</h1>
<form action="FinshExam" method="get">
<c:forEach var="question" items="${questions}">
 <span>${question.question}</span>
 <div>
 <input type="radio" name="${question.id}" value="${question.answers[0].id}"><label>A:</label> ${question.answers[0].answer}
 <input type="radio" name="${question.id}" value="${question.answers[1].id}"><label>B:</label>${question.answers[1].answer}
 <input type="radio" name="${question.id}" value="${question.answers[2].id}"><label>C:</label>${question.answers[2].answer}
 <input type="radio" name="${question.id}" value="${question.answers[3].id}"><label>D:</label>${question.answers[3].answer}
 </div>
</c:forEach>
<input type="submit" value="提交">
</form>
</body>
</html>
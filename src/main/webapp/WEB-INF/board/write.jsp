<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <a href = "<%=request.getContextPath()%>">home</a>
 <a href = "list">목록보기</a>
 <h1>글쓰기 페이지입니다.</h1>
 <form action = "write.nowon" method = "post">
  	<p>
  		<input type = "text" name="write" placeholder="작성자">
  	</p>
  	<p>
  		<input type = "text" name="subject" placeholder="제목을 입력">
  	</p>
  	<p>
  		<textarea = "5" name ="5" cosl = "100" placeholder="내용을 입력"></textarea>
  	</p>
  	
  	<p>
  		<button type = "submit">글 작성 완료</button>
  	</p>
 </form>
</body>
</html>
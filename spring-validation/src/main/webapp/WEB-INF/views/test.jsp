<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入力画面</title>
</head>
<body>
<h1>入力画面</h1>
<form:form modelAttribute="testForm" action="test">
<dl>
  <dt>名前</dt>
  <dd>
    <form:input path="name"/>
    <form:errors path="name"/>
  </dd>
</dl>
<button type="submit" name="_event_proceed" >テスト</button>
</form:form>
</body>
</html>

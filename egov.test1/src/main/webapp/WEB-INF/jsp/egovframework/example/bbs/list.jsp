<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
  /**
  * @Class Name : egovSampleList.jsp
  * @Description : Sample List 화면
  * @Modification Information
  *
  *   수정일         수정자                   수정내용
  *  -------    --------    ---------------------------
  *  2009.02.01            최초 생성
  *
  * author 실행환경 개발팀
  * since 2009.02.01
  *
  * Copyright (C) 2009 by MOPAS  All right reserved.
  */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title><spring:message code="title.sample" /></title>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/egovframework/sample.css'/>"/>
    <link type="text/css" rel="stylesheet" href="<c:url value='/css/comm/import.css'/>"/>
</head>

<body style="text-align:center; margin:0 auto; display:inline; padding-top:100px;">


<div style="width: 700px;">
		<table class="bbs" cellspacing="0" summary="번호, 구분, 제목, 작성자, 첨부, 작성일, 조회수"  >
		<thead>
		<tr>
			<th>회차</th>
			<th>날짜</th>
			<th>번호1</th>
			<th>번호2</th>
			<th>번호3</th>
			<th>번호4</th>
			<th>번호5</th>
			<th>번호6</th>
			<th>보너스</th>
		</tr>
		</thead>
		<c:forEach var="dto" items="${list}" varStatus="status">
				<tr>
					<td>${dto.num }</td>
					<td>${dto.update_d }</td>
					<td>${dto.su1 }</td>
					<td>${dto.su2 }</td>
					<td>${dto.su3 }</td>
					<td>${dto.su4 }</td>
					<td>${dto.su5 }</td>
					<td>${dto.su6 }</td>
					<td>${dto.su7 }</td>
				</tr>
		</c:forEach>
		
		</table>
</div>

</body>
</html>

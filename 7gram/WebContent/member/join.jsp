<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- 
sql 계정생성방법
계정명 baseball
생성 방법 cmd 접속후 
sqlplus "/as sysdba" 로 sql 접속후 
create user baseball identified by 1234;
생성 완료한뒤에 
grant connect, dba, resource to baseball;
로 권한을 부여한다.

sql tools로 baseball에 접속한뒤 아래 테이블 생성 하면 회원가입할수잇음 
create table bb_member(
    idx number primary key,
    id varchar2(20),
    name varchar2(20),
    pwd varchar2(20),
    email varchar2(100),
    addr varchar2(100)
    )

create sequence bb_member_idx
start with 1
increment by 1 nocache
maxvalue 100000 cycle
 -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
<section>
	<article>
		<form name="memberJoin" action="memberJoin.bb">
			<table>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<th>E-Mail</th>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name="addr"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="생성하기">
					<input type="reset" value="다시작성">
					</td>
				</tr>
			</table>
		</form>
	</article>
</section>
</body>
</html>
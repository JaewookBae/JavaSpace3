-- 1. 계정 만들기(system계정 접속)
create User javalink identified by javalink;
grant connect, resource to javalink;

-- 2. 계정 속성 입력
create table member(
        ID varchar2(15), 
        PASSWORD varchar2(10), 
        NAME varchar2(10), 
        AGE number,
        ADDR varchar2(10), 
        EMAIL varchar2(30), primary key(id));
        
insert into member values('aaa','aaa','홍길동',22,'서울시','a@a.com');
commit;

select * from table member;
-- 테이블 구조를 결정하는 DDL로 테이블 생성, 변경, 삭제
-- CREATE
-- ALTER
-- DROP
-- 사원번호, 사원명, 급여 3개의 칼럼으로 구성된 EMP01 테이블
CREATE TABLE EMP01
(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(20),
    SAL   NUMBER(7, 2)
);
SELECT *
FROM EMP01;
-- 기존 테이블 복사
CREATE TABLE EMPLOYEES02
AS
SELECT *
FROM EMPLOYEES;

SELECT *
FROM TAB;

-- ALTER 로 테이블 구조 변경
-- ADD(컬럼명 자료형)절을 사용하여 새로운 칼럼을 추가한다.
-- MODIFY(컬럼명, 자료형)절을 사용하여 기존 칼럼을 수정한다.
-- DROP COLUMN 컬럼명절을 사용하여 기존 컬럼을 삭제한다.



-- EMP01 테이블에 문자 타입의 직급(JOB) 칼럼을 추가
ALTER TABLE EMP01
    ADD (JOB VARCHAR2(9));
-- 변경 확인
DESC EMP01;

-- 문제 이미 존재하는 EMP01 테이블에 입사일 컬럼(CREDATE)를 날짜형으로 추가하라.
ALTER TABLE EMP01
    ADD (CREDATE DATE);
-- 변경 확인
DESC EMP01;


--기존 칼럼 수정
-- ALTER TABLE  명령어에 MODIFY 를 사용하여 칼럼을 수정한다. 타입, 크기를 변경할 수 있으나 자료가 있으면 제약이 있다.

-- 직급을 최대 30자까지 입력할 수 있도록 크기 수정
ALTER TABLE EMP01
    MODIFY (JOB VARCHAR2(30));
-- 변경 확인
DESC EMP01;

-- ALTER TABLE로 기존 칼럼명 변경
-- 입사입 컬럼 CREDATE를 REGDATE로 변경
ALTER TABLE EMP01
    RENAME COLUMN CREDATE TO REGDATE;

-- ALTER TABLE로 기존 칼럼 삭제
-- 직급(JOB) 칼럼을 삭제
ALTER TABLE EMP01
    DROP COLUMN JOB;

-- 순서를 바꾸고자 할 때 사용하는 명령
ALTER TABLE EMP01
    MODIFY ENAME INVISIBLE;
ALTER TABLE EMP01
    MODIFY SAL INVISIBLE;

ALTER TABLE EMP01
    MODIFY SAL VISIBLE;
ALTER TABLE EMP01
    MODIFY ENAME VISIBLE;



-- DROP TABLE 로 테이블 구조 삭제
DROP TABLE EMP01;
-- 확인
SELECT *
FROM TAB;
-- 휴지통 (RECYCLEBIN) 보기
SELECT *
FROM RECYCLEBIN;
-- 휴지통 비우기
PURGE RECYCLEBIN;

-- 실수로 지운 테이블이라 삭제를 취소하려면 다음과 같은 명령으로 복구하면 된다.
FLASHBACK TABLE EMP01 TO BEFORE DROP;
-- 확인
SELECT *
FROM TAB;

-- 새로운 이름으로 복원하는 방법
FLASHBACK TABLE EMP01 TO BEFORE DROP
    RENAME TO EMP02;

-- 휴지통에 넣지 않고 바로 테이블을 삭제하는 방법
DROP TABLE EMP02 PURGE;

-- 테이블 명을 변경하는 RENAME 문
-- EMPLOYEES02 를 EMPLOYEES01 로 변경
RENAME EMPLOYEES02
    TO EMPLOYEES01;
-- 확인
SELECT *
FROM TAB;

-- 테이블의 모든 로우를 제거해 TRUNCATE 문
-- EMPLOYEES01 테이블의 모든 로우를 제거
SELECT  *
FROM EMPLOYEES01;

TRUNCATE TABLE EMPLOYEES01;

SELECT  *
FROM EMPLOYEES01;

-- DELETE 데이터만 지워지고 쓰고 있던 디스크상의 공간을 그대로 가지고 있다.
-- TRUNCATE 모든 데이터를 삭제하고 디스크상의 공간도 줄어들게 된다.
-- DROP 데이터와 테이블 전체를 삭제하게 된다.

-- 실습

CREATE TABLE TB_CUSTOMER(
  CUSTOMER_CD CHAR(7) PRIMARY KEY, -- 고객코드
    CUSTOMER_NM VARCHAR2(20) NOT NULL, -- 고객명
    MW_FLG CHAR(1) NOT NULL, -- 성별구분
    BIRTH_DAY CHAR(8) NOT NULL, -- 생일
    PHONE_NUMBER VARCHAR2(16), -- 전화번호
    EMAIL VARCHAR2(30), -- 이메일
    TOTAL_POINT NUMBER(10), -- 누적포인트
    REG_DTTM CHAR(14) -- 등록일
);

SELECT *
FROM TAB;

DESC TO_CUSTOMER;
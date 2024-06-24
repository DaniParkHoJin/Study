-- 무결성 제약 조건
-- 테이터 베이스 내의 데이터에 대한 정확성, 일관석, 유효성, 신뢰성을 보장하기 위해
-- 데이터 변경 혹은 수정 시 여러가지 제한을 두어 데이터의 정확성을 보증하는 것을 말한다.
-- 제약조건이란 바람직하지 않은 데이터가 저장되는 것을 방지하기 위해
-- 테이블을 생성할 때 각 컬럼에 대해서 정희하는 여러가지 규칙을 말한다.
-- NOT NULL NULL을 허용하지 않는다.
-- UNIQUE 중복된 값을 허용하지 않는다.
-- PRIMARY KEY NULL을 허용하지 않고 중복된 값을 허용하지 않는다.
-- FOREIGN KEY 참조되는 테이블의 칼럼의 값이 재하면 허용한다.
-- CHECK 저장 가능한 테이터 값의 범위나 조건을 지정하여 설정한 값만 허용한다.

-- NOT NULL 제약조건
CREATE TABLE EMP01
(
    EMPNO  NUMBER(4)    NOT NULL,
    ENAME  VARCHAR2(10) NOT NULL,
    JOB    VARCHAR2(9),
    DEPTNO NUMBER(4)
);
INSERT INTO EMP01
VALUES (NULL, NULL, 'SALESMAN', 30); -- 오류 발생

INSERT INTO EMP01
VALUES (7499, 'ALLEN', 'SALESMAN', 30);
-- 정상 입력
-- ENPNO가 중복이 가능하므로 중복제약을 위해 UNIQUE가 입력되어야 함.

CREATE TABLE EMP02
(
    EMPNO  NUMBER(4) UNIQUE,
    ENAME  VARCHAR2(10) NOT NULL,
    JOB    VARCHAR2(9),
    DEPTNO NUMBER(4)
);
INSERT INTO EMP02
VALUES (7499, 'ALLEN', 'SALESMAN', 30);
-- 정상 입력
-- 중복 입력 시도
INSERT INTO EMP02
VALUES (7499, 'ALLEN', 'SALESMAN', 30);
-- 무결성 제약 조건 위배로 오류
-- 그러나 NUL L값은 두번 입력 가능함.
INSERT INTO EMP02
VALUES (NULL, 'ALLEN', 'SALESMAN', 30);
INSERT INTO EMP02
VALUES (NULL, 'ALLEN', 'SALESMAN', 30);


--  외래키 연습을 위한 테이블 생성
CREATE TABLE DEPT01
(
    DEPTNO NUMBER NOT NULL,
    DNAME  VARCHAR2(14) DEFAULT NULL,
    LOC    VARCHAR2(13) DEFAULT NULL,
    PRIMARY KEY (DEPTNO)
);
-- 외래키 연습을 위한 데이터 입력
INSERT INTO DEPT01(DEPTNO, DNAME, LOC)
VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT01(DEPTNO, DNAME, LOC)
VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT01(DEPTNO, DNAME, LOC)
VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO DEPT01(DEPTNO, DNAME, LOC)
VALUES (40, 'OPERATIONS', 'BOSTON');
INSERT INTO DEPT01(DEPTNO, DNAME, LOC)
VALUES (50, NULL, NULL);

COMMIT;
SELECT *
FROM DEPT01;

-- UNIQUE는 NULL을 예외로 간주한다. 따라 UNIQUE는 NOT NULL 과 같이 사용한다.

-- 테이터 딕셔너리
-- DBA_XXXX 데이터베이스 관리자만 접근 가능한 객체 등의 정보 조회
-- ALL_XXXX 자신 계정 소유 또는 권한을 부여 받은 객체 등에 관한 정보 조회
-- USER_XXXX 자신의 계정이 소유한 객체 등에 관한 정보 조회

-- 제약조건 확인하기
-- P-> PRIMARY KEY
-- R-> FOREIGN KEY
-- U-> UNIQUE
-- C-> CHECK NOT NULL
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'EMP01';

-- 데이터 구분을 위한 PRIMARY KEY 제약 조건
-- 식별 기능을 갖는 칼럼은 유일하면서도 NULL값을 허용하지 말아야 한다.
-- NOT NULL + UNIQUE

-- 참조 무결성 조건을 위한 FOREIGN KEY 제약 조건
-- 부모 테이블이 먼저 있어야 하며 부모키가 되기 위한 칼럼은 키본 키나 유일키로 성정되어 있어야 한다.
CREATE TABLE EMP04
(
    EMPNO  NUMBER(4) PRIMARY KEY,
    ENAME  VARCHAR2(10) NOT NULL,
    JOB    VARCHAR2(9),
    DEPTNO NUMBER(4) REFERENCES DEPT01 (DEPTNO)
);


-- CHECH 제약 조건
-- 입력되는 값을 체크하여 설정된 값 이외의 값이 들어오면 오류 메시지와 함께 명령이 수행되지 못하게 한다.
CREATE TABLE EMP05
(
    ENPNO  NUMBER(4) PRIMARY KEY,
    ENAME  VARCHAR2(10) NOT NULL,
    GENDER VARCHAR2(1) CHECK ( GENDER IN ('M', 'F'))
);
INSERT INTO EMP05 (ENPNO, ENAME, GENDER)
VALUES (7566, 'JONES', 'M');
INSERT INTO EMP05 (ENPNO, ENAME, GENDER)
VALUES (7566, 'JONES', 'A');
--오류 발생


-- 제약조건을 지정하는 두 가지 방식
-- 칼럼 레벨
CREATE TABLE EMP07
(
    ENPNO NUMBER(4) PRIMARY KEY,
    ENAME VARCHAR2(10) NOT NULL UNIQUE
);
-- 테이블 레벨
CREATE TABLE EMP07
(
    ENPNO NUMBER(4),
    ENAME VARCHAR2(10) NOT NULL,
    PRIMARY KEY (ENPNO),
    UNIQUE (ENAME)
);

-- 제약 조건의 비활성화와 CASCADE
-- DISABLE CONSTRAINT : 제약조건의 일시 비활성화
-- ENABLE CONSTRAINT : 비활성화된 제약 조건을 해제하여 다시 활성화


-- 문제
CREATE TABLE SUBJECT
(
    NO     NUMBER       NOT NULL PRIMARY KEY,
    S_SUM  VARCHAR2(2)  NOT NULL UNIQUE,
    S_NAME VARCHAR2(24) NOT NULL
);

CREATE TABLE STUDENT
(
    NO          NUMBER       NOT NULL PRIMARY KEY,
    SD_NUM      VARCHAR2(8)  NOT NULL UNIQUE,
    SD_NAME     VARCHAR2(12) NOT NULL,
    SD_ID       VARCHAR2(12) NOT NULL UNIQUE,
    SD_PASSWORD VARCHAR2(12) NOT NULL,
    S_NUM       VARCHAR2(2)  NOT NULL,
    SD_BIRTHDAY CHAR(8)      NOT NULL,
    SD_PHONE    VARCHAR2(15) NOT NULL,
    SD_ADDRESS  VARCHAR2(80) NOT NULL,
    SD_EMAIL    VARCHAR2(40) NOT NULL,
    SD_DATE     DATE DEFAULT SYSDATE,
    FOREIGN KEY (S_NUM) REFERENCES SUBJECT (S_SUM)
);

CREATE TABLE lesson(
    no NUMBER NOT NULL ,
    l_abbre VARCHAR2(2) NOT NULL,
    l_name VARCHAR2(20) NOT NULL ,
    PRIMARY KEY (no),
    UNIQUE (L_ABBRE)
);
CREATE TABLE trainee(
    no NUMBER NOT NULL ,
    sd_num VARCHAR2(8) NOT NULL ,
    l_abbre VARCHAR2(2) NOT NULL ,
    t_section VARCHAR2(20) NOT NULL ,
    t_date DATE DEFAULT SYSDATE,
    PRIMARY KEY (no),
    FOREIGN KEY (sd_num) REFERENCES STUDENT(sd_num),
    FOREIGN KEY (L_AbbRE) REFERENCES lesson(L_ABBRE)
);
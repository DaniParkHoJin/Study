CREATE TABLE v_gogek(
g_code NUMBER(5) PRIMARY KEY,
g_name VARCHAR2(20) NOT NULL,
g_age NUMBER(3),
g_addr VARCHAR2(50),
g_tel VARCHAR2(20)
);
CREATE TABLE video(
v_code NUMBER(5) PRIMARY KEY,
v_title VARCHAR2(50) NOT NULL,
v_genre VARCHAR2(30),
v_pay NUMBER(7) NOT NULL,
v_lend_state NUMBER(1),
v_make_company VARCHAR2(50),
v_make_date DATE,
v_view_age NUMBER(1)
);
CREATE TABLE lend_return(
lr_code NUMBER(5) PRIMARY KEY,
g_code NUMBER(5) NOT NULL,
v_code NUMBER(5) NOT NULL,
l_date DATE,
r_plan_date DATE,
l_total_pay NUMBER(7),
FOREIGN KEY(g_code) REFERENCES v_gogek(g_code),
FOREIGN KEY(v_code) REFERENCES video(v_code)
);
또는
CREATE TABLE lend_return(
lr_code NUMBER(5) PRIMARY KEY,
g_code NUMBER(5) NOT NULL REFERENCES v_gogek(g_code),
v_code NUMBER(5) NOT NULL REFERENCES video(v_code),
l_date DATE,
r_plan_date DATE,
l_total_pay NUMBER(7)
);
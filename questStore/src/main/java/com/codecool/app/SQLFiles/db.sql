DROP TABLE IF EXISTS systemUser CASCADE;
CREATE TABLE systemUser
(id_systemUser SERIAL PRIMARY KEY,
name VARCHAR(50),
surname VARCHAR(50),
email VARCHAR(50) NOT NULL UNIQUE,
phone VARCHAR(50) NOT NULL,
password VARCHAR(10) NOT NULL);

DROP TABLE IF EXISTS manager;
CREATE TABLE manager
(id_manager SERIAL PRIMARY KEY,
id_sustemUser INTEGER REFERENCES systemUser);

DROP TABLE IF EXISTS mentor CASCADE;
CREATE TABLE mentor
(id_mentor SERIAL PRIMARY KEY,
id_sustemUser INTEGER REFERENCES systemUser);

DROP TABLE IF EXISTS level CASCADE;
CREATE TABLE level
(id_level SERIAL PRIMARY KEY,
name VARCHAR(50),
coins INTEGER NOT NULL);

DROP TABLE IF EXISTS student CASCADE;
CREATE TABLE student
(id_student SERIAL PRIMARY KEY,
id_sustemUser INTEGER REFERENCES systemUser,
id_class INTEGER REFERENCES class);

DROP TABLE IF EXISTS class CASCADE;
CREATE TABLE class
(id_class SERIAL PRIMARY KEY,
name VARCHAR(50) UNIQUE NOT NULL);

DROP TABLE IF EXISTS mentor_class;
CREATE TABLE mentor_class
(id_mentor_class SERIAL PRIMARY KEY,
id_mentor INTEGER REFERENCES mentor,
id_class INTEGER REFERENCES class);

DROP TABLE IF EXISTS student_class; --

DROP TABLE IF EXISTS artifact CASCADE;
CREATE TABLE artifact
(id_artifact SERIAL PRIMARY KEY,
name VARCHAR(50) UNIQUE NOT NULL,
description TEXT,
type VARCHAR(50),
price INTEGER NOT NULL);

DROP TABLE IF EXISTS team CASCADE;
CREATE TABLE team
(id_team SERIAL PRIMARY KEY,
id_artifact INTEGER REFERENCES artifact,
name VARCHAR(50) UNIQUE NOT NULL,
completed BOOLEAN DEFAULT'no',
used BOOLEAN DEFAULT 'no',
leader INTEGER,
purchasePrice INTEGER);

DROP TABLE IF EXISTS student_team;
CREATE TABLE student_team
(id_student INTEGER REFERENCES student,
id_team INTEGER REFERENCES team,
offeredMoney INTEGER NOT NULL,
approved BOOLEAN DEFAULT 'no');

DROP TABLE IF EXISTS student_artifact;
CREATE TABLE student_artifact
(id_student_artifact SERIAL PRIMARY KEY,
id_student INTEGER REFERENCES student,
id_artifact INTEGER REFERENCES artifact,
used BOOLEAN DEFAULT 'no',
purchasePrice INTEGER NOT NULL);

DROP TABLE IF EXISTS quest_type CASCADE;
CREATE TABLE quest_type
(id_questType SERIAL PRIMARY KEY,
name VARCHAR(50) NOT NULL);

DROP TABLE IF EXISTS quest CASCADE;
CREATE TABLE quest
(id_quest SERIAL PRIMARY KEY,
name VARCHAR(50) NOT NULL,
description TEXT,
id_questType INTEGER REFERENCES quest_type,
prize INTEGER NOT NULL);

DROP TABLE IF EXISTS student_quest;
CREATE TABLE student_quest
(id_student_quest SERIAL PRIMARY KEY,
id_student INTEGER REFERENCES student,
id_quest INTEGER REFERENCES quest,
approved VARCHAR(10) DEFAULT 'waiting');
CREATE TABLE tbl_course
  (
     id         UUID NOT NULL,
     name       VARCHAR(255),
     rate       INT2 NOT NULL,
     workload   INT4 NOT NULL,
     teacher_id UUID,
     PRIMARY KEY (id)
  );

CREATE TABLE tbl_teacher
  (
     id         UUID NOT NULL,
     email      VARCHAR(255),
     name       VARCHAR(255),
     pictureurl VARCHAR(255),
     PRIMARY KEY (id)
  );

ALTER TABLE tbl_course
  ADD CONSTRAINT fk_course_teacher FOREIGN KEY (teacher_id) REFERENCES tbl_teacher;
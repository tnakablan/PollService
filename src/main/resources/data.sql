DROP TABLE IF EXISTS poll;

CREATE TABLE poll (
                      id int NOT NULL AUTO_INCREMENT,
                      question varchar(300) NOT NULL,
                      first_answer varchar(300) NOT NULL,
                      second_answer varchar(300) NOT NULL,
                      third_answer varchar(300) NOT NULL,
                      fourth_answer varchar(300) NOT NULL,
                      PRIMARY KEY (id)
);

CREATE TABLE answers (
                         user_id  int NOT NULL ,
                         poll_id int NOT NULL,
                         answer_number varchar(300) NOT NULL,
                         PRIMARY KEY (user_id, poll_id),
                         FOREIGN KEY (poll_id) REFERENCES poll (id)
);
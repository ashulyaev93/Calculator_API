CREATE TABLE history_calculation (
   id INT GENERATED BY DEFAULT AS IDENTITY(START WITH 100, INCREMENT BY 1) PRIMARY KEY,
   expression VARCHAR (255),
   result FLOAT,
   date TIMESTAMP(8)
);


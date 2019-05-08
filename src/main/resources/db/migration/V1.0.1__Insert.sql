INSERT INTO books (id, item, description)
VALUES
(1, 'Camel',    'Camel in Action'),
(2, 'ActiveMQ', 'ActiveMQ in Action');



INSERT INTO orders (id, PROCESSED, AMOUNT,BOOK_ID)
VALUES
(1, TRUE,2,1),
(2,FALSE,3,2);
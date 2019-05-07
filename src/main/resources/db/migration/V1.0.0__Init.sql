Create TABLE BOOKS (
                                id IDENTITY NOT NULL PRIMARY KEY ,
                                item    VARCHAR(100) NOT NULL,
                                description   VARCHAR(300),

);



Create TABLE ORDERS (
                       id IDENTITY NOT NULL PRIMARY KEY ,
                       processed    Boolean,
                       amount   INT,
                       book_id varchar(12),
);


alter table ORDERS
    add constraint FK88A9D0FF4006DFB7
        foreign key (book_id)
            references BOOKS;
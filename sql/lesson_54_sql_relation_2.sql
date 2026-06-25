CREATE TABLE IF NOT EXISTS Author
(
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 author_name TEXT NOT NULL
 );
 
  
CREATE TABLE IF NOT EXISTS Book
(
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 book_name TEXT NOT NULL,
 genre TEXT NOT NULL
);


CREATE TABLE IF NOT EXISTS Author_Book
(
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 author_id UUID NOT NULL REFERENCES Author(id),
 book_id UUID NOT NULL REFERENCES Book(id),
  UNIQUE (author_id, book_id)
 );
 

 CREATE TABLE IF NOT EXISTS Author_Book_v2
(
 author_id UUID NOT NULL REFERENCES Author(id),
 book_id UUID NOT NULL REFERENCES Book(id),
 PRIMARY KEY (author_id, book_id)
 )
 
 
 DROP TABLE Author_Book;
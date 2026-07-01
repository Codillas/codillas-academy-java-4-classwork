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
 author_id UUID NOT NULL REFERENCES Author(id),
 book_id UUID NOT NULL REFERENCES Book(id),
 PRIMARY KEY (author_id, book_id)
 )
 
INSERT INTO Author (author_name)
VALUES
    ('John Smith'),
    ('Anna Brown'),
    ('Peter Johnson'),
    ('Maria Wilson'),
    ('David Miller'),
    ('Robert Taylor'),
    ('Emily Davis'),
    ('Michael Anderson'),
    ('Sarah White');
    
INSERT INTO Book (book_name, genre)
VALUES
    ('Java Basics', 'Programming'),
    ('SQL for Beginners', 'Programming'),
    ('Spring Boot Guide', 'Programming'),
    ('Database Design', 'Programming'),
    ('Clean Code Practice', 'Programming'),
    ('Mystery Island', 'Novel'),
    ('The Lost City', 'Adventure');    
    
INSERT INTO Author_Book (author_id, book_id)
SELECT a.id, b.id
FROM Author a, Book b
WHERE a.author_name = 'John Smith'
  AND b.book_name = 'Java Basics';

INSERT INTO Author_Book (author_id, book_id)
SELECT a.id, b.id
FROM Author a, Book b
WHERE a.author_name = 'Anna Brown'
  AND b.book_name = 'SQL for Beginners';

INSERT INTO Author_Book (author_id, book_id)
SELECT a.id, b.id
FROM Author a, Book b
WHERE a.author_name = 'Peter Johnson'
  AND b.book_name = 'Spring Boot Guide';

INSERT INTO Author_Book (author_id, book_id)
SELECT a.id, b.id
FROM Author a, Book b
WHERE a.author_name = 'John Smith'
  AND b.book_name = 'Database Design';

INSERT INTO Author_Book (author_id, book_id)
SELECT a.id, b.id
FROM Author a, Book b
WHERE a.author_name = 'Anna Brown'
  AND b.book_name = 'Clean Code Practice';    
  
-- Inner Join
SELECT
    a.author_name,
    b.book_name,
    b.genre
FROM Author a
JOIN Author_Book ab ON a.id = ab.author_id
JOIN Book b ON b.id = ab.book_id;

-- Left joinSELECT
    a.author_name,
    b.book_name,
    b.genre
FROM Author a
LEFT JOIN Author_Book ab ON a.id = ab.author_id
LEFT JOIN Book b ON ab.book_id = b.id

--Left Join (який показуэ тільки які книги написав цей автор)
SELECT
    a.author_name,
    b.book_name,
    b.genre
FROM Author a
LEFT JOIN Author_Book ab ON a.id = ab.author_id
LEFT JOIN Book b ON ab.book_id = b.id
WHERE author_name = 'John Smith';

-- Right Join 
SELECT
    a.author_name,
    b.book_name,
    b.genre
FROM Author a
RIGHT JOIN Author_Book ab ON a.id = ab.author_id
RIGHT JOIN Book b ON ab.book_id = b.id

-- Full Join
SELECT
    a.author_name,
    b.book_name,
    b.genre
FROM Author a
FULL JOIN Author_Book ab ON a.id = ab.author_id
FULL JOIN Book b ON ab.book_id = b.id;


  
CREATE TABLE Car (
id SERIAL PRIMARY KEY,
brand TEXT,
model TEXT,
price INT,
color TEXT
);

INSERT INTO Car (brand, model, price, color)
VALUES 
        ('VW', 'Golf', 35000, 'white'),
        ('BMW', 'X5', 75000, 'black'),
        ('Toyota', 'Corola', 25000, 'Yellow'),
        ('VW', 'Touran', 40000, 'Silver'),
        ('VW', 'Golf', 35000, 'white'),
        ('BMW', 'X5', 75000, 'black'),
        ('Toyota', 'Corola', 25000, 'Yellow'),
        ('Toyota', 'Corola', 25000, 'Yellow'),
        ('Toyota', 'Corola', 25000, 'Yellow');
        
        
INSERT INTO Car (brand, model, price, color)
VALUES 
        ('VW', 'Golf', null, 'white'),
        ('BMW', 'X5', null, 'black');    
        
UPDATE Car
SET model = 'Camry', color= 'grey', price = 43000
WHERE id = 7;


UPDATE Car
SET model = 'Camry', color= 'grey', price = 47000
WHERE id = 8;

UPDATE Car
SET model = 'Camry', color= 'grey', price = 34512
WHERE id = 9;

SELECT * FROM Car;

SELECT FROM Car
WHERE price > 35000;

SELECT  FROM Car 
ORDER BY Price DESC;

DELETE FROM Car
WHERE price IS null;        
       
SELECT * FROM Car;

ALTER TABLE Car
DROP COLUMN Color;

DROP TABLE Car;

SELECT AVG(price)
FROM Car;

SELECT SUM(price)
FROM Car
WHERE brand = 'BMW';
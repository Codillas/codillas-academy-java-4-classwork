CREATE TABLE Persons (
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  first_name TEXT NOT NULL,
  last_name TEXT NOT NULL,
  address TEXT,
  city TEXT
);

ALTER TABLE Persons
ADD CONSTRAINT this_is_our_check_for_error2
CHECK (length(first_name) <= 15);

ALTER TABLE Persons
ADD COLUMN is_active BOOLEAN;

ALTER TABLE Persons
ADD COLUMN created_at DATE;

ALTER TABLE Persons
ADD COLUMN random_text TEXT UNIQUE;

ALTER TABLE Persons
RENAME COLUMN random_text to updated_text;

ALTER TABLE Persons
ADD COLUMN chek INT;

ALTER TABLE Persons
ALTER COLUMN chek TYPE BOOLEAN
using chek::BOOLEAN;


INSERT INTO Persons (first_name, last_name, address, city, created_at, is_active) 
VALUES ('First', 'Student', 'Haupt Strasse 1', 'Berlin', '2026-06-15', TRUE);


INSERT INTO Persons (first_name, last_name, address, city, created_at, is_active) 
VALUES ('Second', 'Student', 'Haupt Strasse 1', 'Berlin', '2026-06-15', TRUE);

INSERT INTO Persons (first_name, last_name, address, city, created_at, is_active, random_text) 
VALUES ('Third', 'Student', 'Haupt Strasse 1', 'Berlin', '2026-06-15', TRUE, 'randomtext');

INSERT INTO Persons (first_name, last_name, address, city, created_at, is_active, random_text) 
VALUES ('Other', 'Professor', 'Mittel Strasse 1', 'Leipzig', '2026-06-18', TRUE, 'other Text');
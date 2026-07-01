CREATE TABLE IF NOT EXISTS cars
 (
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 brand TEXT NOT NULL,
 model TEXT NOT NULL,
 vin_code TEXT NOT NULL UNIQUE
 );
 
CREATE TABLE IF NOT EXISTS car_keys
(
 id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
 code CHAR(6) NOT NULL UNIQUE,
 car_id UUID NOT NULL UNIQUE REFERENCES cars(id) ON DELETE CASCADE
 );
 
INSERT INTO cars (brand, model, vin_code)
VALUES ('VW', 'Golf', 123546),
       ('Ford', 'Focus', 345312),
       ('BMW', 'M4', 132434),
       ('Audi', 'Q7', 345123),
       ('BMW', 'X5', 142434),
       ('BMW', 'M3', 132734);
       

INSERT INTO car_keys (code, car_id)
VALUES ('455123', 'f3eb6ea9-921a-4a5e-b5b1-4736f1e6044f');
       ('453127', '9794caf1-e1d9-453c-a397-934378b51c96'),
       ('453128', 'd801c98d-2213-4e4d-add7-c0bcb0e5cce0'),
       ('453129', '276e11af-6d03-486a-884d-f7f196a89fb1'),
       ('453139', '7843508b-b914-40ca-8dce-eb5747e3b852');
       
       

DELETE FROM Car_Keys
WHERE id = 'afe914fc-c985-47d8-a27d-30a4809ab179';       
       
DELETE FROM cars
WHERE id = '1cd4f306-aa1f-4ba2-9643-c285b74b676f';


SELECT * FROM car_keys
WHERE car_id = 'd801c98d-2213-4e4d-add7-c0bcb0e5cce0'

--Inner Join (пишеться просто як "Join")
SELECT
    cars.id AS car_id,
    cars.brand AS car_brand,
    cars.model AS car_model,
    cars.vin_code AS car_vin,
    car_keys.code AS car_keys_code
FROM cars
JOIN car_keys ON cars.id = car_keys.car_id
WHERE brand = 'BMW';
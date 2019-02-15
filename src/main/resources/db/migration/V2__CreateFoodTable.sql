CREATE TABLE FOOD_NUTRITIONAL_INFORMATION (
       id SERIAL PRIMARY KEY,
       name VARCHAR NOT NULL,
       calories INT NOT NULL,
       protein INT NOT NULL,
       fat INT NOT NULL,
       carbs INT NOT NULL
       )
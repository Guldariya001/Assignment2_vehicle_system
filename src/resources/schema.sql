DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS categories;

CREATE TABLE categories (
     id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE books (
    id INT PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(150) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    available BOOLEAN NOT NULL,
    category_id INT,

     CONSTRAINT fk_category
         FOREIGN KEY (category_id)
         REFERENCES categories(id)
         ON DELETE RESTRICT
);

INSERT INTO categories (id, name) VALUES
(1, 'Programming'),
(2, 'Databases'),
(3, 'Computer Science');

INSERT INTO books (id, title, author, price, available, category_id) VALUES
(1, 'Effective Java', 'Joshua Bloch', 45.0, true, 1),
(2, 'Clean Code', 'Robert Martin', 40.0, true, 1),
(3, 'Database System Concepts', 'Silberschatz', 55.0, true, 2);

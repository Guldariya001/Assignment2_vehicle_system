CREATE TABLE authors (
         author_id SERIAL PRIMARY KEY,
         name VARCHAR(100) NOT NULL
);

CREATE TABLE books (
         book_id SERIAL PRIMARY KEY,
         title VARCHAR(200) NOT NULL,
         price DOUBLE PRECISION NOT NULL,
        available BOOLEAN DEFAULT TRUE,
        author_id INT REFERENCES authors(author_id),
        type VARCHAR(20) NOT NULL
);

CREATE TABLE ebooks (
        book_id INT PRIMARY KEY REFERENCES books(book_id),
        file_size_mb DOUBLE PRECISION NOT NULL
);

CREATE TABLE printed_books (
        book_id INT PRIMARY KEY REFERENCES books(book_id),
        pages INT NOT NULL
);

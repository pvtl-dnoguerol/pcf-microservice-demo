CREATE TABLE transaction (
    id INTEGER IDENTITY PRIMARY KEY,
    date DATE NOT NULL,
    amount DOUBLE NOT NULL,
    vendor_id INTEGER NOT NULL,
    description VARCHAR(30)
);

SELECT id, name, price 
FROM products
WHERE price=30 AND id='101';

SELECT * FROM customers
WHERE name='Roman' OR name='Vasya';

SELECT price, name
FROM products
WHERE id IN ('101','102');

 SELECT *
 FROM invoices
 WHERE volume BETWEEN 2000 AND 5000;



SELECT name
FROM products
ORDER BY name;

SELECT date, SUM(volume) as sum 
FROM invoices 
GROUP BY date;


SELECT vendors.name, products.name, products.price
FROM vendors INNER JOIN products
ON vendors.id = products.vendid;

SELECT payments.id, payments.debt, currencies.name
FROM payments INNER JOIN currencies
ON payments.currencyid = currencies.id;

SELECT customers.name, orders.date
FROM orders INNER JOIN customers
ON orders.custid = customers.id;






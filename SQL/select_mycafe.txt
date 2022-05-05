SELECT id, price, name
FROM products
WHERE price=30 AND id='101';

SELECT * FROM customers
WHERE name='Roman' OR name='Vasya';

SELECT price, name
FROM products
WHERE id IN ('101','102');

SELECT *
FROM orderitems
WHERE itemprice BETWEEN 7 AND 15;



SELECT name
FROM products
ORDER BY name;

SELECT custid, COUNT(*) AS orders
FROM orders
GROUP BY custid;



SELECT vendors.name, products.name, products.price
FROM vendors INNER JOIN products
ON vendors.id = products.vendid;

SELECT financeoperations.num, financeoperations.date, currency.name
FROM financeoperations INNER JOIN currency
ON financeoperations.currencyid = currency.id;

SELECT customers.name, orders.date
FROM orders INNER JOIN customers
ON orders.custid = customers.id;






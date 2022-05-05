


INSERT INTO Customers
VALUES
('Roman', 'Khreshchatyk 21', 'Kyiv', 'roma@google.com', '1000000001'),
('Vasya', 'Volodymyrska 31', 'Kyiv', 'vasya@google.com', '1000000002'),
('Natasha', 'Pl. Lva Tolstogo 41', 'Kyiv', 'natasha@google.com', '1000000003'),
('Tanya', 'Vasilenko 51', 'Kyiv', 'tanya@google.com', '1000000004'),
('Petr', 'Garmatna 61', 'Kyiv', 'petr@google.com', '1000000005');


INSERT INTO Vendors(id, name, address, vend_city, area, post) VALUES
('1001','Kyiv KhlibB','123 Main Street','Kyiv','Kyivska','001 Nova poshta'),
('1002','Pepsi cola','231 Tolstogo Street','Kyiv','Kyivska','011 Nova poshta'),
('1003','ATB','543 Sofiivska Street','Kyiv','Kyivska','014 Nova poshta'),
('1004','Silpo','321 Bandery Street','Dnipro','Dniprovska','056 Nova poshta'),
('1005','Nemiroff', '222 Petrova Street','Lviv','Lvivska','899 Nova poshta');


INSERT INTO Waiters(id, name, workerid) VALUES
('1', 'Dasha','1001'),
('2', 'Roma','1002'),
('3', 'Mila','1003'),
('4', 'Tanya','1004'),
('5', 'Kolya','1005');


INSERT INTO Orders(num, date, waitid, custid) VALUES
(1, '2022-01-22 15:40:10','1','1000000001'),
(2, '2022-01-22 15:40:10','2','1000000002'),
(3, '2022-01-22 15:40:10','3','1000000003'),
(4, '2022-01-22 15:40:10','4','1000000004'),
(5, '2022-01-22 15:40:10','5','1000000005');


INSERT INTO cafe (id, name, city, address, site) VALUES
('1', 'Domashnya kuhnya', 'Kyiv', 'Khreshchatyk 22', 'dk.com');


INSERT INTO structure (id, name, place, address, cafeid) VALUES
('1', 'Kuhnya', '1 pverh', 'Khreshchatyk 22', '1'),
('2', 'Zal', '2 pverh', 'Khreshchatyk 22', '1'),
('3', 'Mangement', '3 pverh', 'Khreshchatyk 22', '1');


INSERT INTO positions (id, name, salary, departid) VALUES
('1', 'cooker', '15000', '1'),
('2', 'waiter', '17000', '2'),
('3', 'manager', '18000', '3');



INSERT INTO workers (id, name, surname, address, city, email, posid)VALUES
('1006', 'Petya', 'Petrov', 'Khreshchatyk', 'Kyiv', 'petya@google.com', '2'),
('1007', 'Valya', 'Valova', 'Vasilenko', 'Kyiv', 'valya@google.com', '2'),
('1008', 'Petya', 'Petrov', 'Harmatna', 'Kyiv', 'petya@google.com', '2'),
('1009', 'Misha', 'Mikhailov', 'Pobedy', 'Kyiv', 'misha@google.com', '2'),
('1010', 'Dima', 'Dimov', 'Mihailovska', 'Kyiv', 'dima@google.com', '2');


INSERT INTO Cookers (id, name, workerid)VALUES
('101', 'Petya', '1006'),
('102', 'Misha', '1007'),
('103', 'Dima', '1008'),
('104', 'Vanya', '1009'),
('105', 'Stas', '1010');


INSERT INTO currency (id, name)VALUES
('1', 'Hrivna'),
('2', 'Dollar'),
('3', 'Euro');


INSERT INTO Products VALUES
('101', '1001', '101', 'Meet', 30, 'Very butifull meet'),
('102', '1002', '101', 'Fruit', 40, 'Very butifull fruit'),
('103', '1003', '101', 'Fish', 50, 'Very butifull fish'),
('104', '1004', '101', 'Eggs', 60, 'Very butifull eggs'),
('105', '1005', '101', 'Water', 70, 'Very butifull water');


INSERT INTO Orderitems(num, item, prodid, quantity, itemprice) VALUES
(1, 1,'101', 2, 10),
(1, 2,'102', 3, 15),
(1, 3,'103', 1, 100),
(1, 4,'104', 6, 1),
(1, 5,'105', 8, 7),
(2, 1,'101', 2, 10),
(2, 2,'102', 3, 15),
(2, 3,'103', 1, 100),
(2, 4,'104', 6, 1),
(2, 5,'105', 8, 7),
(3, 1,'101', 2, 10),
(3, 2,'102', 3, 15),
(3, 3,'103', 1, 100),
(3, 4,'104', 6, 1),
(3, 5,'105', 8, 7);


INSERT INTO expense (id, name, recipient) VALUES
('1', 'komunalka', 'meriya'),
('2', 'ohrana', 'ohrana firma'),
('3', 'nalog', 'inspekciya');


INSERT INTO profit (id, name, source) VALUES
('1', 'online prodaga', 'prodaga'),
('2', 'offline', 'prodaga'),
('3', 'procent', 'bank');

INSERT INTO financeoperations VALUES
(4, '2022-01-22 15:40:10', '1', '1', 3, 1000, 2);









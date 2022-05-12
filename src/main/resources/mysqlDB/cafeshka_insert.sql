
INSERT INTO cafe (id, name, address, site, email) VALUES
(1, 'Domashnya kuhnya', 'Khreshchatyk 22', 'dk.com', 'dk.google.com');


INSERT INTO Customers
VALUES
(1000000001, 'Roman', 'Khreshchatyk 21', 'Kyiv', 'roma@google.com'),
(1000000002, 'Vasya', 'Volodymyrska 31', 'Kyiv', 'vasya@google.com'),
(1000000003,'Natasha', 'Pl. Lva Tolstogo 41', 'Kyiv', 'natasha@google.com'),
(1000000004,'Tanya', 'Vasilenko 51', 'Kyiv', 'tanya@google.com'),
(1000000005,'Petr', 'Garmatna 61', 'Kyiv', 'petr@google.com');


INSERT INTO Vendors(id, name, address, email) VALUES
(1001,'Kyiv KhlibB','123 Main Street','kk@google.com'),
(1002,'Pepsi cola','231 Tolstogo Street', 'pc@google.com'),
(1003,'ATB','543 Sofiivska Street', 'atb@google.com'),
(1004,'Silpo','321 Bandery Street', 'silpo@google.com'),
(1005,'Nemiroff', '222 Petrova Street', 'nemiroff@google.com');


INSERT INTO couriercompanies(id, name, address, email, site) VALUES
(1001,'Glovo','123 Main Street','gg@google.com', 'gg.google.com'),
(1002,'Raketa','231 Tolstogo Street', 'rr@google.com', 'rr.google.com'),
(1003,'Bolt','543 Sofiivska Street', 'bo@google.com', 'bo.google.com'),
(1004,'Food','321 Bandery Street', 'food@google.com', 'food.google.com'),
(1005,'Bystro', '222 Petrova Street', 'by@google.com', 'by.google.com');


INSERT INTO couriers(id, name, surname, phone, companyid) VALUES
(1001, 'Petya', 'Petrov', '0671234567', 1001),
(1002, 'Kolya', 'Nikolaev', '0631234567', 1002),
(1003, 'Vasya', 'Vasiliev', '0661234567', 1003),
(1004, 'Vanya', 'Ivanov', '0671234567', 1004),
(1005, 'Sidor', 'Sidorov', '0671234567', 1005);


INSERT INTO categoriesprod (id, name, description) VALUES
(1001, 'meat dishes', 'step 1, step 2, step 3'),
(1002, 'drinks', 'step 1, step 2, step 3'),
(1003, 'fish dishes', 'step 1, step 2, step 3'),
(1004, 'alcohol', 'step 1, step 2, step 3'),
(1005, 'hot drinks', 'step 1, step 2, step 3');


INSERT INTO recipies (id, name, description) VALUES
(11, 'Meet', 'step 1, step 2, step 3'),
(12, 'Fruit', 'step 1, step 2, step 3'),
(13, 'Fish', 'step 1, step 2, step 3'),
(14, 'Eggs', 'step 1, step 2, step 3'),
(15, 'Coffe', 'step 1, step 2, step 3');


INSERT INTO Products VALUES
('101', '1001', 'Meet', 30, 'Very butifull meet', 11, 1001),
('102', '1002', 'Fruit', 40, 'Very butifull fruit', 12, 1002),
('103', '1003', 'Fish', 50, 'Very butifull fish', 13, 1003),
('104', '1004', 'Eggs', 60, 'Very butifull eggs', 14, 1004),
('105', '1005', 'Water', 70, 'Very butifull water', 15, 1005);


INSERT INTO positions (id, nameposition, namedepart, salary, cafeid) VALUES
(101, 'cooker', 'kuhnya', 15000, 1),
(102, 'waiter', 'zal', 12000, 1),
(103, 'security', 'zal', 12000, 1),
(104, 'manager', 'depart of managers', 17000, 1),
(105, 'director', 'tops', 20000, 1),
(106, 'accontant', 'tops', 18000, 1);


INSERT INTO workers (id, name, surname, address, phone, email, positionid) VALUES
('1006', 'Petya', 'Petrov', 'Khreshchatyk', '0671234567', 'petya@google.com', 101),
('1007', 'Valya', 'Valova', 'Vasilenko', '0661234567', 'valya@google.com', 102),
('1008', 'Petya', 'Petrov', 'Harmatna', '0631234567', 'petya@google.com', 103),
('1009', 'Misha', 'Mikhailov', 'Pobedy', '0981234567', 'misha@google.com', 104),
('1010', 'Dima', 'Dimov', 'Mihailovska', '0931234567', 'dima@google.com', 105),
('1011', 'Galya', 'Petrenko', 'Borshagivsca', '0971234567', 'galya@google.com', 106);



INSERT INTO Orders(id, date, custid, cashierid, prodid, quantity, courierid) VALUES
(1, '2022-01-22 15:40:10', 1000000001, 1006, 101, 1, 1001),
(2, '2022-02-22 15:40:10', 1000000002, 1007, 102, 2, 1002),
(3, '2022-03-22 15:40:10', 1000000003, 1008, 103, 3, 1003),
(4, '2022-04-22 15:40:10', 1000000004, 1009, 104, 4, 1004),
(5, '2022-05-22 15:40:10', 1000000005, 1010, 105, 5, 1005);


INSERT INTO currencies (id, name) VALUES
('1', 'Hrivna'),
('2', 'Dollar'),
('3', 'Euro'),
('4', 'Frank'),
('5', 'Ena');


INSERT INTO receivers(id, name, phone, email, address) VALUES
(1001,'tax servis', '0671234567', 'kk@google.com', '123 Main Street'),
(1002,'komunalnye','0661234567', 'pc@google.com', '231 Tolstogo Street'),
(1003,'electrical servis','0631234567', 'atb@google.com', '543 Sofiivska Street'),
(1004,'Musician group','0731234567','silpo@google.com', '321 Bandery Street'),
(1005,'sysadmin', '0971234567', 'nemiroff@google.com', '222 Petrova Street');


INSERT INTO invoices(id, date, receiverid, description, volume) VALUES
(1, '2022-01-22 15:40:10', 1001, 'Uplata nalogov', 2000),
(2, '2022-02-22 15:40:10', 1002, 'Komunalnye plategy', 3000),
(3, '2022-03-22 15:40:10', 1003, 'Plateg za elektrichestvo', 1000),
(4, '2022-04-22 15:40:10', 1004, 'Oplat muzykalnoj grupy', 5000),
(5, '2022-05-22 15:40:10', 1005, 'Oplat sysadminu', 6000);


INSERT INTO payments (id, invoiceid, currencyid, accountantid, volumefact, debt)
VALUES
(1, 1, 1, 1011, 1000, 1000);













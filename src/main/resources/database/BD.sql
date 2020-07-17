INSERT INTO product VALUES
(1,'Молоко', true, '1л 3%', 40),
(2,'Хлеб', false, 'Белый, нарезной', 28.90),
(3,'Чипсы', true, 'Lay`s, большая пачка', 99.90),
(4,'Сметана', true, 'Простоквашино', 999.90),
(5,'Сливочное масло', false, 'Лебедянь', 27599.99);

INSERT INTO customer VALUES
(1,'г.Сокол','vasilisk@mail.ru','Атонов','89305552215'),
(2,'г.Орёл','ubitsa@gmail.com','Семенов','89223779598'),
(3,'г.Воронеж','julia@yandex.ru','Алексеенко','88005553535');

INSERT INTO orders VALUES
(1,'2020-09-23', 'CREATED', 'CREDIT_CARD', 2),
(2,'2020-10-22', 'PROCESSING', 'PAY_PAL', 1);

INSERT INTO order_detail VALUES
(1, 28.90, 5, 1, 2),
(2, 40, 2, 2, 1);
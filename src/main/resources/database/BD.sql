INSERT INTO product VALUES
(1,'Молоко', true, '1л 3%', 40),
(2,'Хлеб', false, 'Белый, нарезной', 28.90),
(3,'Чипсы', true, 'Lay`s, большая пачка', 99.90),
(4,'Сметана', true, 'Простоквашино', 45.90),
(5,'Сливочное масло', false, 'Лебедянь', 99.50);

INSERT INTO customer VALUES
(1,'г.Сокол','vasilisk@mail.ru','Сократов','89305552215'),
(2,'г.Орёл','ubitsa@gmail.com','Самойлов','89223779598'),
(3,'г.Воронеж','julia@yandex.ru','Казина','88005553535');

INSERT INTO orders VALUES
(1,'2020-09-23', 'CREATED', 'CREDIT_CARD', 2),
(2,'2020-10-22', 'PROCESSING', 'PAY_PAL', 1);
(3,'2020-11-22', 'PROCESSING', 'PAY_PAL', 5);

INSERT INTO order_detail VALUES
(1, 28.90, 5, 1, 2),
(2, 40, 2, 2, 1);
(3, 99.50, 2, 3, 5);
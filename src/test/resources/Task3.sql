orders (order_id, promocode_id) — заказы;
promocodes (promocode_id, name, discount) — промокоды.
Напишите SQL-запрос, который подсчитает долю заказов с промокодами — соотношение заказов с промокодами от общего количества заказов. Сохраните запрос в файле resources\Task3.sql.

SELECT 
(COUNT(DISTINCT promocode_id FROM promocodes) / (COUNT(*) FROM orders)) * 100;
INNER JOIN promocode_id ON promocodes.promocode_id = orders.promocode.id;

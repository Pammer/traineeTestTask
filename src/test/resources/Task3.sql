orders (order_id, promocode_id) — заказы;
promocodes (promocode_id, name, discount) — промокоды.
Напишите SQL-запрос, который подсчитает долю заказов с промокодами — соотношение заказов с промокодами от общего количества заказов. Сохраните запрос в файле resources\Task3.sql.

SELECT 
(1-(SELECT COUNT(DISTINCT promocode_id)

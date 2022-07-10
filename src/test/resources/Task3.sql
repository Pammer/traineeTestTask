-- Доля заказов с промокодами в %
SELECT CAST(COUNT(*) FILTER (WHERE promocode_id IS NOT NULL) AS double precision)
/CAST(COUNT(*) AS double precision) * 100 AS my_percent
FROM orders

-- Табличное представление соотношения заказов с промокодами от общего количества заказов
SELECT
    count(*) FILTER (WHERE promocode_id IS NOT NULL) AS orders_with_promocode,
    count(*) AS all_orders
FROM orders
SELECT
   100 * COUNT(promocode_id) / COUNT(order_id) AS percent_of_orders
FROM
 orders;
/*1*/
SELECT first_name,last_name,email,address FROM customer INNER JOIN address ON customer.address_id = address.address_id
WHERE city_id = 312;

/*2*/
SELECT title,description,release_year,c.name,special_features FROM film AS f
JOIN film_category AS fc ON f.film_id = fc.film_id
JOIN category AS c ON fc.category_id = c.category_id
WHERE c.name = 'Comedy';
/*DESCONOZCO COMO AGRUPARLOS POR EL GENERO COMEDIA YA QUE EN NINGUN LADO ME APARECE ALGO COMO GENERO COMEDIA, SOLO EL ID*/

/*3*/
SELECT a.actor_id, CONCAT(a.first_name, ' ' ,last_name) AS nombre_actor, f.title, f.description, f.release_year FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE a.actor_id =5;

/*4*/
SELECT c.first_name,c.last_name, c.email, a.address, ci.city_id FROM customer AS c
JOIN address AS a ON c.address_id = a.address_id
JOIN city as ci ON a.city_id = ci.city_id
WHERE ci.city_id IN(1,42,312,459) AND store_id = 1;

/*5*/
SELECT fa.actor_id,f.title,f.description,f.release_year,f.rating,f.special_features FROM film AS f
JOIN film_actor as fa ON f.film_id = fa.film_id
WHERE f.rating = 'G' AND fa.actor_id = 15 AND f.special_features LIKE '%Behind the Scenes%';

/*6*/
SELECT f.film_id, f.title, a.actor_id, CONCAT(a.first_name, ' ',a.last_name) AS actor_name FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE f.film_id = 369;

/*7*/
SELECT f.rental_rate ,f.title,f.description,f.release_year,f.rating,f.special_features,c.name FROM film AS f
JOIN film_category AS fa ON f.film_id = fa.film_id
JOIN category AS c ON fa.category_id = c.category_id
WHERE c.name = 'Drama' AND f.rental_rate = 2.99;

/*8*/
SELECT CONCAT(a.first_name, ' ',a.last_name) AS actor_name, f.title, f.description,f.release_year,f.rating,f.special_features, c.name FROM film AS f
JOIN film_category AS fc ON f.film_id = fc.film_id
JOIN category AS c ON fc.category_id = c.category_id
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE a.first_name  = 'SANDRA' AND a.last_name = 'KILMER' AND c.name = 'Action';







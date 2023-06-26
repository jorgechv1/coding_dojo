/*ejemplo*/
SELECT DISTINCT u.first_name, u.last_name, u2.first_name AS friend_name, u2.last_name AS friend_last_name
FROM users u
LEFT JOIN friendships f ON user_id = user_id 
LEFT JOIN users u2 ON user_id = user_id;

/*1*/
SELECT DISTINCT u.first_name, u.last_name, u2.first_name AS friend_name, u2.last_name AS friend_last_name
FROM users u
LEFT JOIN friendships f ON user_id = user_id 
LEFT JOIN users u2 ON user_id = user_id
WHERE u.first_name = 'Kermit';

/*2*/

SELECT u.first_name, u.last_name, COUNT(f.friend_id) AS friend_count
FROM users u
LEFT JOIN friendships f ON u.id = f.user_id
GROUP BY u.id, u.first_name, u.last_name;

/*3*/

SELECT u.first_name, u.last_name, COUNT(f.friend_id) AS friend_count
FROM users u
LEFT JOIN friendships f ON u.id = f.user_id
GROUP BY u.id, u.first_name, u.last_name
ORDER BY friend_count DESC;

/*4*/

INSERT INTO users(first_name,last_name,created_at,updated_at)
VALUES('Jorge','Chavez','2023-06-26','2023-06-26');

INSERT INTO friendships(user_id,friend_id,created_at,updated_at)
VALUES(6,2,'2023-06-26','2023-06-26'),(6,4,'2023-06-26','2023-06-26'),(6,5,'2023-06-26','2023-06-26');

/*5*/

SELECT DISTINCT u.first_name, u.last_name, CONCAT(u2.first_name ,' ' , u2.last_name) AS amigo
FROM users u
LEFT JOIN friendships f ON user_id = user_id 
LEFT JOIN users u2 ON user_id = user_id
WHERE u.first_name = 'Eli';

/*6*/

DELETE FROM friendships WHERE user_id = 2 AND friend_id = 5;

/*7*/

SELECT DISTINCT CONCAT(u.first_name,' ', u.last_name) AS usuario, CONCAT(u2.first_name,' ' ,u2.last_name) AS nombre_amigo
FROM users u
LEFT JOIN friendships f ON user_id = user_id 
LEFT JOIN users u2 ON user_id = user_id;














/*1*/
SELECT countries.name, languages.language, languages.percentage  FROM countries INNER JOIN languages ON countries.id = country_id
WHERE language = 'Slovene'
ORDER BY percentage DESC;

/*2*/
SELECT countries.name, COUNT(cities.id) AS total_ciudades FROM countries INNER JOIN cities ON countries.id = country_id
GROUP BY countries.name
ORDER BY total_ciudades;

/*3*/
SELECT cities.name, population FROM cities WHERE country_id = 136 AND population > 500000
ORDER BY population DESC;

/*4*/
SELECT countries.name, languages.language, languages.percentage  FROM countries INNER JOIN languages ON countries.id = country_id
WHERE percentage > 89
ORDER BY percentage DESC;

/*5*/
SELECT name, surface_area, population FROM countries
WHERE surface_area < 501 AND population > 100000
ORDER BY surface_area;

/*6*/
SELECT name,government_form,capital,life_expectancy FROM countries 
WHERE government_form = 'Constitutional monarchy' AND capital > 200 AND life_expectancy > 75
ORDER BY capital DESC;

/*7*/
SELECT countries.name AS nombre_pais,cities.name AS nombre_ciudad,district,cities.population AS poblacion FROM countries INNER JOIN cities ON countries.id = country_id
WHERE cities.population > 500000 AND countries.name = 'Argentina'
ORDER BY cities.population DESC;

/*8*/
SELECT region,COUNT(id) AS numero_paises FROM countries
GROUP BY region
ORDER BY numero_paises DESC;





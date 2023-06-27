/*1*/
SELECT sum(amount) FROM billing
WHERE charged_datetime >='2012-03-01 00:00:00' and charged_datetime <='2012-03-31 00:00:00';

/*2*/
SELECT sum(amount) FROM billing
WHERE client_id = 2;

/*3*/
select client_id,domain_name from sites
where client_id = 10; 

/*4*/
select count(site_id) as sites,monthname(created_datetime) as mes,year(created_datetime) 
from sites
where client_id = 1
group by mes, year(created_datetime);


/*5*/

select s.domain_name as clientes_potenciales, count(s.domain_name) as total_clientes, s.created_datetime as fecha
from leads as l
join sites as s on l.site_id = s.site_id 
join clients as c on s.client_id = c.client_id
where l.registered_datetime >= '2011-01-01' and l.registered_datetime <= '2011-02-15'
group by clientes_potenciales, fecha;

/*6*/
/*tuve que pedir que me ayudaran no pude resolverla yo solo*/

select concat(c.first_name,' ', c.last_name) as clientes,(
	select count(*)
		from sites s, leads l
        where s.client_id = c.client_id
        and s.site_id = l.site_id
		and l.registered_datetime >= '2011-01-01'
		and l.registered_datetime <= '2011-12-31'
        ) total
from clients c
having total >= 1;
		
/*7*/
/*arreglar*/

select concat(c.first_name, ' ',c.last_name) as cliente, count(l.leads_id), monthname(l.registered_datetime) mes
from clients as c
join sites as s on c.client_id = s.client_id
join leads as l on l.site_id = l.site_id
where l.registered_datetime >= '2011-01-01'
and l.registered_datetime <= '2001-06-30'
group by cliente, mes;


/*8*/
/*me ayudaron a hacerla, tampoco pude resolverla yo solo*/
SELECT
  c.client_id,
  c.first_name,
  c.last_name,
  s.domain_name,
  COUNT(l.leads_id) AS total_leads
FROM clients c
JOIN sites s ON c.client_id = s.client_id
LEFT JOIN leads l ON s.site_id = l.site_id AND l.registered_datetime BETWEEN '2011-01-01' AND '2011-12-31'
GROUP BY c.client_id, s.site_id
having total_leads>=1;

/*9*/

select  b.client_id, concat(c.first_name,' ' ,c.last_name) nombre ,b.amount as ingresos,monthname(b.charged_datetime) mes,year(b.charged_datetime) año
from billing as b
join clients as c on b.client_id = c.client_id
group by b.client_id,mes,año,ingresos
order by b.client_id;

/*10*/
/*group concat se usa para concatenar valores completos de una tabla*/
select 
	c.client_id, 
	concat(c.first_name,' ' ,c.last_name) as cliente,
    group_concat(s.domain_name, ' / ') as sitios
from clients as c
join sites as s on c.client_id = s.client_id
group by client_id,cliente;











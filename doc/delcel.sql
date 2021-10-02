-- Скрипт удаления знаменитостей из локальной базы
-- признаком не знаменитости будет userid = 3

update events set tabloid = 0;
update events set userid = null where Celebrity = 1;

select * from events where Celebrity = 1 and (biography is not null or conversation is not null);
update events set userid = 3 where Celebrity = 1 and (biography is not null or conversation is not null);

update events as e set userid = 3 where exists(select id from blobs where eventid = e.id);
update events as e set userid = 3 where exists(select id from eventconfs where eventid = e.id);
update events as e set userid = 3 where exists(select id from eventpoints where eventid = e.id);
update events as e set userid = 3 where exists(select id from horar where eventid = e.id);
update events as e set userid = 3 where exists(select id from prediction_year where eventid = e.id);
update events as e set userid = 3 where exists(select id from synastry where eventid = e.id);
update events as e set userid = 3 where exists(select id from synastry where partnerid = e.id);
update events as e set userid = 3 where exists(select id from transit where eventid = e.id);
update events as e set userid = 3 where exists(select id from transit where personid = e.id);

select * from events where userid = 3 limit 10000;
select * from events where userid is null limit 50000;
select distinct userid from events;
select * from events where userid = 1 limit 10000;
select * from events where userid = 2 limit 50000;
select * from events where userid = 2 and (biography is not null or conversation is not null);
update events set userid = null where userid = 2;
delete from events where userid is null;
select id from events where userid is null limit 50000;
delete from events where userid is null and id < 2;
select * from events where userid is null and id between 1 and 2;
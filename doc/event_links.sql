-- поиск связанных записей персоны
set @p1 = 1;
select
(select count(id) from blobs where eventid = @p1) as eblob,
(select count(id) from eventconfs where eventid = @p1) as econf,
(select count(id) from eventpoints where eventid = @p1)as epoint,
(select count(id) from synastry where eventid = @p1) as esyn,
(select count(id) from synastry where partnerid = @p1) as esynp,
(select count(id) from transit where eventid = @p1) as etrans,
(select count(id) from transit where personid = @p1) as etransp;
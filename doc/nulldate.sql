update degrees set date = null where CAST(date AS CHAR(20)) = '0000-00-00 00:00:00'
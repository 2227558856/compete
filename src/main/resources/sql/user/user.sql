#sql("getByUserNo")
select * from user where user_no = #para(user_no) and is_deleted=0
#end

#sql("getByUserTel")
select * from user where phone = #para(phone) and is_deleted=0
#end

#sql("myTeam")
select * from team where team_no in (select team_no from team_mate where mate_no = #para(user_no) and is_deleted=0) and is_deleted=0
#end
create schema if not exists smart_crack_system;
use smart_crack_system;

# drop table user_info, pic_info;
drop table user_info;
create table if not exists user_info
(
    user_id   char(10) primary key comment '用户编号',
    username  varchar(256) not null comment '用户名',
    password  varchar(20)  not null comment '密码',
    authority varchar(20)  not null comment '权限',
    department varchar(256) not null comment '所属部门'
    ) comment = '用户表';

drop table pic_info;
create table if not exists pic_info
(
    pic_id char(20) primary key comment '图片编号',
    pic_time datetime not null  comment '拍摄时间',
    pic_operator char(10) not null comment '操作人员',
    pic_address varchar(256) not null comment '操作地址'
    ) comment = '图片信息表';

create table if not exists ids_total
(
    id_code char(5) primary key  comment 'ID编号',
    id_name varchar(256) not null comment '编号名称',
    id_num int not null  comment '最新编号'
) comment = '最新编号表'
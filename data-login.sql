CREATE DATABASE IF NOT EXISTS crm_user;

use crm_user;

CREATE TABLE user (
    email varchar(255) not null unique,
    password varchar(255) not null
);
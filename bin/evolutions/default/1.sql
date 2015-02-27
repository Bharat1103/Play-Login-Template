# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "mywebuser" ("name" VARCHAR(254) NOT NULL,"email" VARCHAR(254) NOT NULL,"password" VARCHAR(254) NOT NULL,"phone" BIGINT NOT NULL,"address" VARCHAR(254) NOT NULL,"company" VARCHAR(254) NOT NULL,"created" DATE NOT NULL,"updated" DATE NOT NULL,"usertype" INTEGER NOT NULL,"id" SERIAL PRIMARY KEY);
create unique index "IDX_EMAIL" on "mywebuser" ("email");

# --- !Downs

drop table "mywebuser";


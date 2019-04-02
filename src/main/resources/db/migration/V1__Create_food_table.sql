create table FOOD (
    ID SERIAL PRIMARY KEY,
    NAME varchar(100) not null,
    CALORIES int not null,
    FAT int not null,
    SUGAR int not null,
    PROTEIN int not null,
    FILTER int not null
);
-- Used by Spring Remember Me API.  
CREATE TABLE Persistent_Logins (
    user_name varchar(64) not null,
    series varchar(64) not null,
    token varchar(64) not null,
    last_used timestamp not null,
    PRIMARY KEY (series)
);
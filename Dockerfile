FROM mysql:latest

COPY ./CreateDatabase.sql/ /CreateDatabase.sql/

EXPOSE 3306

ENTRYPOINT ["top", "-b"]
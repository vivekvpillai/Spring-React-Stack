# Steps to Create and Deploy:

## set up local

### local postgres

1. open your postgres app and start the db server
1. in the postgres app, double click one of the existing databases to enter `psql`
1. once inside `psql`, run `CREATE DATABASE springdemo;`

### in your browser

1. fork this repo

### in your terminal

1. clone your fork of this repo onto your local computer somewhere outside the class repo
1. `cd` into the local repo
1. Run `java --version`.  Note, this may open a prompt you to install Java: click "More Info" and follow installation instructions.  Once complete, rerun the previous command
  1. The first line that this command gives you is the version of Java and the date of its release (e.g. `java 15 2020-09-15` tells you it is Java version 15)
  1. Make sure the number next to `java.runtime.version` in the system.properties file in your repo matches your version of Java.  If not, change that line of code.  Then git add/commit/push

Set up an environment variable so your local spring app will use your local postgres database:

```
export JDBC_DATABASE_URL=jdbc:postgresql://localhost:5432/springdemo
```

Now start spring:

```
./mvnw spring-boot:run
```

### in your browser

go to http://localhost:8080/ to view local app (note this uses your local postgres database)

## set up heroku

### in your terminal

1. run `heroku create` (take note of the app name for later)

### in your browser

1. go to heroku.com in your browser and sign in
1. find this newly created heroku app in your list of available apps and click on it
1. go to resources
1. search for postgres and choose Heroku Postgres
1. choose "Hobby Dev - Free"
1. click provision

### in your terminal

1. run `git push heroku master`
1. run `heroku open` to see app (note this uses your heroku postgres database, which will have different data than your local db)

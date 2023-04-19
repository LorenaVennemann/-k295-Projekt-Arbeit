# uek295 project work
# Documentation

## Description

This project is about creating a RESTAPI application. It was created using Springboot.

## Prerequisite

These softwares are used to make the program **run**:

- Docker [Download Link](https://docs.docker.com/get-docker/)
- Intellij [Download Link](https://www.jetbrains.com/idea/)
- Postman [Download Link](https://www.postman.com/downloads/)

## Installation

To get the program running, you first need to install the repo clone


```bash
git clone https://github.com/LorenaVennemann/uek295-Projekt-Arbeit.git

```

One starts Docker up and runs this command to create and run a Postgres Docker container:

```bash
docker run -d -p 5432:5432 -e POSTGRES_PASSWORD=postgres --name uek295db postgres
```

- name: uek295db
- POSTGRES_PASSWORD: postgres
- port: 5432

To check if the Docker container is running, you can use this command to check it:

```bash
docker ps
```
You can also check it with Docker Desktop GUI

In Intellij you should only click on the green run sign, if this is not the case you can click from the Gradle tab, under applications and `bootRun`.

The documentation for Endpoints can be viewed after starting the program with this link:

http://localhost:8080/swagger-ui/index.html oder [hier](http://localhost:8080/swagger-ui/index.html) anklicken

**The database must also be running to start the application**.

Translated with www.DeepL.com/Translator (free version)

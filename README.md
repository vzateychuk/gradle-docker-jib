# Dockerize Spring-boot apps using Jib

Jib is an open-source Java tool maintained by Google for building Docker images of Java applications. It simplifies containerization since with it, we don't need to write a dockerfile.

## Credentials
The jib uses credHelper = 'desktop', meaning that for upload to dockerHub, the JIT will use the docker-credential-desktop(installed locally) to retrieve creds.
But these credentials might not be in the credential-storage yet. 

Check list of credentials:
```shell
docker-credential-desktop list
```
To add credential for the store used:
```shell
docker-credential-desktop store < $pathTo/creds.json
```
where creds.json contains:
```json
{
  "ServerURL": "registry-1.docker.io",
  "Username": "${username}",
  "Secret": "${password}"
}
```
where username/password for the **registry-1.docker.io**

## Build / Upload 

Just execute jib task with gradle:
```shell
gradle jib
```

## Run 
To run the application, the docker will be downloaded from dockerHub automatically. Run this command: 
```shell
docker run -it --rm -d --name greeting -p 8080:8080 vzateychuk/greeting:latest .
```

## Test
```shell
http://localhost:8080/greeting
```

## Reference Documentation
[Dockerizing Java Apps using Jib on Baeldung](https://www.baeldung.com/jib-dockerizing)

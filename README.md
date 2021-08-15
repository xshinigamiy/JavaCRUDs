# JavaCRUDs
This repository demonstrates CRUD operations using JPA ORM tool

---
#Steps to setup this service locally

- Use make file for this purpose
- Run script file to setup docker-compose file
- Make sure that the docker App is running before running the script
- `sh script.sh`  run this command to start the service and migrate the db which is used
by this service. And also added some seed data.
- After the above step, If you are getting response from `/health-check` endpoint, meaning service setup
  was successful.
- Please feel free to contribute to this service




*TODO* 
- *Add tests for each flow*
- *Add logging as well. Use standard logger to log and use well defined log-rotation policy.* 




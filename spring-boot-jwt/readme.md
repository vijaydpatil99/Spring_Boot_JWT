Prerequisites:
Install the latest version of Java and Maven.

Eclipse Instructions
Prerequisites:

Install Eclipse, the Maven plugin, and postman app

Import project as maven project


Right-click on project
Run As > Java Spring boot application

Send the requests from postman to tomcat server on deployed port

localhost:8087/register    -- with username and password
localhost:8087/authenticate    --enter username and password and will get JWT token
localhost:8087/hello           --access resources with token

# Ddroid-App
What You Need / Prerequisites
- Java 1.8
- Maven (3.9.5)
- MySQL Server (8.0)

Let's Dive In: 
1. Start by creating a brand-new MySQL database (schema) and call it "jobs"
2. Open up the "aplication.properties" file, and if you need to, change the MySQL credentials (username and password) to match your setup.
3. Now, look for "JobsApplication.java" (it's got the main method). When you run it, the app will do its thing. It'll try to connect to the "jobs" database and create the necessary tables from the model POJOs (ORM) if they're not there already.
4. Check out the "resources" folder. You'll find an SQL script called "data-import.sql". Run this script in MySQL, and you'll get some test data to play around with.
5. We've got a POSTMAN collection in there too. It's got all the requests for the different endpoints you can access through the REST API.

1.	Installation requirements
In order to run this project you need to have a Java compiler on your machine.

2.	Running
The prototype is run via a Main method, which is allocated in the runner.Runner.java file.

3.	Logging in the system
There are currently three account types with the following user credentials:
Teaching administrator – username: admin, password: admin;
Student tutor – username: st, password: st;
Lecturer tutor – username: lt, password lt;
For each user you can see the available command that are supported by typing “-help”

4.	Prototype notes
Since the current software is just a prototype you should note the following things:
- the sessions and the students that the tutors can see are just hard-coded data, changes made to these data is not stored
anywhere after the termination of the program
- the teaching administrator is supplied with extra functionalities - in order to export some data the admin is asked to 
create simple sessions, courses and students
- the program may crash at some places if the user trying to interact with the system in a way that is out of the scope
of the prototype
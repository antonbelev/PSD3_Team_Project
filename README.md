==============================
Sprint 1
--------
First sprint is located uder the PSD3_Team_N folder. The following description is about Sprint 1. The decripton for Sprint 2 can be found under the section called Sprint 2.


Installation requirements
-------------------------
In order to run this project you need to have a Java compiler on your machine.

Run
---
The prototype is run via a Main method, which is allocated in the runner.Runner.java file.

Logging in the system
---------------------

There are currently three account types with the following user credentials:
Teaching administrator - username: admin, password: admin;
Student tutor - username: st, password: st;
Lecturer tutor - username: lt, password lt;
For each user you can see the available command that are supported by typing "-help"

Prototype notes
---------------

Since the current software is just a prototype you should note the following things:
- the sessions and the students that the tutors can see are just hard-coded data, changes made to these data is not stored
anywhere after the termination of the program
- the teaching administrator is supplied with extra functionalities - in order to export some data the admin is asked to 
create simple sessions, courses and students
- the program may crash at some places if the user trying to interact with the system in a way that is out of the scope
of the prototype

END OF Sprint 1 SECTION
-----------------------


==============================
Sprint 2
--------

The files for the second sprint are located in the Server and ProjectMaven folders.

Installation requirements
-------------------------
In order to run the second sprint you should import the project in Spring Tool Suite or in Eclipse with installed Spring on it.


Run
---
Once you run  the server on localhost you can start the application on your browser. Entering the following URL should guide you to the home page: http://localhost:8080/home.

Logging in the system
---------------------

There are two accounts provided:
Teaching Administrator - username: admin, password: admin;
Student - username: student, password: student;

Prototype notes
---------------

There are known bugs in the system. Once the user is logged in as teaching administrator or student the next page is not rendered correctly at first time so please make sure to refresh the page to see the full content!!!


END OF Sprint 2 SECTION
-----------------------



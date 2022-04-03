# Enabling Efficient Structural Analysis of Source Code for Large Scale Applications in Education 
I have developed a configurable software that collects program files arranged in a directory tree and enters the modeled data into a graph database.
The program files are first transformed into abstract syntax graphs (ASG) and connected through the metadata given by the directory tree as configured by the user.
In parallel, parts of the total graph that is being generated is entered into a graph database in a multi-threaded manner. The software design enforces correctness of the resulting graph database. Furthermore, the software is modeled with many interfaces such that all components can be exchanged and configured, such as the programming language of source code, the graph database, the layers and their labels + properties of the directory tree, and the graph format of the ASGs. 

The result of this work allows for efficient comparative querying of patterns in-between students and across semesters. This work was published at the IEEE Global Engineering in Education Conference (EDUCON) 2022. The paper can be found in this repository as well.

### Paper Abstract
Automated Assessment Systems (AAS) are increasingly used in large computer science lectures to evaluate student
solutions to programming assignments. The AAS normally carries
out static and dynamic analysis of the program code. In
addition, simple forms of learning analytics can often be generated
quite easily. However, structural analyses and comparison of
solutions for larger sets of student programs are, in many cases,
complicated and time-consuming.
In this article, we introduce a methodology with which
thousands of programs can be analyzed in less than a second,
for example, to search for the use of certain control structures
or the application of recursion.
For this purpose, we have developed a software that creates a
structural representation for each programming solution in the
form of a TGraph, which is inserted into a graph database using
Neo4j. On this database, we can search for structural features
by queries in the language Cypher.
We have tested this methodology extensively for Java programs,
measured its performance, and validated the results. Our
software can also be applied to programs in other programming
languages, such as Scratch. Additionally, we plan to make our
software available to the community.

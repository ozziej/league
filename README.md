# League Calculator
Simple Java CLI application to rank teams based on scores

Requires Java 1.8 or later (tested with Open JDK 18)
Maven is used for building
Uses JUnit 5 for testing (used 5.8.1) and the Maven Surefire plugin version 2.22.2

Input is a text file, one game per line, comma separated as an example below, with the scores:

Orlando Pirates 3, SuperSport United 0
WITS 1, Kaizer Chiefs 1
Mamelodi Sundowns 1, Amazulu 0
WITS 2, Orlando Pirates 3

A win is 3 points, draw is 1 and loss is 0 points
Result is sorted based on score then alphabetically 

The above will produce the following:

1. Orlando Pirates, 6 pts
2. Mamelodi Sundowns, 3 pts
3. Kaizer Chiefs, 1 pts
3. WITS, 1 pts
5. Amazulu, 0 pts
5. SuperSport United, 0 pts

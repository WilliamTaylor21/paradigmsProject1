//William Taylor
//9/11/2020
//Programming Paradigms Assignment1 @ University of Arkansas:
//Program to make a turtle track a mouse click.
//Turtle can also be moved with arrow keys.


::@echo off
javac Game.java View.java Controller.java Model.java
if %errorlevel% neq 0 (
	echo There was an error; exiting now.	
) else (
	echo Compiled correctly!  Running Game...
	java Game	
)


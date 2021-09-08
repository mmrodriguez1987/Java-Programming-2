# Keiser University - Programming 2 Course
> _This repository is for educational purposes only, it is not intended to make solutions available to anyone._

## Lab1 - BMI Calulator

For this assignment, you will build a BMI calculator. This program should be build using both procedural and object-oriented programming. You should have a Class that holds the data and a method that calculates the BMI. The BMI calculator will take the following input from the user:
1. Weight in pounds
2. Height in inches.

You will convert these inputs to the metrics system, which means you will convert the weight to kg and the height to meters. After the conversion is made, you will calculate the user's BMI by using the following formula.

> bmi = weight/(height*height)

The program will calculate the user's BMI and display a message depending on the BMI of the user:
* If the user's BMI is less or equal to 18.5, display a message on the console telling the user the value of their BMI, and that he/she is underweight.
* If the user's BMI is greater than 18.5 and smaller than 25, display a message on the console telling the user the value of their BMI, and that he/she is normal
* If the user's BMI is equal to or greater than 25, display a message on the console telling the user the value of their BMI, and that he/she is overweight.

You should have comments for each important code block in your code.
## Chapter Book Exercises
### Exercise 4 

Create an application named NumbersDemo whose main() method holds two integer variables. Assign values to the variables. In turn, pass each value to methods named **displayTwiceTheNumber()**, **displayNumberPlusFive()**, and **displayNumberSquared()**. Create each method to perform the task its name implies. Save the application as NumbersDemo.java. Modify the NumbersDemo class to accept the values of the two integers from a user at the keyboard. Save the file as **NumbersDemo2.java**

### Exercise 5
Create an application named Percentages whose main() method holds two double variables. Assign values to the variables. Pass both variables to a method named **computePercent()** that displays the two values and the value of the first number as a percentage of the second one. For example, if the numbers are 2.0 and 5.0, the method should display a statement similar to “2.0 is 40 percent of 5.0.” Then call the method a second time, passing the values in reverse order. Save the application as Percentages.java. Modify the Percentages class to accept the values of the two doubles from a user at the keyboard. Save the file as **Percentages2.java**

### Exercise 6
To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 10 times the student’s grade point average. In other words, a student with a 3.2 grade point average receives a $32 credit. Create a class that prompts a student for a name and grade point average, and then passes the values to a method that displays a descriptive message. The message uses the student’s name, echoes the grade point average, and computes and displays the credit. Save the application as BookstoreCredit.java.

### Exercise 7
There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion. Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the entered value to two methods. One converts the value from inches to feet, and the other converts the same value from inches to yards. Each method displays the results with appropriate explanation. Save the application as **InchConversion.java**

### Exercise 8
Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main() method that prompts the user for the length, width, and height of a rectangular room. Pass these three values to a method that does the following:
- Calculates the wall area for a room
- Passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed.
- Displays the number of gallons needed
- Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon.
- Returns the price to the main() method

The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room with 10-foot ceilings is $64. Save the application as **PaintCalculator.java**

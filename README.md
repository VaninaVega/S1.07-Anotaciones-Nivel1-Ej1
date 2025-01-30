# S1.07-Anotaciones-Nivel1-Ej1


## Summary: exercise description

Create an object hierarchy with three classes: Worker, Online Worker and Face-to-face Worker.

The Worker class has the attributes name, surname, price/hour, and the method calcarSou() that receives the number of hours worked as a parameter and multiplies it by the price/hour. Child classes must override it, using @Override.

From the main() of the Main class, make the necessary invocations to demonstrate the operation of the @Override annotation.

For face-to-face workers, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour, plus the value of a static attribute called benzino that we will add to this class.

For online workers, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour and the price of the flat Internet rate will be added, which will be a constant of the TreballadorOnline class.

## Technologies Used

java 22

## Requirements

Programming language: Java 22

Development environment: IntelliJ IDEA

## How to run it

Clone the repository or download the zip file and run it in your favorite IDE.

## Contribution

Contributions are welcome! Please follow these steps to contribute:

-Fork the repository
-Create a new branch git checkout
-b feature/NewFeature
-Make your changes and commit them: git commit
-m 'Add New Feature'
-Upload the changes to your branch: git push origin feature/NewFeature
-Make a pull request
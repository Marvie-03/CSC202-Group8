# Group 8

# Java Shape Classes Program
This Java program is a simple console application that creates objects of different shapes based on user input and calculates their area and volume (if applicable). The program uses the following shape classes:

1. Triangle
2. Circle
3. Rectangle
4. Sphere
5. Cube
 ----
Each class implements the Shape interface, which has a single method getName() to return the name of the shape. The ThreeDimensionalShape interface extends the Shape interface and adds a method calculateVolume() for calculating the volume of 3D shapes.

# Getting Started
## Dependencies
This program is a standard Java console application and does not have any external dependencies.

### Executing the program
To run the program, compile and execute the Main.java file. The program will prompt the user to select a shape and input the required dimensions.

## Classes
### Shape
The Shape interface has one method:

String getName(): Returns the name of the shape.
### ThreeDimensionalShape
The ThreeDimensionalShape interface extends the Shape interface and adds one method:

double calculateVolume(): Calculates and returns the volume of the 3D shape.
### Triangle
The Triangle class implements the Shape interface and represents a triangle. It has two fields:
base: The base of the triangle.
height: The height of the triangle.
The class provides the following methods:

double calculateArea(): Calculates and returns the area of the triangle.
String getName(): Returns the name of the shape.
### Circle
The Circle class implements the Shape interface and represents a circle. It has one field:

radius: The radius of the circle.
The class provides the following methods:

double calculateArea(): Calculates and returns the area of the circle.
String getName(): Returns the name of the shape.
### Rectangle
The Rectangle class implements the Shape interface and represents a rectangle. It has two fields:

length: The length of the rectangle.
breadth: The breadth of the rectangle.
The class provides the following methods:

double calculateArea(): Calculates and returns the area of the rectangle.
String getName(): Returns the name of the shape.
### Sphere
The Sphere class implements the ThreeDimensionalShape interface and represents a sphere. It has one field:

radius: The radius of the sphere.
The class provides the following methods:

double calculateArea(): Calculates and returns the surface area of the sphere.
double calculateVolume(): Calculates and returns the volume of the sphere.
String getName(): Returns the name of the shape.
### Cube
The Cube class implements the ThreeDimensionalShape interface and represents a cube. It has one field:

side: The side length of the cube.
The class provides the following methods:

double calculateArea(): Calculates and returns the surface area of the cube.
double calculateVolume(): Calculates and returns the volume of the cube.
String getName(): Returns the name of the shape.
# Authors
Contributors names and contact info
1. Modupe Marvellous **UJ/2020/NS/0679**
2. 
3. 
4. 
5. 

### Version History
0.1
### Initial Release
License
This project is licensed under the MIT License - see the LICENSE.md file for details

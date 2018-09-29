# A coding challenge to illustrate the ability to model the world
Using maven to manage the project. Using the following command to run the tests and build the app
```
mvn clean install
```
## Question A1
### Unit test methods
Need to mock up or spy System.out object
### Increase maintainability
By following principles of encapsulation, inheritance and polymorphism
- Make Animal an abstract class
- Make methods of Animal class protected
- Make fly/sing methods of Bird class public
## Question A2
- Create Duck and Chicken classes extending Bird class
- For Duck class, override method sing() and create a new method swim()
- For Chicken, override methods sing() and fly()
## Question A3
- A straightforward way is to create a new class Rooster
- It extends Chicken class, then overrides method sing()
- Another way is to create a new field "type" in Chicken class. Then implementing sing method depending on the type.


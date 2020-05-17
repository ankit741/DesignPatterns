#Name
Factory Design Pattern
#Type
Creational design pattern.

#Design Principle
Depend upon abstractions. Do not depend upon concrete classes.
Define an interface for creating an object, but let subclasses decide which class to instantiate.

#About
it is one of the "Gang of Four" design patterns.The Simple Factory isn’t actually a Design Pattern; it’s more of a programming idiom.
it Hides the object creation process from the client. the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.
Defining a simple factory as a static method is a common technique and is often called a static factory.  
Remember it also has the disadvantage that you can’t subclass and change the behavior of the factory method.

#JDK Example
java.sql.DriverManager.getConnection() uses factory pattern.

#Reference Books
Head First Design Patterns.


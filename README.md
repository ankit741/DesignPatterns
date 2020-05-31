# Design Patterns
Design patterns, as name suggest, are solutions for most commonly (and frequently) occurred problems while designing a software.

## There are mainly three types of design patterns:

## Creational patterns
<p>These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.</p>
<details>
  
<summary>List</summary>
  
* [`Factory`](#factory)
</details>

## Structural patterns
<p>These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.</p>
<details>
<summary>List</summary>
  
* [`Decorator`](#decorator)
</details>

## Behavioral patterns
<p>These patterns are concerned with algorithms and the assignment of responsibilities between objects.</p>
<details>
<summary>List</summary>

* [`Observer`](#observer)
</details>


>## factory

### Design Principle
Depend upon abstractions. Do not depend upon concrete classes.<br/>
Define an interface for creating an object, but let subclasses decide which class to instantiate.

### About
it is one of the "Gang of Four" design patterns.The Simple Factory isn’t actually a Design Pattern; it’s more of a programming idiom.
it Hides the object creation process from the client. the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.
Defining a simple factory as a static method is a common technique and is often called a static factory.  
Remember it also has the disadvantage that you can’t subclass and change the behavior of the factory method.

### JDK Example
java.sql.DriverManager.getConnection() uses factory pattern.

### References
Head First Design Patterns.


>## decorator

### Name
Decorator Design Pattern
### Type
Structural design pattern.
### Design Principle
Classes should be open for extension but closed for modification.
### About
Decorator pattern allows adding additional behaviors to objects dynamically at runtime without affecting other object of same type by placing them inside wrapper objects.
Basically, Attach additional responsibilities to an object dynamically and provide a flexible alternative to subclassing for extending functionality.
### JDK Example
InputStream is a Base abstract Class and FilterInputStream is a decorator class extended by child classes like BufferedInputStream.
### References
Head First Design Patterns.


>## observer

### Name
Observer Design Pattern
### Type
Behavioral design pattern.

### Design Principle
Favor composition over inheritance.<br/>
program to interface not implementation.

### About
Observer pattern defines one to many dependency between a set of objects so that
when object(Subject) changes state,all of its dependent(Observer) are notified and update automatically.

### JDK Example
java.util.Observable<br/>
Model-View-Controller (MVC) frameworks also use Observer pattern.<br/>
Java Message Service (JMS) uses Observer pattern.

### References
Head First Design Patterns.

# solid-principal-learnings

In this poc we will learn about SOLID principal and also see the importance in software development, SOLID principal is the acronym of following concept or we can say design patterns/principal of software development - 

S - Single Responsibility Principal (SRP)

O - Open Closed Principal (OCP)

L - Liskov's Substitution Principal (LSP)

I - Interface Segregation Principal (ISP)

D - Dependency Inversion Principal (DIP)

Single Responsibility Principal (SRP) : "A class or interface should have only one reason to change". It means every class or interface should have single reason to change.

Open closed Principle (OSP) : "Software entities (classes, modules, functions etc..) should be open for extension and closed for any modification". Which means you should be able to extend a class behaviour with modifying it.

Liskov substitution Principle (LSP): "Derived or child classes should be substitutable for thier base or parent clasess". It means if a class A is of subtype of class B,
  then we should be able to replace class B with A without interrupting the behaviour of the program.
  
Interface Segregation Principal (ISP): "Do not force any client/class to implement an interface which is irrelevent to them". Which means if a class doesn't required any funtinality which is irrelvent them then you shouldn't implement it.

Dependency Inversion Principle (DIP): "abstract classes and interfaces should be used instead of implementation". It means any of high level module class should not be dependent on its low lavel module classes. But it should be dependent on abstract classes or interfaces.

# SOLID Principles

### This repository demonstrates the SOLID principles:

1. **Single Responsibility:** Every class should have only one responsibility - do only **that one thing** & do it well.
2. **Open-Closed:** Classes should be open for extension, but closed for modification. Wherever needed create interfaces
to base the classes on, and in each class implement the interface's methods accordingly.
3. **Liskov Substitution:** Functions that use pointers or references to base classes must be able to use objects
of derived classes without knowing it. A subclass must be able to perform as its parent class, for example:
if a class can implement properly **only some** methods of an interface but not others, then
it shouldn't be implementing that interface, and instead a different interface should be made.
4. **Interface Segregation:** Interfaces should not force classes to do what they can't do. For example:
We have a Shape interface that has an area method, and a volume, and every shape should be able to calculate an area,
however if a shape is a 2d shape it does not have volume. Therefore, a ThreeDimensionalShape interface should be created 
and the volume method should be moved there.
5. **Dependency Inversion:** Depend upon abstraction not concretions. Classes can have a field that is an interface,
and when we instantiate an object of that class we can provide the constructor with an implementation of that interface,
that way we don't need to change anything in that class when we want to provide different implementations.



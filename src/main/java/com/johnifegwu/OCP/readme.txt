Open-Closed Principle
==============================================================================================================

The idea of open-closed principle is that existing, well-tested classes will need to be modified when
something needs to be added. Yet, changing classes can lead to problems or bugs. Instead of
changing the class, you simply want to extend it. With that goal in mind, Martin summarizes this
principle, “You should be able to extend a class’s behavior without modifying it.”
Following this principle is essential for writing code that is easy to maintain and revise. Your class
complies with this principle if it is:
1. Open for extension, meaning that the class’s behavior can be extended; and
2. Closed for modification, meaning that the source code is set and cannot be changed.
At first glance, these two criteria seem to be inherently contradictory, but when you become more
comfortable with it, you’ll see that it’s not as complicated as it seems. The way to comply with these
principles and to make sure that your class is easily extendable without having to modify the code is
through the use of abstractions. Using inheritance or interfaces that allow polymorphic substitutions
is a common way to comply with this principle. Regardless of the method used, it’s important to
follow this principle in order to write code that is maintainable and revisable.
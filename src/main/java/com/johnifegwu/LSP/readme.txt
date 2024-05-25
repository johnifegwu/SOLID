Liskov Substitution Principle
==============================================================================================================

Of the five SOLID principles, the Liskov Substitution Principle is perhaps the most difficult one to
understand. Broadly, this principle simply requires that every derived class should be substitutable
for its parent class. The principle is named for Barbara Liskov, who introduced this concept of
behavioral subtyping in 1987. Liskov herself explains the principle by saying:
What is wanted here is something like the following substitution property: if for each object O1 of
type S there is an object O2 of type T such that for all programs P defined in terms of T, the behavior
of P is unchanged when O1 is substituted for O2 then S is a subtype of T.
While this can be a difficult principle to internalize, in a lot of ways it’s simply an extension of openclosed principle,
as it’s a way of ensuring that derived classes extend the base class without
changing behavior.
Following this principle helps to avoid unexpected consequences of changes and avoids having to
open a closed class in order to make changes. It leads to easy extensions of software, and, while it
might slow down the development process, following this principle during development can avoid
lots of issues during updates and extensions.
Single Responsibility Principle
===============================================================================================================

Robert Martin summarizes this principle well by mandating that, “a class should have one, and only
one, reason to change.” Following this principle means that each class only does one thing and
every class or module only has responsibility for one part of the software’s functionality. More
simply, each class should solve only one problem.
Single responsibility principle is a relatively basic principle that most developers are already utilizing
to build code. It can be applied to classes, software components, and microservices.
Utilizing this principle makes code easier to test and maintain, it makes software easier to
implement, and it helps to avoid unanticipated side-effects of future changes.
To ensure that you’re following this principle in development, consider using an automated check
on build to limit the scope of classes. This check is not a foolproof way to make sure that you’re
following single responsibility principle, but it can be a good way to make sure that classes are not
violating this principle.
- [设计模式](#设计模式)
- [Code Practise](#code-practise)
- [Brief](#brief)
    - [Design pattern space](#design-pattern-space)
    - [Pattern Relation](#pattern-relation)
    - [Design Pattern In MVC architect](#design-pattern-in-mvc-architect)
- [Cretional Patterns](#cretional-patterns)
    - [Abstract Factory](#abstract-factory)
        - [Indent](#indent)
            - [Provide an interface for creating families of related or dependent objects without specifying their concrete classes.](#provide-an-interface-for-creating-families-of-related-or-dependent-objects-without-specifying-their-concrete-classes)
        - [Uml](#uml)
        - [Consequences](#consequences)
            - [Isolates concrete classes](#isolates-concrete-classes)
            - [It makes exchanging product families easy](#it-makes-exchanging-product-families-easy)
            - [It promotes consistency among products.](#it-promotes-consistency-among-products)
            - [But Supporting new kinds of products is difficult.](#but-supporting-new-kinds-of-products-is-difficult)
        - [Implementation](#implementation)
            - [](#)
            - [Factories as singletons.](#factories-as-singletons)
            - [Creating the products](#creating-the-products)
            - [Defining extensible factories](#defining-extensible-factories)
            - [](#-1)
            - [](#-2)
            - [](#-3)
    - [Factory Method](#factory-method)
        - [Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.](#define-an-interface-for-creating-an-object-but-let-subclasses-decide-which-class-to-instantiate-factory-method-lets-a-class-defer-instantiation-to-subclasses)
    - [Builder](#builder)
        - [Separate the construction of a complex object from its representation so that the same construction process can create different](#separate-the-construction-of-a-complex-object-from-its-representation-so-that-the-same-construction-process-can-create-different)
    - [Prototype](#prototype)
        - [Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.](#specify-the-kinds-of-objects-to-create-using-a-prototypical-instance-and-create-new-objects-by-copying-this-prototype)
    - [Singleton](#singleton)
        - [Ensure a class only has one instance, and provide a global point of access to it.](#ensure-a-class-only-has-one-instance-and-provide-a-global-point-of-access-to-it)
- [Structural Patterns](#structural-patterns)
    - [Adapter](#adapter)
        - [Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.](#convert-the-interface-of-a-class-into-another-interface-clients-expect-adapter-lets-classes-work-together-that-couldnt-otherwise-because-of-incompatible-interfaces)
    - [Bridge](#bridge)
        - [Decouple an abstraction from its implementation so that the two can vary independently.](#decouple-an-abstraction-from-its-implementation-so-that-the-two-can-vary-independently)
    - [Composite](#composite)
        - [Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly](#compose-objects-into-tree-structures-to-represent-part-whole-hierarchies-composite-lets-clients-treat-individual-objects-and-compositions-of-objects-uniformly)
    - [Decorator](#decorator)
        - [Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.](#attach-additional-responsibilities-to-an-object-dynamically-decorators-provide-a-flexible-alternative-to-subclassing-for-extending-functionality)
    - [Facade](#facade)
        - [Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.](#provide-a-unified-interface-to-a-set-of-interfaces-in-a-subsystem-facade-defines-a-higher-level-interface-that-makes-the-subsystem-easier-to-use)
    - [Flyweight](#flyweight)
        - [Use sharing to support large numbers of fine-grained objects efficiently.](#use-sharing-to-support-large-numbers-of-fine-grained-objects-efficiently)
    - [Proxy](#proxy)
        - [Provide a surrogate or placeholder for another object to control](#provide-a-surrogate-or-placeholder-for-another-object-to-control)
- [Behavioral Patterns](#behavioral-patterns)
    - [Chain of Reponsibility](#chain-of-reponsibility)
        - [Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.](#avoid-coupling-the-sender-of-a-request-to-its-receiver-by-giving-more-than-one-object-a-chance-to-handle-the-request-chain-the-receiving-objects-and-pass-the-request-along-the-chain-until-an-object-handles-it)
    - [Command](#command)
        - [Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.](#encapsulate-a-request-as-an-object-thereby-letting-you-parameterize-clients-with-different-requests-queue-or-log-requests-and-support-undoable-operations)
    - [Interpreter](#interpreter)
        - [Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.](#given-a-language-define-a-represention-for-its-grammar-along-with-an-interpreter-that-uses-the-representation-to-interpret-sentences-in-the-language)
    - [Iterator](#iterator)
        - [Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.](#given-a-language-define-a-represention-for-its-grammar-along-with-an-interpreter-that-uses-the-representation-to-interpret-sentences-in-the-language-1)
    - [Mediator](#mediator)
        - [Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently](#define-an-object-that-encapsulates-how-a-set-of-objects-interact-mediator-promotes-loose-coupling-by-keeping-objects-from-referring-to-each-other-explicitly-and-it-lets-you-vary-their-interaction-independently)
    - [Memento](#memento)
        - [Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later.](#without-violating-encapsulation-capture-and-externalize-an-objects-internal-state-so-that-the-object-can-be-restored-to-this-state-later)
    - [Observer](#observer)
        - [Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.](#define-a-one-to-many-dependency-between-objects-so-that-when-one-object-changes-state-all-its-dependents-are-notified-and-updated-automatically)
    - [State](#state)
        - [Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.](#allow-an-object-to-alter-its-behavior-when-its-internal-state-changes-the-object-will-appear-to-change-its-class)
    - [Strategy](#strategy)
        - [Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.](#define-a-family-of-algorithms-encapsulate-each-one-and-make-them-interchangeable-strategy-lets-the-algorithm-vary-independently-from-clients-that-use-it)
    - [Template Method](#template-method)
        - [Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.](#define-the-skeleton-of-an-algorithm-in-an-operation-deferring-some-steps-to-subclasses-template-method-lets-subclasses-redefine-certain-steps-of-an-algorithm-without-changing-the-algorithms-structure)
    - [Visitor](#visitor)
        - [Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.](#represent-an-operation-to-be-performed-on-the-elements-of-an-object-structure-visitor-lets-you-define-a-new-operation-without-changing-the-classes-of-the-elements-on-which-it-operates)

# 设计模式

这是一个由浅入深的过程, 教材参考

+ [Design Patterns_Elements of Reusable Object-Oriented Software ](Design%20Patterns_Elements%20of%20Reusable%20Object-Oriented%20Software%20.pdf)

+ [design patterns best practices in java](design-patterns-and-best-practices-in-java.pdf)

或者可以参考本书的中文版

+ [设计模式：可复用面向对象软件的基础](设计模式：可复用面向对象软件的基础.pdf)

+ [java 设计模式及实践](Java设计模式及实践.pdf)

之后参考进行深入学习

+ [Design Patterns Implement By Java](  https://java-design-patterns.com/patterns/)

# Code Practise

+ [Java - ongoing](Java)
+ [Go - ongoing](Go)
+ [Rust - ongoing](Rust)
+ [C - ongoing](C)
+ [React - ongoing](React)
+ [Node - ongoing](Nodejs)

# Brief

## Design pattern space

<img width="518" alt="Screen Shot 2022-10-14 at 10 37 55" src="https://user-images.githubusercontent.com/37357447/200979255-6d2b53d9-b872-4582-92ec-85a8bf62e13a.png">


## Pattern Relation

<img width="596" alt="PatternRelation" src="https://user-images.githubusercontent.com/37357447/200979359-70aae8ff-3f49-4b2a-99ab-150ba43da0e3.png">



## Design Pattern In MVC architect

The View-Controller relationship is an example of the Strategy (315) design
pattern. A Strategy is an object that represents an algorithm. It’s useful when you
want to replace the algorithm either statically or dynamically, when you have a
lot of variants of the algorithm, or when the algorithm has complex data
structures that you want to encapsulate.  
MVC uses other design patterns, such as Factory Method (107) to specify the
default controller class for a view and Decorator (175) to add scrolling to a view.
But the main relationships in MVC are given by the Observer, Composite, and
Strategy design patterns

# Cretional Patterns

Creational design patterns abstract the instantiation process. They help make a system independent of how its objects are created, composed, and represented.

Creational patterns become important as systems evolve to depend more on
object composition than class inheritance. As that happens, emphasis shifts away
from hard-coding a fixed set of behaviors toward defining a smaller set of
fundamental behaviors that can be composed into any number of more complex
ones.

## Abstract Factory

### Indent

#### Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

### Uml

![](./uml/Abstract%20Factory.png)

### Consequences

Abstract Factory pattern has the following benefits and liabilities:

#### Isolates concrete classes

The Abstract Factory pattern helps you control the classes of objects that an application creates. Because a factory encapsulates the responsibility and the process of creating product objects, it isolates clients from implementation classes. Clients manipulate instances through their abstract interfaces. Product class names are isolated in the implementation of the concrete factory; they do not appear in client code.

####  It makes exchanging product families easy

The class of a concrete factory appears only once in an application—that is, where it’s instantiated. This makes it easy to change the concrete factory an application uses. It can use different product configurations simply by changing the concrete factory. Because an abstract factory creates a complete family of products, the whole product family changes at once. In our user interface example, we can switch from Motif widgets to Presentation Manager widgets simply by switching the corresponding factory objects and recreating the interface.

#### It promotes consistency among products.

When product objects in a family are designed to work together, it’s important that an application use objects from only one family at a time. AbstractFactory makes this easy to enforce.

#### But Supporting new kinds of products is difficult.

Extending abstract factories to produce new kinds of Products isn’t easy. That’s because the AbstractFactory interface fixes the set of products that can be created. Supporting new kinds of products requires extending the factory interface, which involves changing the AbstractFactory class and all of its subclasses. We discuss one solution to this problem in the Implementation section.

### Implementation

Here are some useful techniques for implementing the Abstract Factory pattern.

#### 

#### Factories as singletons.

An application typically needs only one instance of a ConcreteFactory per product family. So it’s usually best implemented as a Singleton

#### Creating the products

AbstractFactory only declares an interface for creating products. The most common way to implement a subclass is to define a factory method (see ***Factory Method***) for each product. Factory will specify its products by overriding the factory method for each. While this implementation is simple, it requires a new concrete factory subclass for each product family.

If many product families are possible, the concrete factory can be implemented using the ***Prototype*** pattern. The concrete factory is initialized with a prototypical instance of each product in the family, and it creates a new product by cloning its prototype.

#### Defining extensible factories

AbstractFactory usually defines a different operation for each kind of product it can produce. Adding a new kind of product requires
changing the AbstractFactory interface and all the classes that depend on it.

A more flexible but less safe design is to add a parameter to operations that create objects (Polymorphism). For example, AbstractFactory only needs a single “Make” operation with a parameter indicating the kind of object to create. This is the technique used in the Prototype-and the class-based abstract factories discussed earlier.

### Simple Code




## Factory Method

### Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.



## Builder

### Separate the construction of a complex object from its representation so that the same construction process can create different

representations.


## Prototype

### Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.



## Singleton

### Ensure a class only has one instance, and provide a global point of access to it.





# Structural Patterns

## Adapter

### Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

## Bridge

### Decouple an abstraction from its implementation so that the two can vary independently.





## Composite

### Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly





## Decorator

### Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.





## Facade

### Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.



## Flyweight

### Use sharing to support large numbers of fine-grained objects efficiently.





## Proxy

### Provide a surrogate or placeholder for another object to control





# Behavioral Patterns

## Chain of Reponsibility

### Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.





## Command

### Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.



## Interpreter

### Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.





## Iterator

### Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.



## Mediator

### Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently



## Memento

### Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later.



## Observer

### Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.



## State

### Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.



## Strategy

### Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.



## Template Method

### Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.





## Visitor

### Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.





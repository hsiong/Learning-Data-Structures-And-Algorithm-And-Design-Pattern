- [Before you start](#before-you-start)
- [Things](#things)
  - [Structural things & Notation](#structural-things--notation)
    - [Class](#class)
      - [Active Class Notation](#active-class-notation)
    - [Object](#object)
    - [Interface](#interface)
    - [Collaboration](#collaboration)
    - [Use case](#use-case)
    - [Actor](#actor)
    - [Initial State Notation](#initial-state-notation)
    - [Final State Notation](#final-state-notation)
    - [Component](#component)
    - [Node](#node)
  - [Behavioral Things](#behavioral-things)
    - [Interaction](#interaction)
    - [State machine](#state-machine)
  - [Grouping Things](#grouping-things)
    - [Package](#package)
  - [Annotational Things](#annotational-things)
    - [Note](#note)
- [Relationship](#relationship)
  - [Association](#association)
    - [Aggregation](#aggregation)
      - [Composition](#composition)
  - [Inheritance(or Generalization)](#inheritanceor-generalization)
  - [Realization(or Impletation)](#realizationor-impletation)
  - [Dependency](#dependency)
- [What is UML Diagram?](#what-is-uml-diagram)
  - [Structural diagrams in UML](#structural-diagrams-in-uml)
    - [⭐️⭐️⭐️ Class diagram](#️️️-class-diagram)
      - [Purpose of Class Diagrams](#purpose-of-class-diagrams)
      - [How to Draw a Class Diagram?](#how-to-draw-a-class-diagram)
      - [Demo](#demo)
      - [Where to Use Class Diagrams?](#where-to-use-class-diagrams)
    - [Object Diagram](#object-diagram)
      - [Purpose of Object Diagrams](#purpose-of-object-diagrams)
      - [How to Draw an Object Diagram?](#how-to-draw-an-object-diagram)
      - [Demo](#demo-1)
      - [Where to Use Object Diagrams?](#where-to-use-object-diagrams)
    - [Component Diagrams](#component-diagrams)
      - [Purpose of Component Diagrams](#purpose-of-component-diagrams)
      - [How to Draw a Component Diagram?](#how-to-draw-a-component-diagram)
      - [Demo](#demo-2)
      - [Where to Use Component Diagrams?](#where-to-use-component-diagrams)
    - [⭐️⭐️⭐️ Deployment Diagrams](#️️️-deployment-diagrams)
      - [Purpose of Deployment Diagrams](#purpose-of-deployment-diagrams)
      - [How to Draw a Deployment Diagram?](#how-to-draw-a-deployment-diagram)
      - [Demo](#demo-3)
      - [Where to Use Deployment Diagrams?](#where-to-use-deployment-diagrams)
    - [Package Diagram(To be done...)](#package-diagramto-be-done)
      - [Purpose of Package Diagrams](#purpose-of-package-diagrams)
      - [How to Draw an Package Diagram?](#how-to-draw-an-package-diagram)
      - [Demo](#demo-4)
      - [Where to Use Package Diagrams?](#where-to-use-package-diagrams)
    - [Composite Structure Diagram(To be done...)](#composite-structure-diagramto-be-done)
      - [Purpose of Composite Structure Diagrams](#purpose-of-composite-structure-diagrams)
      - [How to Draw an Composite Structure Diagram?](#how-to-draw-an-composite-structure-diagram)
      - [Demo](#demo-5)
      - [Where to Use Composite Structure Diagrams?](#where-to-use-composite-structure-diagrams)
    - [Profile Diagram(To be done...)](#profile-diagramto-be-done)
      - [Purpose of Profile Diagrams](#purpose-of-profile-diagrams)
      - [How to Draw an Profile Diagram?](#how-to-draw-an-profile-diagram)
      - [Demo](#demo-6)
      - [Where to Use Profile Diagrams?](#where-to-use-profile-diagrams)
  - [Behavioral diagrams in UML](#behavioral-diagrams-in-uml)
    - [Use Case Diagrams](#use-case-diagrams)
      - [Purpose of Use Case Diagrams](#purpose-of-use-case-diagrams)
      - [How to Draw a Use Case Diagram?](#how-to-draw-a-use-case-diagram)
      - [Demo](#demo-7)
      - [Where to Use a Use Case Diagram?](#where-to-use-a-use-case-diagram)
    - [Activity Diagram](#activity-diagram)
      - [Purpose of Activity Diagrams](#purpose-of-activity-diagrams)
      - [How to Draw an Activity Diagram?](#how-to-draw-an-activity-diagram)
      - [Demo](#demo-8)
      - [Where to Use Activity Diagrams?](#where-to-use-activity-diagrams)
    - [Statechart Diagram](#statechart-diagram)
      - [Purpose of Statechart Diagrams](#purpose-of-statechart-diagrams)
      - [How to Draw an Statechart Diagram?](#how-to-draw-an-statechart-diagram)
      - [Demo](#demo-9)
      - [Where to Use Statechart Diagrams?](#where-to-use-statechart-diagrams)
  - [Interaction diagrams in UML](#interaction-diagrams-in-uml)
    - [Interaction diagrams in UML 1.0](#interaction-diagrams-in-uml-10)
- [UML 2.0 - Overview](#uml-20---overview)

# Before you start

***Reference***

+ https://www.tutorialspoint.com/uml/uml_building_blocks.htm
+ https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/
+ https://www.softwaretestinghelp.com/uml-diagram-tutorial/
+ https://en.wikipedia.org/wiki/Unified_Modeling_Language



Following object-oriented concepts are required to begin with UML:

+ Object: It is a real-world entity. There are multiple objects available within a single system. It is a fundamental building block of UML.
+ Class: A class is nothing but a container where objects and their relationships are maintained.
+ Abstraction: It is a mechanism of representing an entity without showing the implementation details. It is used to visualize the behavior of an object.
+ Inheritance: It is a mechanism of extending an existing class to create a new class.
+ Polymorphism: It is a mechanism of representing an object having multiple forms which are used for different purposes.
+ Encapsulation: It is a method of binding the object and the data together as a single unit. It ensures tight coupling between the object and the data.

> Learning tip: learing diagram first, if any question about `building blocks`, review [Things](#things) & [Relationship](#relationship)



# Things

Things are the most important building blocks of UML. Things can be −

+ Structural
+ Behavioral
+ Grouping
+ Annotational

## Structural things & Notation

Structural things define the static part of the model. They represent the physical and conceptual elements. Following are the brief descriptions of the structural things:

### Class

A class represent a concept which encapsulates state (**attributes**) and behavior (**operations**). Each attribute has a type. Each **operation** has a **signature**. *The class name is the **only mandatory information***.

![image](https://user-images.githubusercontent.com/37357447/189065154-2998486e-8a09-4a2c-898f-af458c22718c.png)



**Class Name:**

- The name of the class appears in the first partition.

**Class Attributes:**

- Attributes are shown in the second partition.
- The attribute type is shown after the colon.
- Attributes map onto member variables (data members) in code.
- Class Visibility: The +, - and # symbols before an attribute and operation name in a class denote the visibility of the attribute and operation.
  - \+ denotes <u>public</u> attributes or operations
  - \- denotes <u>private</u> attributes or operations
  - \# denotes <u>protected</u> attributes or operations

![image](https://user-images.githubusercontent.com/37357447/189064885-c848eac8-e537-4ee2-8217-8ec43d38bd98.png)

**Class Operations (Methods):**

- Operations are shown in the third partition. They are services the class provides.
- The return type of a method is shown after the colon at the end of the method signature.
- The return type of method parameters are shown after the colon following the parameter name. Operations map onto class methods in code.
  ![image](https://user-images.githubusercontent.com/37357447/189064978-1849db8f-b407-4f78-8f7f-59d23ac57997.png)

> Parameter Directionality: Each parameter in an operation (method) may be denoted as **in**, **out** or **inout** which specifies its direction with respect to the caller. This directionality is shown before the parameter name.
>
> *<u>But generally, you don't need to write so</u>*
> ![image](https://user-images.githubusercontent.com/37357447/189064812-27ca42ba-1eaf-4b14-995a-f88f39ee5a30.png)





![image](https://user-images.githubusercontent.com/37357447/189064750-c5997116-6623-40a4-8f7a-9e24545a6fdc.png)



##### Active Class Notation

Active class looks similar to a class with a solid border. Active class is generally used to describe the concurrent behavior of a system.

![image](https://user-images.githubusercontent.com/37357447/189064550-e715a3f5-f66a-4bd2-917b-097c174ff9f4.png)

Active class is used to represent the concurrency in a system.



### Object

The *object* is represented in the same way as the class. <u>The only difference is the *name* which is underline</u>d as shown in the following figure.

![image](https://user-images.githubusercontent.com/37357447/189063705-ae7c9f8d-f5b3-4253-9d15-5de5973bd84d.png)

As the object is an actual implementation of a class, which is known as the instance of a class. Hence, it has the same usage as the class.


### Interface

Interface is represented by a circle as shown in the following figure. It has a name which is generally written below the circle.

![image](https://user-images.githubusercontent.com/37357447/189063926-8e76ddc9-1532-4147-8743-4c3b22db40a3.png)

Interface is used to describe the functionality without implementation. Interface is just like a template where you define different functions, not the implementation. When a class implements the interface, it also implements the functionality as per requirement.

### Collaboration

Collaboration is represented by a dotted eclipse as shown in the following figure. It has a name written inside the eclipse.

![image](https://user-images.githubusercontent.com/37357447/189063848-72662cd8-7cb2-4cee-af20-a1903377fed2.png)

<u>Collaboration represents responsibilities</u>. Generally, responsibilities are in a group.

### Use case

Use case is represented as an eclipse with a name inside it. It may contain additional responsibilities.

![image](https://user-images.githubusercontent.com/37357447/189063985-a24e8634-7e5a-426e-8af4-0f842d80c4be.png)

Use case is used to capture high level functionalities of a system.

### Actor

An actor can be defined as some internal or external entity that interacts with the system.

![image](https://user-images.githubusercontent.com/37357447/189064329-47e38785-e407-459a-b380-5a4818136a69.png)

An actor is used in a use case diagram to describe the internal or external entities.

### Initial State Notation

Initial state is defined to show the start of a process. This notation is used in almost all diagrams.

![image](https://user-images.githubusercontent.com/37357447/189064385-5b9d4e00-6bb8-4f72-acb8-d32d510d3634.png)

The usage of Initial State Notation is to show the starting point of a process.

### Final State Notation

Final state is used to show the end of a process. This notation is also used in almost all diagrams to describe the end.

![image](https://user-images.githubusercontent.com/37357447/189064484-34c5f13f-98bb-44f8-80cb-3394c46780c0.png)

The usage of Final State Notation is to show the termination point of a process.

### Component

A component in UML is shown in the following figure with a name inside. Additional elements can be added wherever required.

![image](https://user-images.githubusercontent.com/37357447/189065286-c841d90a-6889-4200-8418-77f962146646.png)

Component is used to <u>represent any part of a system</u> for which UML diagrams are made.

### Node

A node in UML is represented by a square box as shown in the following figure with a name. A node represents the <u>physical component</u> of the system.

![image](https://user-images.githubusercontent.com/37357447/189065323-49edfde4-d64a-4ebc-ab55-54a04b3ca8cb.png)

Node is used to represent the physical part of a system such as the server, network, etc.

## Behavioral Things

A behavioral thing consists of the dynamic parts of UML models. Following are the behavioral things:



### Interaction

Interaction is basically a message exchange between two UML components. The following diagram represents different notations used in an interaction.

Interaction is used to represent the communication among the components of a system.

![image](https://user-images.githubusercontent.com/37357447/189066892-92acae6a-ad99-4bbd-8354-902f923e596a.png)



### State machine

State machine describes the different states of a component in its life cycle. The notations are described in the following diagram.

![image](https://user-images.githubusercontent.com/37357447/189067489-3450711d-dd66-4a90-b56b-4a388867659b.png)

State machine is used to describe different states of a system component. The state can be active, idle, or any other depending upon the situation.

## Grouping Things

Grouping things can be defined as a mechanism to group elements of a UML model together. There is only one grouping thing available - package.

### Package

Package notation is shown in the following figure and is used to wrap the components of a system.

![image](https://user-images.githubusercontent.com/37357447/189069805-cb8713de-60a4-4ddb-a317-5c6187de41aa.png)



## Annotational Things

Annotational things can be defined as a mechanism to capture remarks, descriptions, and comments of UML model elements.

### Note

This notation is shown in the following figure. These notations are used to provide necessary information of a system.

![image](https://user-images.githubusercontent.com/37357447/189071203-f211a830-8833-4e9b-b6c6-736c6524fff3.png)



# Relationship

Relationship is another most important building block of UML. It shows how the elements are associated with each other and this association describes the functionality of an application.

There are six kinds of relationships available:

![image](https://user-images.githubusercontent.com/37357447/189287006-99f6d5bd-c575-4c4b-b3d8-caea4c0a5e24.png)

## Association

Association describes how the elements in a UML diagram are associated. In simple words, it describes how many elements are taking part in an interaction.

Association is represented by a dotted line with (without) arrows on both sides. The two ends represent two associated elements as shown in the following figure. The multiplicity is also mentioned at the ends (1, *, etc.) to show how many objects are associated.

![image](https://user-images.githubusercontent.com/37357447/189287811-19a21df2-115a-48fe-a455-534e4dc5587f.png)

Association is used to represent the relationship between two elements of a system & basically a set of links that connects the elements of a UML model. It also describes how many objects are taking part in that relationship.

### Aggregation

A special type of association.

- It represents a "part of" relationship.
- Class2 is part of Class1.
- Many instances (denoted by the *) of Class2 can be associated with Class1.
- <u>Objects of Class1 and Class2 have separate lifetimes</u>.

The figure below shows an example of aggregation. The relationship is displayed as a solid line with a unfilled diamond at the association end, which is connected to the class that represents the aggregate.

> In my opinion, I guess using association datasheet (related ID) to implement this.

![image](https://user-images.githubusercontent.com/37357447/189286964-e2806fca-fdbc-4e2f-b772-054335376137.png)

#### Composition

- A special type of aggregation where parts are destroyed when the whole is destroyed.
- <u>Objects of Class2 live and die with Class1.</u>
- Class2 cannot stand by itself.

The figure below shows an example of composition. The relationship is displayed as a solid line with a filled diamond at the association end, which is connected to the class that represents the whole or composite.

> In my opinion, I guess using extended subdatasheet (foreign key on delete) to implement this.

![Composition](https://cdn-images.visual-paradigm.com/guide/uml/uml-class-diagram-tutorial/13-composition.png)

## Inheritance(or Generalization)

Generalization describes the inheritance relationship of the object-oriented world. It is a parent and child relationship.

Generalization is represented by an arrow with a hollow arrow head as shown in the following figure. One end represents the parent element and the other end represents the child element.

![image](https://user-images.githubusercontent.com/37357447/189072392-9fcf8553-8174-4079-9e37-62cc9e442e74.png)

Generalization is used to describe parent-child relationship of two elements of a system.

## Realization(or Impletation)

Realization can be defined as a relationship in which two elements are connected. One element describes some responsibility, which is not implemented and the other one implements them. This relationship exists in case of interfaces.

![image](https://user-images.githubusercontent.com/37357447/189072793-2dccf621-d640-4ca8-9f4f-818b542966c6.png)

## Dependency

Dependency is an important aspect in UML elements. It describes the dependent elements and the direction of dependency.

Dependency is represented by a dotted arrow as shown in the following figure. The arrow head represents the independent element and the other end represents the dependent element.

![image](https://user-images.githubusercontent.com/37357447/189072103-b23fb680-3e79-4e78-91bf-4098f40eb12f.png)

Dependency is used to represent the dependency between two elements of a systemAssociation.




# What is UML Diagram?

![1234](https://upload.wikimedia.org/wikipedia/commons/e/ed/UML_diagrams_overview.svg)
UML diagrams are divided into two different categories such as,

+ Structural diagram
+ Behavioral diagram
+ Interaction diagram (UML 2.0)

## Structural diagrams in UML

Structural diagrams are used to represent a static view of a system. It represents a part of a system that makes up the structure of a system. A structural diagram shows various objects within the system.

Following are the various structural diagrams in UML:

+ Class diagram
+ Object diagram
+ Component diagram
+ Deployment diagram
+ Package diagram
+ Composite structure diagram
+ Profile diagram

### ⭐️⭐️⭐️ Class diagram

Class diagrams are the most common diagrams used in UML. <u>Class diagram consists of classes, interfaces, associations, and collaboration.</u> Class diagrams basically represent the object-oriented view of a system, which is static in nature.

Active class is used in a class diagram to represent the concurrency of the system.

Class diagram represents the object orientation of a system. Hence, it is generally used for development purpose. This is the most widely used diagram at the time of system construction.



+ Example: Order System

![image](https://user-images.githubusercontent.com/37357447/189074935-05cf66fb-3c40-427a-be9e-c00cad0c7457.png)



+ Example: GUI

![image](https://user-images.githubusercontent.com/37357447/189075395-abfdc446-0a34-400b-883d-17d35a4439c5.png)

#### Purpose of Class Diagrams

The purpose of the class diagram can be summarized as −

- Analysis and design of the static view of an application.
- Describe responsibilities of a system.
- Base for component and deployment diagrams.
- Forward and reverse engineering.

#### How to Draw a Class Diagram?

Class diagrams are the most popular UML diagrams used for construction of software applications.

Class diagram is basically a graphical representation of the static view of the system and represents different aspects of the application. A collection of class diagrams represent the whole system.

The following points should be remembered while drawing a class diagram −

- The ***name*** of the class diagram should be meaningful to describe the aspect of the system.
- Each element and their ***relationships*** should be identified in advance.
- ***Responsibility*** (attributes and methods) of each class should be clearly identified
- For each class, ***minimum number of properties*** should be specified, as unnecessary properties will make the diagram complicated.
- Use ***notes*** whenever required to describe some aspect of the diagram. At the end of the drawing it should be understandable to the developer/coder.
- Finally, before making the final version, the diagram should be drawn on plain paper and ***reworked*** as many times as possible to make it correct.

#### Demo

The following diagram is an example of an Order System of an application. It describes a particular aspect of the entire application.

- First of all, Order and Customer are identified as the two elements of the system. They have a one-to-many relationship because a customer can have multiple orders.
- Order class is an abstract class and it has two concrete classes (inheritance relationship) SpecialOrder and NormalOrder.
- The two inherited classes have all the properties as the Order class. In addition, they have additional functions like dispatch () and receive ().

<img src="https://user-images.githubusercontent.com/37357447/189291508-d97d63c5-7c12-4660-a0e1-937fd21edfe0.png" alt="image" style="zoom:50%;" />

#### Where to Use Class Diagrams?

In a nutshell it can be said, class diagrams are used for −

- Describing the static view of the system.
- Showing the collaboration among the elements of the static view.
- Describing the functionalities performed by the system.
- Construction of software applications using object oriented languages.

### Object Diagram

Object diagrams can be described as an instance of class diagram. Thus, these diagrams are more close to real-life scenarios where we implement a system.



Class Diagrams & Object Diagram are both made of same basic elements but in different form. In class diagram elements are in abstract form to represent the blue print and in object diagram the elements are in concrete form to represent the real world object.



<u>To capture a particular system, numbers of class diagrams are limited. However, if we consider object diagrams then we can have unlimited number of instances, which are unique in nature.</u>

#### Purpose of Object Diagrams

The purpose of the object diagram can be summarized as −

- Forward and reverse engineering.
- Object relationships of a system
- Static view of an interaction.
- Understand object behaviour and their relationship from practical perspective

#### How to Draw an Object Diagram?

Only those instances are considered, which have an impact on the system.

1. From the above discussion, it is clear that a single object diagram cannot capture all the necessary instances or rather cannot specify all the objects of a system. Hence, the solution is −

- First, ***decide instances*** - Analyze the system and decide which instances have important data and association.
- Second, ***consider instantces & function*** - Consider only those instances, which will cover the functionality.
- Third, ***optimize*** - Make some optimization as the number of instances are unlimited.

2. Before drawing an object diagram, the following things should be remembered and understood clearly −

- ***Objects and links*** are the two elements used to construct an object diagram.

- Same as Class Diagram:

  - The object diagram should have a ***meaningful name*** to indicate its purpose.

  - The ***most important elements*** are to be identified.

  - The ***association*** among objects should be clarified.

  - Values of ***different elements*** need to be captured to include in the object diagram.

  - Add ***proper notes*** at points where more clarity is required.

#### Demo

The following diagram is an example of an object diagram. It represents the Order management system which we have discussed in the chapter Class Diagram. The following diagram is an instance of the system at a particular time of purchase. It has the following objects.

- Customer
- Order
- SpecialOrder
- NormalOrder

Now the customer object (C) is associated with three order objects (O1, O2, and O3). These order objects are associated with special order and normal order objects (S1, S2, and N1). The customer has the following three orders with different numbers (12, 32 and 40) for the particular time considered.

The customer can increase the number of orders in future and in that scenario the object diagram will reflect that. If order, special order, and normal order objects are observed then you will find that they have some values.

For orders, the values are 12, 32, and 40 which implies that the objects have these values for a particular moment (here the particular time when the purchase is made is considered as the moment) when the instance is captured

The same is true for special order and normal order objects which have number of orders as 20, 30, and 60. If a different time of purchase is considered, then these values will change accordingly.

The following object diagram has been drawn considering all the points mentioned above

![image](https://user-images.githubusercontent.com/37357447/189292039-3d61cb4d-7937-49fe-9a37-e0be57b821f4.png)



#### Where to Use Object Diagrams?

These diagrams are used to describe the physical components (hardware), their distribution, and association.

In a nutshell, it can be said that object diagrams are used for −

- Making the prototype of a system.
- Reverse engineering.
- Modeling complex data structures.
- Understanding the system from practical perspective.

### Component Diagrams

Component diagrams are used to model the physical aspects of a system. Physical aspects are the elements such as executables, libraries, files, documents, etc. which reside in a node.



Component diagrams are used to visualize the organization and relationships among components in a system. These diagrams are also used to make executable systems.Component diagrams can also be described as a static implementation view of a system. Static implementation represents the organization of the components at a particular moment.



A single component diagram cannot represent the entire system but a collection of diagrams is used to represent the whole.

#### Purpose of Component Diagrams

Component diagrams are used to describe the physical artifacts of a system. This artifact includes files, executables, libraries, etc.



The purpose of the component diagram can be summarized as −

- Visualize the components of a system.
- Construct executables by using forward and reverse engineering.
- Describe the organization and relationships of the components.



Component diagrams are used

+ during the **implementation phase** of an application
+ in advance to **visualize the implementation details**
+ **get an idea of the implementation** when the artifacts are ready
+ A well-prepared component diagram **is also important for other aspects** such as application performance, maintenance, etc.

#### How to Draw a Component Diagram?

1. Before drawing a component diagram, the following artifacts are to be identified clearly −

- ***Files*** used in the system.
- ***Libraries and other artifacts*** relevant to the application.
- ***Relationships*** among the artifacts.

2. After identifying the artifacts, the following points need to be kept in mind.

- Use a ***meaningful name*** to identify the component for which the diagram is to be drawn.
- Prepare a ***mental layout*** before producing the using tools.
- Use ***notes*** for clarifying important points.

#### Demo

Following is a component diagram for order management system. Here, the artifacts are files. The diagram shows the files in the application and their relationships. In actual, the component diagram also contains dlls, libraries, folders, etc. In the following diagram, four files are identified and their relationships are produced.



The following component diagram has been drawn considering all the points mentioned above. Component diagram cannot be matched directly with other UML diagrams discussed so far as it is drawn for completely different purpose.

![image](https://user-images.githubusercontent.com/37357447/189320133-21231360-62b9-4458-a32c-875990ade7a6.png)

#### Where to Use Component Diagrams?

Component diagrams can be used to −

- Model the components of a system.
- Model the database schema.
- Model the executables of an application.
- Model the system's source code.

### ⭐️⭐️⭐️ Deployment Diagrams

<u>Deployment diagrams are used to visualize the topology of the physical components of a system, where the software components are deployed.</u> Deployment diagrams consist of nodes and their relationships.



Deployment diagrams are used for describing the hardware components, where software components are deployed.



Component diagrams and deployment diagrams are closely related. Component diagrams are used to describe the components and deployment diagrams shows how they are deployed in hardware, while these two diagrams are special diagrams used to focus on software and hardware components.

#### Purpose of Deployment Diagrams

The purpose of deployment diagrams can be described as −

- Visualize the **hardware topology** of a system.
- Describe the **hardware components** used to deploy software components.
- Describe the **runtime processing nodes**.



#### How to Draw a Deployment Diagram?

A deployment diagram consists of nodes. Nodes are nothing but physical hardware used to deploy the application.



1. An efficient deployment diagram is very important as it controls the following parameters −

- ***Performance***
- ***Scalability***
- ***Maintainability***
- ***Portability***

2. Before drawing a deployment diagram, the following artifacts should be identified −

- ***Nodes***
- ***Relationships among nodes***

#### Demo

Following is a sample deployment diagram to provide an idea of the deployment view of order management system. Here, we have shown nodes as −

- Web Browser
- Nginx
- Gategay
- ...

The following deployment diagram has been drawn considering all the points mentioned above.



![image](https://user-images.githubusercontent.com/37357447/197964509-313c5966-2403-4ef9-8196-ec6df4042c8d.png)



#### Where to Use Deployment Diagrams?

+ Deployment diagrams can be **visualized** as the hardware components/nodes on which the software components reside.
+ Efficient software applications are not sufficient to meet the **business requirements**. Business requirements can be described as the need to support the increasing number of users, quick response time, etc. Now-a-days software applications are very complex in nature. Software applications can be standalone, web-based, distributed, mainframe-based and many more. Hence, it is very important to design the hardware components efficiently.



To meet these types of requirements, hardware components should be designed efficiently and in a cost-effective way. Deployment diagrams can be used −

- To model the hardware topology of a system.
- To model the embedded system.
- To model the hardware details for a client/server system.
- To model the hardware details of a distributed application.
- For Forward and Reverse engineering.

### Package Diagram(To be done...)

#### Purpose of Package Diagrams

#### How to Draw an Package Diagram?

#### Demo

#### Where to Use Package Diagrams?


### Composite Structure Diagram(To be done...)

#### Purpose of Composite Structure Diagrams

#### How to Draw an Composite Structure Diagram?

#### Demo

#### Where to Use Composite Structure Diagrams?

### Profile Diagram(To be done...)

#### Purpose of Profile Diagrams

#### How to Draw an Profile Diagram?

#### Demo

#### Where to Use Profile Diagrams?

## Behavioral diagrams in UML



Any real-world system can be represented in either a static form or a dynamic form. A system is said to be complete if it is expressed in both the static and dynamic ways. The behavioral diagram represents the functioning of a system.

UML diagrams that deals with the static part of a system are called structural diagrams. UML diagrams that deals with the moving or dynamic parts of the system are called behavioral diagrams.

Following are the various behavioral diagrams in UML:

+ Use case diagram
+ Activity diagram
+ State machine diagram

### Use Case Diagrams

To model a system, the most important aspect is to capture the dynamic behavior - <u>dynamic behavior</u> means the behavior of the system when it is running/operating. Only static behavior is not sufficient to model a system rather dynamic behavior is more important than static behavior.



In UML, there are five diagrams available to model the dynamic nature and use case diagram is one of them(Use case, Activity, Sequence, Collaboration, and Statechart). Use case diagram is used to model the system/subsystem of an application.

+ There should be some internal or external factors for making the interaction. These internal and external agents are known as `actors`.
+ Use case diagrams consists of actors, use cases and their relationships.

Hence to model the entire system, a number of use case diagrams are used.

#### Purpose of Use Case Diagrams

In brief, the purposes of use case diagrams can be said to be as follows −

- Used to gather the requirements of a system.
- Used to get an outside view of a system.
- Identify the external and internal factors influencing the system.
- Show the interaction among the requirements are actors.

#### How to Draw a Use Case Diagram?

Use case diagrams are considered for high level requirement analysis of a system. When the requirements of a system are analyzed, the functionalities are captured in use cases.

+ We can say that use cases are nothing but the `system functionalities` written in an organized manner.
+ The second thing which is relevant to use cases are the `actors`. Actors can be defined as something that interacts with the system. <u>Actors can be a human user, some internal applications, or may be some external applications.</u>



When we are planning to draw a use case diagram, we should have the following items identified:

- **Functionalities** to be represented as use case
- **Actors**
- **Relationships** among the use cases and actors.



After identifying the above items, we have to use the following guidelines to draw an efficient use case diagram:

- The <u>name of a use case</u> is very important. The name should be chosen in such a way so that it can identify the functionalities performed.
- Give a suitable <u>name for actors</u>.
- Show <u>relationships and dependencies</u> clearly in the diagram.
- <u>Do not try to include all types of relationships</u>, as the main purpose of the diagram is to identify the requirements.
- <u>Use notes</u> whenever required to clarify some important points.

#### Demo

Following is a sample use case diagram representing the <u>order management system</u>. Hence, if we look into the diagram then we will find three use cases **(Order, SpecialOrder, and NormalOrder)** and one actor which is the customer.



The SpecialOrder and NormalOrder use cases are extended from *Order* use case. Hence, they have extended relationship. Another important point is to identify the system boundary, which is shown in the picture. The actor Customer lies outside the system as it is an external user of the system.



![image](https://user-images.githubusercontent.com/37357447/200495092-a9e21299-0e59-4ee4-8879-050234ef90a7.png)



#### Where to Use a Use Case Diagram?

The specific purpose of Use case diagram is to gather system requirements and actors.



Use case diagrams specify the events of a system and their flows. But use case diagram never describes how they are implemented. <u>Use case diagram can be imagined as a black box where only the input, output, and the function of the black box is known.</u>



This high level design is refined again and again to get a complete and practical picture of the system. <u>A well-structured use case also describes the pre-condition, post condition, and exceptions.</u> These extra elements are used to make test cases when performing the testing.



Although use case is not a good candidate for forward and reverse engineering, still they are used in a slightly different way to make forward and reverse engineering.

+ In forward engineering, use case diagrams are used to make test cases and in reverse engineering use cases are used to prepare the requirement details from the existing application.



Briefly, use case diagrams can be used for −

- Requirement analysis and high level design.
- Model the context of a system.
- Reverse engineering.
- Forward engineering.



### Activity Diagram

<u>Activity diagram is basically a flowchart to represent the flow from one activity to another activity</u>. The activity can be described as an operation of the system.

#### Purpose of Activity Diagrams

Activity diagram is used to show message flow from one activity to another. Activity diagrams are not only used for visualizing the dynamic nature of a system, but they are also used to construct the executable system by using forward and reverse engineering techniques.



The only missing thing in the activity diagram is the message part.It does not show any message flow from one activity to another.



The control flow is drawn from one operation to another. This flow can be sequential, branched, or concurrent. Activity diagrams deal with all type of flow control by using different elements such as fork, join, etc.



One important point should be clearly understood that an activity diagram cannot be exactly matched with the code. <u>The activity diagram is made to understand the flow of activities and is mainly used by the business users</u>.



The purpose of an activity diagram can be described as −

- Draw the activity flow of a system.
- Describe the sequence from one activity to another.
- Describe the parallel, branched and concurrent flow of the system.

#### How to Draw an Activity Diagram?

Activity diagrams are not exactly flowcharts as they have some additional capabilities:

+ Activity diagrams are mainly used as a flowchart that consists of activities performed by the system.
+ The additional capabilities include branching, parallel flow, swimlane, etc.



Before drawing an activity diagram, we should identify the following elements −

- `Activities`. An activity is a function performed by the system. After identifying the activities, we need to understand how they are associated with constraints and conditions.
- Association
- Conditions
- Constraints



Once the above-mentioned parameters are identified, we need to make a <u>mental layout</u> of the entire flow. This mental layout is then transformed into an activity diagram.



#### Demo

Following is an example of an activity diagram for order management system. In the diagram, four activities are identified which are associated with conditions.



Following diagram is drawn with the four main activities −

- Send order by the customer
- Receipt of the order
- Confirm the order
- Dispatch the order

As the following show, after receiving the order request, condition checks are performed to check if it is normal or special order. After the type of order is identified, dispatch activity is performed and that is marked as the termination of the process.



![image](https://user-images.githubusercontent.com/37357447/200762170-c881717a-71bb-4d35-a66e-34bd65acd941.png)

#### Where to Use Activity Diagrams?

Activity diagram is suitable for modeling the activity flow of the system. Activity diagram also captures these systems and describes the flow from one system to another. An application can have multiple systems. These systems can be database, external queues, or any other system.



This diagram is used to model the activities which are nothing but business requirements. The diagram has more impact on business understanding rather than on implementation details.



Activity diagram can be used for −

- Modeling work flow by using activities.
- Modeling business requirements.
- High level understanding of the system's functionalities.
- Investigating business requirements at a later stage.



### Statechart Diagram

Statechart diagram is used to describe the states of different objects in its life cycle. <u>This diagram describes different states of a component in a system</u>. The states are specific to a component/object of a system.



A Statechart diagram describes a <u>state machine</u>. State machine can be defined as a machine which defines different states of an object and these states are controlled by external or internal events.

#### Purpose of Statechart Diagrams

Statechart diagrams are useful to model the reactive systems. Reactive systems can be defined as a system that responds to external or internal events.



Statechart diagram describes the flow of control from one state to another state. States are defined as a condition in which an object exists and it changes when some event is triggered. <u>The most important purpose of Statechart diagram is to model lifetime of an object from creation to termination.</u>



Statechart diagrams are also used for forward and reverse engineering of a system. However, the main purpose is to model the reactive system.



Following are the main purposes of using Statechart diagrams −

- To model the dynamic aspect of a system.
- To model the life time of a reactive system.
- To describe different states of an object during its life time.
- Define a state machine to model the states of an object.

#### How to Draw an Statechart Diagram?

Statechart diagrams are very important for describing the states. States can be identified as the condition of objects when a particular event occurs. Emphasis is placed on the state changes upon some internal or external events. These states of objects are important to analyze and implement them accurately.



Before drawing a Statechart diagram we should clarify the following points −

- Identify the `important objects` to be analyzed.
- Identify the `states`.
- Identify the `events`.

#### Demo

Following is an example of a Statechart diagram where the state of Order object is analyzed.

+ The first state is an idle state from where the process starts.
+ The next states are arrived for events like send request, confirm request, and dispatch order.
+ These events are responsible for the state changes of order object.

During the life cycle of an object (here order object) it goes through the following states and there may be some `abnormal` exits. This abnormal exit may occur due to some problem in the system. When the entire life cycle is complete, it is considered as a complete transaction as shown in the following figure. The initial and final state of an object is also shown in the following figure.



![image](https://user-images.githubusercontent.com/37357447/200793449-19aa282c-d5f8-48c7-966b-899be6450b86.png)

#### Where to Use Statechart Diagrams?

Statechart diagram defines the states of a component and these state changes are dynamic in nature. Its specific purpose is to define the state changes triggered by events. Events are internal or external factors influencing the system.



Statechart diagrams are used to model the states and also the events operating on the system. <u>When implementing a system, it is very important to clarify different states of an object during its life time and Statechart diagrams are used for this purpose.</u> When these states and events are identified, they are used to model it and these models are used during the implementation of the system.



If we look into the practical implementation of Statechart diagram, then it is mainly used to analyze the object states influenced by events. This analysis is helpful to understand the system behavior during its execution.



The main usage can be described as −

- To model the object states of a system.
- To model the reactive system. Reactive system consists of reactive objects.
- To identify the events responsible for state changes.
- Forward and reverse engineering.




## Interaction diagrams in UML

Interaction diagram is nothing but a subset of behavioral diagrams. It is used to visualize the flow between various use case elements of a system. Interaction diagrams are used to show an interaction between two entities and how data flows within them.

Following are the various interaction diagrams in UML:

+ Timing diagram (UML 2.0)
+ Sequence diagram (UML 2.0)
+ Communication diagram / Collaboration diagram (UML 2.0)
+ Interaction Overview diagram (UML 2.0)

### Interaction diagrams in UML 1.0



# UML 2.0 - Overview


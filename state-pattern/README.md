# Design Pattern - State
Known also as Objects for states pattern

## Intent

>Allows an object to alter its behavior when its internal state changes.

>In this approach usually object changes its class.

## Problem

>Change of object's behavior at run-time.

>Behavior change depends on actual object state.


## Pattern values

* Encapsulate behavior in scope of state *)
* Reduces ``if``s.
* Basically reduces or removes state-change conditional logic.
* Simplifies state transitions.


## Procedure

1. Define interface for ``clients``. This class will be responsible for assigning initial state. It is called context class.

2. Define abstract class for object state

3. Different states will be represented as derived classes of the state base class

4. Method responsible for state transition (in state class) gets as a parameter instance of a context class


## Structure

[id]: https://raw.github.com/piotrziemniak/Java-Patterns/master/state-pattern/src/main/resources/State-pattern-diagram.gif "Source: http://sourcemaking.com/design_patterns/state"

![Diagram][id]
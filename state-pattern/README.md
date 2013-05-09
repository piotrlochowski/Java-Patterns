# Design Pattern - State
Known also as Objects for states pattern

## Intent

Allows an object to alter its behavior when its internal state changes.
In this approach usually object changes its class.

## Problem

Change of object's behavior at run-time.
Behavior change depends on actual object state.


## Pattern values

1. Encapsulate behavior in scope of state *)
2. Reduces
``if``
s.
3. Basically reduces or removes state-change conditional logic.
4. Simplifies state transitions.


## Procedure

1. Define interface for ``
clients``
. This class will be responsible for assigning initial state. It is called context class.

2. Define abstract class for object state

3. Different states will be represented as derived classes of the state base class

# Builder Message

## Builder Pattern Implementation for a Messaging Service

### Problem Statement
You are developing a messaging application that supports various message types, including text, images, audio, and video. Each message type can have additional attributes such as delivery status and timestamps. The current method—using multiple overloaded constructors—is error-prone and difficult to maintain. Your goal is to streamline message object creation with a flexible, immutable design using the Builder pattern.

---

### Assignment
Implement the Builder pattern to facilitate the creation of message objects with different configurations. 
The pattern enables step-by-step construction while keeping object creation separate from the object's main logic.

---

### Implementing the Builder Pattern

1. Review the original class: You have been provided with a class named Message. This class represents different message types and their attributes. Your task is to implement the Builder pattern to create instances of a class with the same properties.
2. Create the builder class: Create a new class called MessageBuilder that will implement the builder patter. A dummy class has been provided for you to start with. Remember to annotate the class with the WithBuilder annotation. The name does not matter as long as it is annotated.
3. Test your implementation: Test cases has been provided for you to test your implementation. Run the test case to ensure that your implementation is correct.


# 📝 Problem Solutions
---
### Source code : [BuilderMessage.java](../../../../../../../../src/lowLevelDesignModuleTwo/QuestionAnswer/BackendLLDDesignPatternsBuilder/Assignment/BuilderMessage/ActualQuestion/BuilderMessage.java)
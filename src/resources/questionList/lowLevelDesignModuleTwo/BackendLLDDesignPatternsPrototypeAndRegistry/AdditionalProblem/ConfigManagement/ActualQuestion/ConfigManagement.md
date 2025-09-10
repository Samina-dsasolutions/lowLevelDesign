Q1. Config management

Prototype Pattern for Configuration Object Cloning
Problem Statement
You are developing a configuration management system for your application. This system allows users to define and manage various configurations with different attributes. Creating new configurations with specific attributes is a frequent task during testing and development. However, setting up these configurations manually can be time-consuming and error-prone. To streamline this process, you decide to implement the Prototype pattern. This pattern will enable you to create prototype configuration objects and clone them when needed, saving time and reducing the risk of errors.

Assignment
Your task is to implement the Prototype pattern to create prototype objects for configuration management. There is a Cloneable interface that contains the clone method, which should be implemented by configuration objects. Additionally, you need to implement a ConfigurationPrototypeRegistry interface that provides methods for adding and retrieving configuration prototypes and for cloning configuration objects. The goal is to simplify the process of creating configurations with specific attributes.

Implementing the Prototype Pattern
Review the Cloneable interface: Have a look at the interface named Cloneable with a single method, clone_object(), that returns a cloned copy of the implementing object.

Implement the clone_object() method: Review the Configuration class with attributes for the app. Implement the clone_object() from the Cloneable interface. Your method should create a new Configuration object and copy the attribute values from the original object to the new object. Return the new object as the cloned copy. You can either implement the cloning logic or use a library like copy clone the object. You can use any of shallow or deep cop.

Review the ConfigurationPrototypeRegistry interface: See the interface named ConfigurationPrototypeRegistry that includes methods for adding prototypes, retrieving prototypes by type, and cloning configuration objects.

Complete the registry implementation: A class that inherits from the ConfigurationPrototypeRegistry interface is present in the codebase. However, the methods are not implemented. You need to implement the methods to manage configuration prototypes and perform cloning operations. In this class, manage a collection of configuration prototypes and provide methods to add prototypes, retrieve prototypes by type, and clone configuration objects based on their type.

Instructions
Clone this repository to your local machine.
Implement the Prototype pattern by completing the clone_object() method in the Configuration class.
Implement the ConfigurationPrototypeRegistry interface to manage configuration prototypes and perform cloning operations. Complete the methods in the ConfigurationPrototypeRegistryImpl class.
Run the provided test cases in the ConfigurationPrototypeRegistryTest class to validate the correctness of your prototype pattern implementation. Ensure that configuration objects can be cloned successfully, and that the registry functions as expected.
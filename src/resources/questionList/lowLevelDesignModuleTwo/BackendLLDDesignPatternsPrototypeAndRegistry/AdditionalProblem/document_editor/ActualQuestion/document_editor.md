# Q8. document_editor

## Abstract Factory Pattern for Document Processing
## Problem Statement
You are designing a document processing application. Depending on the type of document (e.g., text, spreadsheet, presentation), different processing routines are required. These routines involve multiple steps, such as parsing, formatting, and exporting, which need to be coordinated to ensure correct document processing. You want to create instances of these processing steps without explicitly specifying their classes and ensure that the steps within the same family are compatible.

## Assignment
Your task is to implement the Abstract Factory pattern to create document processors in the document processing application. The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes, allowing for easy addition of new document processor types and ensuring compatibility within families.

## Task 1 - Adding the factory methods to the abstract factory
The abstract factory class DocumentFactory has been created for you. You will need to add the factory methods to create document parsers, printers and processors to the abstract factory class. The methods to be implemented are:

create_document_parser
create_document_processor
create_document_printer
supports_format
Task 2 - Implementing the Abstract Factory
Now that you have the abstract factory class, you will need to implement the abstract factory for different types of documents such as TextDocument, SpreadsheetDocument, and PresentationDocument. Two classes have been created for you: TextDocumentFactory and SpreadsheetDocumentFactory. You will need to implement the methods to create compatible document parsers, processors, and printers. Ensure that the created components are compatible within the same format family.

## Instructions
Complete the DocumentFactory interface with methods to create document parsers, processors, and printers, and to check if the factory supports a specific document format. Methods to be implemented are:
create_document_parser
create_document_processor
create_document_printer
supports_format
Complete the concrete implementations of the DocumentFactory interface for text, spreadsheet, and presentation document formats. Implement the methods to create compatible document parsers, processors, and printers. The classes to be implemented are:
TextDocumentFactory
SpreadsheetDocumentFactory
Run the provided test cases in the DocumentFactoryTest class to verify the correctness of your implementation. The tests will check if all document components have a common parent class, and if the factory classes can correctly create document parsers, processors, and printers based on the document format.
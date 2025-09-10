# Q7. audio_player

## Abstract Factory Pattern for Audio Players
## Problem Statement
You are designing an audio player application. The application should support different audio formats such as MP3, WAV, and FLAC. Each format requires specific decoding, processing, and rendering steps. You want to create instances of these processing steps without explicitly specifying their classes and ensure that the steps within the same format family are compatible.

## Assignment
Your task is to extend the Abstract Factory pattern to create audio processing components in the audio player application. The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes, allowing for easy addition of new audio format processor types and ensuring compatibility within families.

## Task 1 - Adding the factory methods to the abstract factory
The abstract factory class AudioFactory has been created for you. You will need to add the factory methods to create audio decoders, processors, and players to the abstract factory class. The method supports_format has already been abstracted out for you as an example. The methods to be implemented are:

create_audio_decoder
create_audio_processor
create_audio_player
supports_format
Task 2 - Implementing the Abstract Factory
Now that you have the abstract factory class, you will need to implement the abstract factory for different audio formats such as MP3, WAV, and FLAC. Three classes have been created for you: Mp3AudioFactory, and FlacAudioFactory. You will need to implement the methods to create compatible audio decoders, processors, and renderers. Ensure that the created components are compatible within the same format family.

## Instructions
Complete the AudioFactory interface with methods to create audio decoders, processors, and players, and to check if the factory supports a specific audio format. Methods to be implemented are:
create_audio_decoder
create_audio_processor
create_audio_player
supports_format
Complete the concrete implementations of the AudioFactory interface for MP3, WAV, and FLAC audio formats. Implement the methods to create compatible audio decoders, processors, and renderers. The classes to be implemented are:
Mp3AudioFactory
FlacAudioFactory
Run the provided test cases in the AudioFactoryTest class to verify the correctness of your implementation. The tests will check if all audio components have a common parent class, and if the factory classes can correctly create audio decoders, processors, and renderers based on the audio format.
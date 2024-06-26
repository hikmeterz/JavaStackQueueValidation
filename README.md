﻿# JavaStackQueueValidation
## Project Description
This repository contains Java programs to solve two distinct problems using stack and queue data structures. The first problem checks if HTML tags in a given input are properly closed, and the second problem processes a sequence of numbers to ensure all numbers are above a given threshold.

## Files
- `Node.java`: Defines the node structure used in the queue.
- `QNode.java`: Defines the node structure used in the stack.
- `Queue.java`: Implements the queue structure and its operations.
- `Stack.java`: Implements the stack structure and its operations.
- `Main.java`: Main class to test the HTML tag validation using a stack.
- `Main2.java`: Main class to test the number sequence processing using a queue.

## Algorithm Explanation

### Stack (HTML Tag Validation)
The `Stack` class manages the nodes and provides methods to manipulate the stack:
- `push(QNode node)`: Pushes a node onto the stack.
- `pop()`: Pops a node from the stack.
- `isEmpty()`: Checks if the stack is empty.

### Queue (Number Sequence Processing)
The `Queue` class manages the nodes and provides methods to manipulate the queue:
- `enqueue(Node node)`: Adds a node to the end of the queue.
- `dequeue()`: Removes a node from the front of the queue.
- `isEmpty()`: Checks if the queue is empty.

### Main Class (HTML Tag Validation)
The `Main` class contains the main method to run the HTML tag validation application:
- Reads a single line of HTML code as input.
- Uses a stack to check if each opening tag has a corresponding closing tag in the correct order.
- Outputs "Dogru." if all tags are correctly closed, or "Yanlis" with the error reason if not.

### Main2 Class (Number Sequence Processing)
The `Main2` class contains the main method to run the number sequence processing application:
- Reads a sequence of integers followed by a threshold value as input.
- Uses a queue to process the sequence and ensure all numbers are above the given threshold.
- Outputs the number of steps taken to achieve the condition or an error message if it is not possible.

### Example Workflow for Main (HTML Tag Validation)
1. The user inputs a string: `<html> <head> <title> HTML Page </title> </head> <body> Content </body> </html>`.
2. The program uses a stack to check if all tags are properly closed.
3. Outputs "Dogru." if all tags are correctly closed.

### Example Workflow for Main2 (Number Sequence Processing)
1. The user inputs a string: `1 2 3 9 10 12 | 7`.
2. The program uses a queue to process the sequence.
3. Outputs the number of steps taken and the final sequence or an error message if the condition is not met.

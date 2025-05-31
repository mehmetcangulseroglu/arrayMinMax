# Array Min-Max Finder

A simple Java program that finds the minimum and maximum elements in an array.

## Description

This program allows users to input an array of integers and then determines the smallest and largest values within that array. It demonstrates basic array operations, user input handling, and element comparison in Java.

## Features

- Interactive user input for array size and elements
- Finds minimum element in the array
- Finds maximum element in the array
- Clear console output with results

## How It Works

1. **Input Phase**: 
   - Prompts user to enter the size of the array
   - Requests each array element one by one

2. **Processing Phase**:
   - Initializes both min and max variables with the first array element
   - Iterates through the remaining elements
   - Compares each element with current min and max values
   - Updates min/max accordingly

3. **Output Phase**:
   - Displays the minimum element found
   - Displays the maximum element found

## Usage

1. Compile the program:
   ```bash
   javac Main.java
   ```

2. Run the program:
   ```bash
   java Main
   ```

3. Follow the prompts:
   - Enter the array size
   - Input each element when prompted

## Sample Run

```
enter the size of array :
5
enter the elements of array : 
1. element of array : 
10
2. element of array : 
5
3. element of array : 
20
4. element of array : 
3
5. element of array : 
15
minumum element in array is : 3
maximum element in array is : 20
```

## Algorithm

- **Time Complexity**: O(n) - Single pass through the array
- **Space Complexity**: O(n) - Storage for the input array

## Requirements

- Java Development Kit (JDK) 8 or higher
- Basic understanding of arrays and loops

## Code Structure

- Uses `Scanner` class for user input
- Implements simple linear search algorithm for min/max finding
- Single-pass solution for optimal performance

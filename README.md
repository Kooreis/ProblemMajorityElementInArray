# Question: How do you implement a function to find the majority element in an array? C# Summary

The provided C# code is a console application that finds the majority element in an array. The majority element is defined as an element that appears more than half the time in the array. The application defines a function called `MajorityElement` which takes an array of integers as an argument and returns the majority element if it exists, or `-1` if it doesn't. The function uses a dictionary to keep track of the count of each element in the array. It iterates through the array, incrementing the count of each element in the dictionary. If it encounters an element whose count is greater than half the size of the array, it returns that element as the majority element. If no such element is found after iterating through the entire array, it returns `-1`. The `Main` function, which is the entry point of the application, creates an array of integers and calls the `MajorityElement` function with this array. The result is then printed to the console.

---

# Python Differences

The Python version of the solution is quite similar to the C# version. Both versions use a dictionary (or a hash map) to count the occurrences of each element in the array. They then iterate over the dictionary to find an element that occurs more than `n/2` times, where `n` is the size of the array.

However, there are a few differences due to the language features and syntax:

1. In Python, checking if a key exists in a dictionary is done using the `in` keyword, while in C#, the `ContainsKey` method is used.

2. Python uses `len(arr)` to get the size of the array, while C# uses `nums.Length`.

3. Python uses integer division `//` to calculate the majority count, while C# uses normal division `/`. This is because in Python, normal division always returns a float, while in C#, it returns an integer if both operands are integers.

4. The Python version takes user input for the array, while the C# version has a hardcoded array.

5. The Python version returns `None` if no majority element is found, while the C# version returns `-1`. This is a design choice and could be easily changed in either version.

6. The Python version uses a `main` function and the `if __name__ == "__main__":` idiom to allow or prevent parts of code from being run when the modules are imported. In contrast, the C# version uses a `Main` method as the entry point of the program, which is a standard in C# console applications.

---

# Java Differences

The Java version of the solution is similar to the C# version in terms of logic. Both versions use a dictionary (in C#) or a HashMap (in Java) to count the occurrences of each element in the array. They then check if the count of any element is greater than `n/2` (where `n` is the size of the array). If such an element is found, it is returned as the majority element. If no such element is found, `-1` is returned.

The main differences between the two versions are:

1. User Input: In the C# version, the array is hard-coded into the program, while in the Java version, the user is prompted to input the number of elements and the elements themselves.

2. Dictionary vs HashMap: In C#, a Dictionary is used to store the counts of elements, while in Java, a HashMap is used. These are equivalent data structures in the two languages.

3. ContainsKey Method: Both versions check if a key is present in the dictionary or HashMap before incrementing the count. In C#, this is done using the `ContainsKey` method, while in Java, the `containsKey` method is used.

4. Get Method: When incrementing the count of an element in the HashMap in Java, the `get` method is used to retrieve the current count. In C#, the count can be accessed directly using the indexer (`counts[num]`).

5. Console Output: In C#, the `Console.WriteLine` method is used to print output to the console. In Java, `System.out.println` is used.

---

Here is a simple console application in C# that finds the majority element in an array:

```C#
using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        int[] nums = {2,2,1,1,1,2,2};
        Console.WriteLine(MajorityElement(nums));
    }

    public static int MajorityElement(int[] nums) 
    {
        Dictionary<int, int> counts = new Dictionary<int, int>();
        foreach (int num in nums)
        {
            if (!counts.ContainsKey(num))
            {
                counts[num] = 0;
            }
            counts[num]++;
            if (counts[num] > nums.Length / 2)
            {
                return num;
            }
        }
        return -1;
    }
}
```

This program defines a function `MajorityElement` that takes an array of integers as input and returns the majority element. The majority element is the element that appears more than `n/2` times where `n` is the size of the array. If no such element exists, the function returns `-1`.

The function uses a dictionary to count the occurrences of each element in the array. It then checks if the count of any element is greater than `n/2`. If it finds such an element, it returns it. If it doesn't find any such element after checking all elements, it returns `-1`.

The `Main` function is the entry point of the program. It defines an array of integers and calls the `MajorityElement` function with this array as argument. It then prints the returned majority element to the console.
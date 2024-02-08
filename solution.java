Here is a Java console application that solves the problem:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int majorityElement = findMajority(array);
        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("There is no majority element in the array.");
        }
    }

    public static int findMajority(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
            } else {
                countMap.put(num, countMap.get(num) + 1);
            }
            if (countMap.get(num) > array.length / 2) {
                return num;
            }
        }
        return -1;
    }
}
```

This console application first asks the user to input the number of elements in the array and then the elements of the array. It then calls the `findMajority` function to find the majority element in the array. The `findMajority` function uses a HashMap to count the occurrences of each element in the array. If it finds an element that occurs more than `n/2` times (where `n` is the number of elements in the array), it returns that element. If no such element is found, it returns `-1`.
Here is a Python console application that solves the problem:

```python
def find_majority(arr):
    count_dict = {}
    for num in arr:
        if num in count_dict:
            count_dict[num] += 1
        else:
            count_dict[num] = 1

    majority_count = len(arr) // 2
    for num, count in count_dict.items():
        if count > majority_count:
            return num
    return None

def main():
    arr = [int(x) for x in input("Enter numbers separated by space: ").split()]
    majority = find_majority(arr)
    if majority is not None:
        print("Majority element is: ", majority)
    else:
        print("No majority element found.")

if __name__ == "__main__":
    main()
```

This console application first asks the user to input a list of numbers separated by spaces. It then calls the `find_majority` function to find the majority element in the list. The `find_majority` function works by counting the occurrences of each number in the list and then checking if any number occurs more than half the length of the list. If such a number is found, it is returned as the majority element. If no such number is found, the function returns `None`.
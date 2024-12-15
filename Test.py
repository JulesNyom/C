import random

def BinarySearch(arr, target):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2

        if arr[mid] == target:
            return mid
        
        elif arr[mid] < target:
            left = mid + 1

        else : right = mid - 1

    return -1

Sorted_array = [10, 55, 89954, 365, 484, 9455, 99, 95, 655, 559, 655, 587, 440]
target = 55

print(BinarySearch(Sorted_array, target))
        



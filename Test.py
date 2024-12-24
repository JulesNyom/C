def binarysearch(array, target):
    left = 0
    right = len(array) - 1

    while left <= right:
        mid = (left + right) // 2
        if target == array[mid]:
            return mid
        elif target < array[mid]:
            right = mid - 1
        else: left = mid + 1 
    return -1

    # Create a sorted array with 20 integers

sorted_array = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
print(binarysearch(sorted_array, 11))

def merge(left, right):
    result = []
    i, j = 0, 0 

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i+=1
        else: 
            result.append(right[j])
            j+=1
    result+=left[i:]
    result+=right[j:]
    return result

def mergesort(list):
    if len(list) < 2:
        return list
    mid = len(list) // 2 
    left = mergesort(list[:mid])
    right = mergesort(list[mid:])
    return merge(left, right)

# Create an array with 10 unsorted integers
unsorted_array = [42, 17, 8, 93, 25, 61, 3, 79, 50, 12]
print(mergesort(unsorted_array))

def linearsearch(array, target):
    for i in range(len(array)):
        if target == array[i]:
            return i 
    return -1 
    
print(linearsearch(unsorted_array, 17))
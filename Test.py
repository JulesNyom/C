def merge(left, right):
    result = []
    i, j = 0, 0

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i+=1
        else : 
            result.append(right[j])
            j+=1

    result += left[i:]
    result += right[j:]
    return result

def mergesort(list):
    if len(list) < 2:
        return list
    mid = len(list) // 2
    left = mergesort(list[:mid])
    right = mergesort(list[mid:])
    return merge(left, right)

unsorted_array = [34, 7, 23, 32, 5, 62, 78, 1, 13, 9]

sortedarray = (mergesort(unsorted_array))

def binarysearch(array, target):
    left = 0
    right = len(array) -1 

    while left < right:
        mid = (left + right) // 2
        if target == array[mid]:
            return mid
        elif target <= array[mid]:
            right = mid -1
        else : left = mid + 1
    return -1 

print(binarysearch(sortedarray, 34))

def linearsearch(array, target):
    for i in range(len(array)):
        if target == array[i]:
            return i
    return -1

print(linearsearch(unsorted_array, 34))
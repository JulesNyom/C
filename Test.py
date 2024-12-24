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


unsorted_array = [42, 17, 89, 3, 56, 11, 72, 30, 95, 8]
print(mergesort(unsorted_array))

def binarysearch(array, target):
    left = 0
    right = len(array) - 1
    
    while left <= right:
        mid = (left + right) // 2
        if target == array[mid]:
            return mid
        elif target <= array[mid]:
            right = mid - 1
        else: left = mid + 1
    return -1

sorted_array = [2, 7, 13, 19, 24, 31, 38, 45, 52, 60]

print(binarysearch(sorted_array, 60))

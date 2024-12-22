def merge(left, right):
    result= []
    i, j = 0, 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
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

arr = [5, 2, 8, 3, 1, 6, 4, 7, 9, 0]
sortedarray = mergesort(arr)

def binarysearch(array, target):
    left = 0
    right = len(array) - 1

    while left < right: 
        mid = (left + right) // 2 
        if target == array[mid]:
            return mid
        elif target <= array[mid]: 
            right = mid - 1 
        else : left = mid + 1
    return - 1 

arr2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(binarysearch(arr2, 3))

def linearsearch(arr, target):
    for i in range(len(arr)):
        if target == arr[i]:
            return i
    return -1

print(linearsearch(arr2, 8))
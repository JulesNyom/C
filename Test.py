def binarysearch(arr, target):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2
        if target == arr[mid]:
            return mid
        elif target <= arr[mid]:
            right = mid - 1
        else : left = mid + 1
    return -1

array = [1, 2, 3]
print(binarysearch(array, 3))

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

arr2 = [7, 2, 9, 1, 5, 8, 3, 6, 4, 10]
print(mergesort(arr2))
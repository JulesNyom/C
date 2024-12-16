def binarysearch (arr, target):
    left = 0
    right = len(arr) - 1

    while (left <= right):
        mid = (left + right) // 2 

        if target == arr[mid]:
            return mid
        
        elif target < arr[mid]:
            right = mid - 1

        else: left = mid + 1 

array = [ 20, 8392, 2300, 1398, 38832, 20939, 339938, 287338]
array.sort()
print(array)
newtarget = 339938

print(binarysearch(array, newtarget))
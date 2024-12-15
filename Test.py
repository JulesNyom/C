def binarysearch (arr, target):
    left = 0
    right = len(arr) -1

    while (left <= right):
        mid = (left + right) // 2

        if target == arr[mid]:
            return mid
        
        elif target > arr[mid]:
            left = mid + 1

        else: right = mid - 1

    return -1 

Array = [12, 98, 87, 32, 455, 265, 78, 3565, 656]
target = 98

print(binarysearch(Array, target))

    
        



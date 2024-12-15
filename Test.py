def binarysearch (array, target):
    left = 0
    right = len(array) - 1 

    while (left <= right):
        mid = (left + right) // 2 

        if target == array[mid]:
            return mid
        
        elif target < array[mid]:
            right = mid - 1

        else : left = mid + 1

    return -1 


Array = [12, 98, 87, 32, 455, 265, 78, 3565, 656]
Array.sort()
print(Array)
target = 656

print(binarysearch(Array, target))

    
        



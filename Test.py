def binarysearch (array, target):
    left = 0
    right = len(array) - 1

    while (left <= right):
        mid = (left + right) // 2

        if target == array[mid]:
            return mid
        
        elif target < array[mid]:
            right = mid - 1

        else: left = mid + 1

    return -1

array = [ 20, 8392, 2300, 1398, 38832, 20939, 339938, 287338]
array.sort()
print(array)
newtarget = 38832

print(binarysearch(array, newtarget))
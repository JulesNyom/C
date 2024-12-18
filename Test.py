array = [33, 89, 56, 30, 23782, 374, 44, 3763, 44, 8733, 29, 737]

def binarysearch(array, target):
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

def linearsearch(array, target):
    for i in range(len(array)):
        if target == array[i]:
            return i
    return -1




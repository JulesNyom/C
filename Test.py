def binary (target, array) :
    left = 0
    right = len(array) -1

    while left <= right :
        mid = (left + right) // 2
        if target == array[mid]:
            return mid
        elif target < array[mid]:
            right = mid -1
        else : left = mid + 1
    return -1
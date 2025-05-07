def binary(target, array):
    left = 0
    right = len(array) -1

    while left <= right :
        mid = (left + right) // 2
        if target == array[mid]:
            return mid
        elif target < array[mid]:
            right = mid -1
        else : 
            left = mid + 1
    return -1

sorted_array = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]

print(binary(38, sorted_array))
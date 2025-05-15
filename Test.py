sorted_array = [1,2,3,4,5,6,7,8,9,10,11]
unsorted_array = [22, 46, 3, 1, 9, 19]

def binarysearch (target, array):
    left = 0
    right = len(array)

    while left <= right:
        mid = (left + right) // 2

        if target == array[mid]:
            return mid
        elif target < array[mid]:
            right = mid -1
        else: left = mid + 1
    return -1


def merge (left, right):
    result = []
    i,j = 0,0

    while i < len(left) and j < len(right) :
        if left[i] <= right[j]:
            result.append(left[i])
            i+=1
        else : 
            result.append(right[j])
            j+=1
    result += left[i:]
    result += right[j:]
    return result 

def mergeSort (list):
    if len(list) < 2:
        return list
    mid = len(list) // 2
    left = mergeSort(list[:mid])
    right = mergeSort(list[mid:])
    return merge(left, right)

print(mergeSort(unsorted_array))
print(binarysearch(3, sorted_array))


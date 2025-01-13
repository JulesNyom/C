def merge(left, right):
    result = []
    i, j = 0,0

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

unsorted = [4, 2, 9, 6, 23, 12, 34, 0, 1, 8]
print(mergesort(unsorted))
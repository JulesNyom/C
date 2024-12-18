def binary_search(arr, target):
    left = 0
    right = len(arr) - 1
    
    while left <= right:
        mid = (left + right) // 2
        
        # If target is found at mid, return its index
        if arr[mid] == target:
            return mid
        
        # If target is greater, ignore left half
        elif arr[mid] < target:
            left = mid + 1
            
        # If target is smaller, ignore right half
        else:
            right = mid - 1
            
    # If we reach here, target was not present
    return -1

# Sample data
sorted_array = [2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91]

# Example searches
target1 = 23
target2 = 31

result1 = binary_search(sorted_array, target1)
result2 = binary_search(sorted_array, target2)

print(f"Finding {target1}: Found at index {result1}")
print(f"Finding {target2}: {result2} (not found)")

def linear_search(arr, target):

    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1


def merge(left, right):
    result = []
    i, j = 0, 0
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    result += left[i:]
    result += right[j:]
    return result

def mergesort(list):
    if len(list) < 2:
        return list
    middle = len(list) // 2  # Changed from / to //
    left = mergesort(list[:middle])
    right = mergesort(list[middle:])
    return merge(left, right)
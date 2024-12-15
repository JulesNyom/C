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
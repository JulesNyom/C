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


def merge_sort(arr):
    # Base case: if array has 1 or fewer elements, it's already sorted
    if len(arr) <= 1:
        return arr
    
    # Find the middle point to divide the array into two halves
    mid = len(arr) // 2
    
    # Split array into two halves
    left = arr[:mid]
    right = arr[mid:]
    
    # Recursively sort each half
    left = merge_sort(left)
    right = merge_sort(right)
    
    # Merge the sorted halves
    return merge(left, right)

def merge(left, right):
    result = []
    left_idx = right_idx = 0
    
    # Compare elements from both arrays and merge them in sorted order
    while left_idx < len(left) and right_idx < len(right):
        if left[left_idx] <= right[right_idx]:
            result.append(left[left_idx])
            left_idx += 1
        else:
            result.append(right[right_idx])
            right_idx += 1
    
    # Add remaining elements from left array, if any
    result.extend(left[left_idx:])
    
    # Add remaining elements from right array, if any
    result.extend(right[right_idx:])
    
    return result

# Example usage
if __name__ == "__main__":
    # Test the algorithm
    arr = [64, 34, 25, 12, 22, 11, 90]
    sorted_arr = merge_sort(arr)
    print(f"Original array: {arr}")
    print(f"Sorted array: {sorted_arr}")
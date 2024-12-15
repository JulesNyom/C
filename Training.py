def binary_search(arr, target):
    left = 0
    right = len(arr) - 1
    
    while left <= right:
        mid = (left + right) // 2
        
        # If target is found at mid, return its index
        if arr[mid] == target:
            return mid
        
        # If target is greater, search in right half
        elif arr[mid] < target:
            left = mid + 1
            
        # If target is smaller, search in left half
        else:
            right = mid - 1
            
    # Target not found in array
    return -1
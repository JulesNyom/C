def binary(target, array):
    left = 0
    right = len(array) -1

    while (left < right):
        mid = (left + right) // 2
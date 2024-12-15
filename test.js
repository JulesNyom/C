function binarySearch(arr, target) {
    let left = 0;
    let right = arr.length - 1;

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);

        if (arr[mid] === target) {
            return mid;  // Return when target is found
        }

        if (target < arr[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;  // Return -1 if target is not found
}

// Define and sort the array
let Array = [10, 48989, 484, 154, 366589, 89663, 45, 654949, 65965, 9898, 958985, 589, 1333];
Array.sort((a, b) => a - b);  // Numeric sort
console.log("Sorted array:", Array);

let Targ = 45;
console.log("Target found at index:", binarySearch(Array, Targ));
<?php

echo "I love pasta" . "<br>";

function binarySearch($target, $array) {
    $left = 0;
    $right = count($array) - 1;

    while ($left <= $right) {
        $mid = intdiv($left + $right, 2); // Use intdiv for integer division

        if ($target == $array[$mid]) {
            return $mid; // Return the index if the target is found
        } elseif ($target < $array[$mid]) {
            $right = $mid - 1;
        } else {
            $left = $mid + 1;
        }
    }
    return -1; // Return -1 if the target is not found
}

$sortedArray = [1, 2, 3, 4, 5, 6, 7];

echo binarySearch(2, $sortedArray); // Output: 1
?>

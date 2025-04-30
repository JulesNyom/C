<?php 

$name = "blob"; // string
$age = 22; // int
$bool = true; // bool
$favorite_food = ["pasta", 12, "salmon", true  ]; // array-tuple

echo "Hello "." $name <br>";
echo "im "." $age"."<br>";
echo gettype( $age) ."<br>";
echo gettype( $bool ) ."<br>";
print_r($name);
$name= 12;
print_r($name);
$fruits = ["pinapple", "orange", "apple"];
$fruits[2] = "tomato";
echo "<br>";
echo $fruits[0];

for ($i=0; $i<10; $i++) {

}
$i=3;
foreach ($fruits as $fruit ) {
    echo "$fruit";
}

function multiply($a, $b) {
    return $a*$b;
}
echo "<br>";
$result = multiply(5,12);
print_r($result);

function myfunction($name) {
    echo "Hello $name";
}
echo "<br>";
print_r(myfunction("Jules"));







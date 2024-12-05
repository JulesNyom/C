#include <stdio.h>
int main ()
{
  const double PI = 3.14159;
  double radius;
  double circumference;
  printf("\nEnter radius of a circle : ");
  scanf("%lf", &radius);
  circumference = 2*PI*radius;
  printf("circumference : %lf", circumference);
  return 0;
} 
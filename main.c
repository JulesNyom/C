#include <stdio.h>
int main ()
{
  const double PI = 3.14159;
  float radius;
  double circumference;
  printf("\nEnter radius of a circle : ");
  scanf("%f", &radius);
  circumference = 2*PI*radius;
  printf("circumference : %f", circumference);
  return 0;
} 
#include <stdio.h>
#include <ctype.h>
#include <string.h>

double Hello(float heigth, float width)
{
  printf("Enter your height here: ");
  scanf("%f/n", &heigth);
  printf("Enter your width here: ");
  scanf("%f/n", &width);
  return heigth + width;
}

int main(void) 
{
    double result = Hello(3,4);
    printf("%f\n", result);
    return 0;
}
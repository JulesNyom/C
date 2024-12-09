#include <stdio.h>
#include <ctype.h>
#include <string.h>

double math (double number, double numbertwo) {
  
  printf("Enter a number: ");
  scanf("%lf", &number);

  printf("Enter a second number: ");
  scanf("%lf", &numbertwo);

  double result = number + numbertwo;

  printf("%lf", result);

  return 0;
}

int main(void) {

    math(200, 300);

    return 0;
}
#include <stdio.h>
#include <ctype.h>
#include <string.h>

double calculator (double a , double b)
{ 
  char operator;
  double a;
  double b;

  scanf("%s\n", &operator);
  printf("%s\n", "Enter an operator" );
  scanf("%f\n", &a);
  printf("%s\n", "Enter your first number");
  scanf("%f\n", &b);
  printf("%s\n", "Enter your second number");

  if (operator = "+") {
    double result = a + b;
    printf("%f/n", result);
  }

  else if (operator = "-") {
    double result = a - b;
    printf("%f/n", result);
  }

  else if (operator = "/") {
    double result = a / b;
    printf("%f/n", result);
  }

  else (operator = "x") {
    double result = a * b;
    printf("%f/n", result);
  }

}

int main(void) 
{
    
    return 0;
}
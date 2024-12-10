#include <stdio.h>
#include <ctype.h>
#include <string.h>

double math(double number, double numbertwo) {
    return number + numbertwo;  // Actually use the parameters
}

int main(void) {
    double num1, num2;
    
    printf("Enter a number: ");
    scanf("%lf", &num1);
    
    printf("Enter a second number: ");
    scanf("%lf", &num2);
    
    double result = math(num1, num2);
    
    return 0;
}
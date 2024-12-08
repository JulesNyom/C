#include <stdio.h>
#include <ctype.h>
#include <string.h>

void calculator() { 
    char operator;
    float a;
    float b;

    printf("Enter an operator (+, -, /, x): ");
    scanf(" %c", &operator);  // notice the space before %c to skip whitespace

    printf("Enter your first number: ");
    scanf("%f", &a);

    printf("Enter your second number: ");
    scanf("%f", &b);

    if (operator == '+') {
        double result = a + b;
        printf("%.2f\n", result);
    }
    else if (operator == '-') {
        double result = a - b;
        printf("%.2f\n", result);
    }
    else if (operator == '/') {
        if (b != 0) {
            double result = a / b;
            printf("%.2f\n", result);
        } else {
            printf("Error: Cannot divide by zero\n");
        }
    }
    else if (operator == 'x' || operator == '*') {
        double result = a * b;
        printf("%.2f\n", result);
    }
    else {
        printf("Error: Invalid operator\n");
    }
}

int main(void) {
    calculator();
    return 0;
}
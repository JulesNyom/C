#include <stdio.h>
#include <ctype.h>
#include <string.h>

void Hello(void)  // Added void parameter for better practice
{
    char tomate[10];
    printf("Enter a tomate type: ");  // Added colon and space for better UX
    scanf("%9s", tomate);  // Fixed three issues here
    
    if (strlen(tomate) >= 10) {  // Fixed brace placement
        printf("Your tomate is too long\n");
    }
    else {  // Removed incorrect condition and fixed syntax
        printf("Good choice\n");
    }
}

int main(void)  // Added void parameter
{
    Hello();
    return 0;
}
#include <stdio.h>
#include <ctype.h>

int main ()
{
char unit;
float temp;

unit = toupper(unit);

printf("\nIs the temperature in (F) or (C)?: ");
scanf("%c", &unit);

if (unit == 'C') {
  printf("The temperature is currently in C");
}
else if (unit == 'F')
{
  printf("The temperature is currently in F ");
}
else {
printf("\n %c is not a valid measurement", unit);
}

  return 0;
} 
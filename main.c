#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(void) {

  char name[100];
  char favoriteFood[100];

  printf("Whats your name ?: ");
  scanf("%s", name);
  printf("Whats your favorite food ?: ");
  scanf("%s", favoriteFood);

  printf("Hello my name is %s and i love %s", name, favoriteFood);

    return 0;
}
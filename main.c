#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(void) {

  typedef struct {
       char letter;
       int number;
   } LetterNumber;

   LetterNumber letterNumberMap[] = {
       {'a', 1}, {'b', 2}, {'c', 3}, {'d', 4}, {'e', 5},
       {'f', 6}, {'g', 7}, {'h', 8}, {'i', 9}, {'j', 10},
       {'k', 11}, {'l', 12}, {'m', 13}, {'n', 14}, {'o', 15},
       {'p', 16}, {'q', 17}, {'r', 18}, {'s', 19}, {'t', 20},
       {'u', 21}, {'v', 22}, {'w', 23}, {'x', 24}, {'y', 25},
       {'z', 26}
   };

  char choosenLetter;
   
    printf("Please choose a number and we will find the corresponding letter: ");
    scanf("%c", &choosenLetter);

    int found = 0;  // To track if we found the letter
for(int i = 0; i < sizeof(LetterNumber) / sizeof(letterNumberMap[0]); i++ ) {
    if (choosenLetter == letterNumberMap[i].letter) {
        printf("The corresponding number of your letter is %d", letterNumberMap[i].number);
        found = 1;
        break;  // Exit loop after finding the match
    }
}
if (!found) {
    printf("Letter not found!");
}

    return 0;
}  
#include <stdio.h>
#include <ctype.h>
#include <string.h>

typedef struct {
    char letter;
    int number;
} LetterNumber;

#define ARRAY_SIZE(arr) (sizeof(arr) / sizeof((arr)[0]))

int findLetterNumber(char choosenLetter, LetterNumber *letterNumberMap, size_t mapSize) {
    choosenLetter = tolower(choosenLetter);
    for (size_t i = 0; i < mapSize; i++) {
        if (choosenLetter == letterNumberMap[i].letter) {
            return letterNumberMap[i].number;
        }
    }
    return -1;  // Indicate not found
}

int main(void) {
    LetterNumber letterNumberMap[] = {
        {'a', 1}, {'b', 2}, {'c', 3}, {'d', 4}, {'e', 5},
        {'f', 6}, {'g', 7}, {'h', 8}, {'i', 9}, {'j', 10},
        {'k', 11}, {'l', 12}, {'m', 13}, {'n', 14}, {'o', 15},
        {'p', 16}, {'q', 17}, {'r', 18}, {'s', 19}, {'t', 20},
        {'u', 21}, {'v', 22}, {'w', 23}, {'x', 24}, {'y', 25},
        {'z', 26}
    };

    char choosenLetter;
    printf("Please choose a letter and we will find the corresponding number: ");
    scanf(" %c", &choosenLetter);

    int number = findLetterNumber(choosenLetter, letterNumberMap, ARRAY_SIZE(letterNumberMap));
    if (number != -1) {
        printf("The corresponding number of your letter is %d\n", number);
    } else {
        printf("Letter not found!\n");
    }

    return 0;
}

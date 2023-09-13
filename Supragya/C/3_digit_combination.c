// Day49_Q1.c
// We have to print all the possible combinations of 3 digits without repetition.
#include <stdio.h>
int main() {
    printf("Enter 3 digits: ");
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    int arr[] = {a, b, c};
    int temp[6];
    int l = 0;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (i != j && j != k && k != i) {
                    int num = arr[i] * 100 + arr[j] * 10 + arr[k];
                    temp[l] = num;
                    l++;
                }
            }
        }
    }

    int flag = 0;
    for (int i = 0; i < 6; i++) {
        for (int j = i + 1; j < 6; j++) {
            if (temp[i] == temp[j]) {
                flag = 1;
            }
        }
        if (flag == 0) {
            printf("%d\n", temp[i]);
        }
        flag = 0;
    }

    return 0;
}

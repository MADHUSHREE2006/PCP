#include <stdio.h>

void greedy(int coins[], int l, int a) {
    for (int i = 0; i < l; i++) {
        while (a >= coins[i]) { 
            a -= coins[i];
            printf("%d ", coins[i]);
        }
    }
}

int main() {
    int a, l;
    int coins[] = {500, 200, 100, 50, 25, 10, 5, 2, 1}; 
    printf("Enter Amount: ");
    scanf("%d", &a);
    l = sizeof(coins) / sizeof(coins[0]); 
    greedy(coins, l, a); 
    return 0;
}

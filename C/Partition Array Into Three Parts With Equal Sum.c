#include <stdio.h>
#include <stdbool.h>

bool canThreePartsEqualSum(int* arr, int arrSize) {
    int sum =0;
    for(int i = 0; i < arrSize; i++) {
        sum += arr[i];
    }
    if(sum % 3 != 0){
        return false;
    }
    int target = sum / 3;
    int count = 0,a=0;
    for(int i = 0;i < arrSize; i++){
        a += arr[i];
        if(a == target){
            count++;
            a=0;
        }

    }
    if(count >=3){
        return true;
    }
    else{
        return false;
    }
}

int main() {
    int arr[] = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
    int arrSize = sizeof(arr) / sizeof(arr[0]);

    bool result = canThreePartsEqualSum(arr, arrSize);

    if(result) {
        printf("The array can be partitioned into three parts with equal sum.\n");
    } else {
        printf("The array cannot be partitioned into three parts with equal sum.\n");
    }

    return 0;
}

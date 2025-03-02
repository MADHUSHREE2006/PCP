#include <stdio.h>
#include <stdlib.h>

int compare(const void* a, const void* b){
    return (*(int *)a - *(int *)b);
}

void func(int num[], int k, int l)
{
    int sum = 0;
    if(k%2 != 0){
        qsort(num, l, sizeof(int), compare);
        for(int i =0; i<k && i<l; i++){
            if(num[i]<0){
                num[i] = (-1)*num[i];
            }
            else{
                num[i] = (-1)*num[i];
                k--;
            }
        }
    }
    for(int i =0; i<l; i++){
            sum += num[i]; 
    }
    printf("%d\n", sum);
}

int main() {
    int num1[] = {2, 3, -1, 5, 4};
    int k =2;
    int l1 = sizeof(num1)/sizeof(num1[0]);
    func(num1, k, l1);
    
    int num2[] = {4, 2, 3};
    int k1 =1;
    int l2 = sizeof(num2)/sizeof(num2[0]);
    func(num2, k1, l2);
    
    int num3[] = {3, -1, 0, 2};
    int k2 =3;
    int l3 = sizeof(num3)/sizeof(num3[0]);
    func(num3, k2, l3);

    return 0;
}

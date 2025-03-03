#include <stdio.h>
void activity(int begin[], int end[], int count){
    printf("Selected activities: \n");
    printf("Activity 1(Start: %d, End: %d)\n",begin[0], end[0]);
    int lastEndTime = end[0];
    
    for(int i = 1; i<count; i++){
        if(begin[i] >= lastEndTime){
            printf("Activity %d (Start: %d, End: %d)\n", i + 1 ,begin[i],end[i]);
            lastEndTime = end[i];
        }
    }
}
int main(){
    int st[] = {1, 3, 0, 5, 3, 5, 6};
    int et[] = {4, 5, 6, 7, 8, 9,10};
    int num_activity = sizeof(st)/ sizeof(st[0]);
    activity(st, et, num_activity);
    return 0;
}

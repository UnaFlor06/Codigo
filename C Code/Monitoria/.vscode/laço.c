#include<stdio.h>
int main(void){
    int n1 = 10;
    int n2 = 5;
    printf("%d\n", n1);
    printf("%d\n", n2);

    for(int i = 0; i <= 3; i++){
        
        int n3 = n1 + n2;
        printf("%d\n", n3);
        int n4 = n3 - n2;
        printf("%d\n", n4);
        n1 = n3;
        n2 = n4;
        

    }

    return 0;
}
#include<stdio.h>
#include <conio.h>
#include <string.h>

int main(){
      int a;
     int b;
     int c;
     

    printf(" enter the value of a");
     scanf("%d", &a);
      printf(" enter the value of b");
     scanf("%d", &b);

     printf(" eneter the value of c");
    scanf("%d",&c);
    // int arr[]= {a,b,c};

    // for (size_t i = 0; i < arr.l ; i++)
    // {
    //     /* code */
    // }
    
    

     if (a>b & a>c){
        printf("the value of a %d is greater than b %d and c %d" ,a ,b,c);
     }
     else if( b>a & b>c){
        printf("the value of b %d is greater than a %d and c %d" ,b,a,c);
     }

      else if( c>a & c>b){
        printf("the value of c %d is greater than b %d and a %d" ,c,b,a);
     }

     
     
     
    return 0;
}
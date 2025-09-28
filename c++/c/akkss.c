#include <stdio.h>

int main(){
int a;
int b;
//swap a and b without 3rd/temp variable 

printf("enter the value of a: ");
scanf("%d",&a);
printf("enter the value of b: ");
scanf("%d",&b);
a=a+b;
b=a-b;
a=a-b;



printf("the new value of a:%d ",a);
printf("the new value of b:%d ",b);
return 0;

}
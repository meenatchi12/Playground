#include<stdio.h>
#include<stdlib.h>
int main()
{
float r,a;
scanf("%f%f",&r,&a);
r=(float)(2*3.14*r)*(a/360);
printf("%0.2f",r);
return 0;
}
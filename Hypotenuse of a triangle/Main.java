#include<stdio.h>
#include<math.h>
int main()
{
  float h,o,a;
  scanf("%f%f",&o,&a);
  h=sqrt((o*o)+(a*a));
  printf("%0.2f",h);
  return 0;
}
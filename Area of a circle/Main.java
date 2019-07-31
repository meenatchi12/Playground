#include<stdio.h>
int main()
{
  int dia;
  float r,t;
  scanf("%d",&dia);
  r=(float)dia/2;
  t=3.14*r*r;
  printf("%0.2f",t);
  return 0;
}
#include<stdio.h>
int main()
{

float r,theta,l;
scanf("%f%f",&r,&theta) ;
l=2*3.14*r*(theta/360);
printf("%.2f",l);
return 0;
}
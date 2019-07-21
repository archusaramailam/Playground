#include<stdio.h>
int main()
{
int i,n;
unsigned long long int fact=1;
scanf("%d",&n);
if(n>0)
{
for(i=1;i<=n;i++)
{
fact=fact*i;
}
}
printf("%llu", fact);
return 0;
}


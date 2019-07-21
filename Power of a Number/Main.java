#include <stdio.h>
int main()

{
int base,exponent;
long long int result;
scanf("%d%d",&base,&exponent);
if(exponent>=0)
{
result=pow(base,exponent);
printf("%lld",result);
}
else
{
printf("Wrong input");
}
      
    return 0;
}

#include<stdio.h>
int main()
{
 int num1=365,num2=4,quot,rem;
  scanf("%d",&num1);
  scanf("%d",&num2);
  quot = num1/num2;
  rem = num1%num2;
  printf("Quotient: %d\n",quot);
  printf("Remainder: %d",rem);
  return 0;
}

#include <stdio.h>
int main() {
	int num,sum=0,f,l;
  scanf("%d",&num);
  l = num%10;
  f = num;
  while(num >= 10)
  {
    num = num/10;
  }
  f = num;
  sum = f+l;
  printf("%d",sum);
	return 0;
}
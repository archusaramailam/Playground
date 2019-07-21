#include <stdio.h>
int main() {
	int i,j,n;
  scanf("%d",&n);
  for(j=1,i=1;j<=n;i+=2,j++)
  {
    printf("%d\n",i);
  }
	return 0;
}
// number loop pattern
/*4 4 4 4 4 4 4
  4 3 3 3 3 3 4
  4 3 2 2 2 3 4
  4 3 2 1 2 3 4
  4 3 2 2 2 3 4
  4 3 3 3 3 3 4
  4 4 4 4 4 4 4*/
#include <stdio.h>
int main() 
{
    int n,k=1;
    scanf("%d", &n);
  	for(int i=1;i<=2*n-1;i++){
          for (int j=1;j<=2*n-1;j++){
            for(int k=1;k<=n;k++){
                  if(j==k||i==k||j==2*n-k||i==2*n-k){
              printf("%d ",n-k+1);
              break;
              }
            }
          }
          printf("\n");
      }
    return 0;
  	}


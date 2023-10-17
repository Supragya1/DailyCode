// Day83_Q2.c
// Small Triangles, Large Triangles Hackerrank
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;
typedef struct area{
    double p;
    double area;
}area;
void sort_by_area(triangle* tr, int n) {
    area *ar=malloc(n*sizeof(area));
    for(int i=0;i<n;i++){
        ar[i].p=(tr[i].a+tr[i].b+tr[i].c)/2.0f;
        ar[i].area= sqrt(ar[i].p*(ar[i].p-tr[i].a)*(ar[i].p-tr[i].b)*(ar[i].p-tr[i].c));
    }
double temp;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++)
        if(ar[j].area>ar[j+1].area){
           temp= ar[j].area;
           ar[j].area=ar[j+1].area;
           ar[j+1].area=temp;
           
           triangle tempTriangle=tr[j];
           tr[j]=tr[j+1];
           tr[j+1]=tempTriangle;
        }
    }
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}
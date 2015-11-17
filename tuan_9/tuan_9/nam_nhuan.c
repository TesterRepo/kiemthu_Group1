#include "stdio.h"
#include "math.h"
#include "conio.h"
int main()
{
    int n;
   printf("Nhap vao nam bat ky ");
   scanf("%d",&n);
    if(((n%4==0)&&(n%100!=0))||(n%400==0))
        printf(" Nam da nhap la nam nhuan ");
    else
        printf(" Khong phai la nam nhuan ");
    getch();
    return 0;
}

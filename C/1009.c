#include <stdio.h>
 
int main() {
    char name[15];
    double salary, bonus, finalsalary;
    gets(name);
    scanf("%lf %lf", &salary, &bonus);
    finalsalary = salary+(bonus*0.15);
    printf("TOTAL = R$ %.2lf\n", finalsalary); 
    return 0;
}
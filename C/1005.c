#include <stdio.h>
 
int main() {
    double num1, num2;
    scanf("%lf %lf", &num1, &num2);
    printf("MEDIA = %.5lf\n", ((3.5*num1)+(7.5*num2))/11.0);
    return 0;
}
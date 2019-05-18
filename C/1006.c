#include <stdio.h>
 
int main() {
    double num1, num2, num3, resultado;
    scanf("%lf %lf %lf", &num1, &num2, &num3);
    resultado = ((num1*2)+(num2*3)+(num3*5))/10.0;
    printf("MEDIA = %.1lf\n", resultado); 
    return 0;
}
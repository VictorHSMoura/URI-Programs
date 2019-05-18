#include <stdio.h>
 
int main() {
    int num1, num2, num3, num4, resultado;
    scanf("%d %d %d %d", &num1, &num2, &num3, &num4);
    resultado = (num1*num2)-(num3*num4);
    printf("DIFERENCA = %d\n", resultado);
    return 0;
}
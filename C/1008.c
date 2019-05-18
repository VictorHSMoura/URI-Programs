#include <stdio.h>
 
int main() {
    int numero, horas;
    float valorhoras, salario;
    scanf("%d %d %f", &numero, &horas, &valorhoras);
    salario = ((float)horas*valorhoras);
    printf("NUMBER = %d\nSALARY = U$ %.2f\n", numero, salario); 
    return 0;
}
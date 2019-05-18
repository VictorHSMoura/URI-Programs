#include <stdio.h>
 
int main() {
    int i, codigo, numero;
    float valor, soma = 0.0;
    for(i = 0; i < 2; i++) {
        scanf("%d %d %f", &codigo, &numero, &valor);
        soma = soma+((float)numero*valor);
    }
    printf("VALOR A PAGAR: R$ %.2f\n", soma);
    return 0;
}
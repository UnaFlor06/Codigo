#include<stdio.h>
#include<stdlib.h>
int at1(){
int next;
int numero1;
printf("Digite um número, veremos se ele é par ou não:\n");
scanf("%d", &numero1);

    if(numero1 %2 == 0){
    printf("O número é par\n");
    }
    else{
    printf("O número não é par\n");
    }

printf("Por favor, pressione 'enter' ou 'return' para voltar ao menu:\n");
scanf("%d", &next);

    switch(next){
    case'\n':
    system("clear");
    break;
    }
}
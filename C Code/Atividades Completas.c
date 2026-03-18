#include"Atividade 1.h"
#include<stdlib.h>

int main(){
int tarefa = 1;
int atividade = 0;
int print = 1;
int tecla;

    while(tarefa == 1){

    if(print == 1 && atividade == 0){
        printf("Digite um número de 0 a 10 para selecionar as tarefas:\n");
        scanf("%d", &atividade);
        print = 0;
        

        switch(atividade){
        case 1:
        system("clear");
        at1();
        atividade = 0;
        print = 1;
        break; 
        }   
    } 
return 0;  
}
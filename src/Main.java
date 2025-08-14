/*
Desafio - Conta Bancária Virtual

Objetivo:
Criar um programa que simula uma conta bancária, exibindo dados iniciais do cliente
(nome, tipo de conta e saldo inicial) e oferecendo um menu com 4 opções:

***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:




Regras:
- Ao consultar saldo, mostrar o saldo atual.
- Ao receber valor, somar ao saldo e mostrar o saldo atualizado.
- Ao transferir valor, verificar se há saldo suficiente antes de subtrair.
  Caso não haja saldo suficiente, exibir mensagem de erro.
- Ao digitar uma opção inválida, mostrar mensagem "Opção inválida".
- O programa encerra ao escolher a opção 4.

Conceitos praticados:
- Declaração de variáveis
- Estruturas condicionais (if/else)
- Estruturas de repetição (loop)
- Entrada de dados com Scanner
- Operações matemáticas básicas
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Jéssica Yasminne";
        String tipoDeConta = "Conta corrente";
        double saldo = 2500;
        System.out.printf("""
                ***********************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f%n
                ***********************%n
                """, nome, tipoDeConta, saldo);
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4){
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """);
            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.printf("Seu saldo é de R$ %.2f%n", saldo);
            } else if (opcao == 2){
                System.out.println("Digite o valor que deseja receber em sua conta: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.printf("Seu novo saldo é R$ %.2f%n", saldo);
            } else if (opcao == 3){
                System.out.println("Digite o valor que deseja transferir de sua conta: ");
                double retirada = scanner.nextDouble();
                if (retirada > saldo){
                    System.out.println("O valor você não possui saldo suficiente");
                } else {
                    saldo -= retirada;
                    System.out.printf("Seu novo saldo é de R$ %.2f%n", saldo);
                }

            } else{
               System.out.println("""
                       Opção inválida.
                       Tente novamente.
                       """);
            }

        }
        System.out.println("""
                Saíndo do sistema!
                Até logo!
                """);
    }
}
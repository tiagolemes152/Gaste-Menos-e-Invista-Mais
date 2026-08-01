import java.util.Scanner;


 public class Main {

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta minhaConta = new Conta();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n\nBem vindo ao  Gaste - & Invista + \n Você deseja: \n");
            System.out.println("1 - Adicionar entrada");
            System.out.println("2 - Adicionar saída");
            System.out.println("3 - Conferir saldo");
            int opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor da entrada: R$ ");
                    double valorEntrada = scan.nextDouble();
                    minhaConta.creditar(valorEntrada);
                    break;

                case 2:
                    System.out.print("Digite o valor da saída: R$ ");
                    double valorSaida = scan.nextDouble();
                    minhaConta.debito(valorSaida);
                    break;

                case 3:
                    System.out.println("Seu saldo atual é: R$ " + minhaConta.consultarSaldo());
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }


        }
        scan.close();
    }
}



public class Conta {


        private double saldo = 0;
        public void creditar(double adicionar) {
            saldo += adicionar;
            System.out.println("Valor creditado!");
        }

        public void debito (double saida) {
            saldo -= saida;
            System.out.println("Valor debitado!");
        }

        // 4. Método de consulta: apenas revela o estado da variável
        public double consultarSaldo() {
            return saldo;

        }
    }




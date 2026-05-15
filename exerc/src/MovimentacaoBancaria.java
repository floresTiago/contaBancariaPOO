public class MovimentacaoBancaria {
    MovimentacaoBancaria(){
        ContaPoupanca c1 = new ContaPoupanca("Maria",1, 3000, 25);
        ContaEspecial c2 = new ContaEspecial("Joao", 2, 2000, 500);

        c1.depositar(300);
        c2.depositar(200);

        c1.sacar(500);
        c2.sacar(6000);
        c2.sacar(300);

        c1.calcularNovoSaldo(10);

        c1.consultarDados();
        c2.consultarSaldo();
    }

    public static void main(String[] args) {
        new MovimentacaoBancaria();
    }
}
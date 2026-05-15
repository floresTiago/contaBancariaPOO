public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nome, int numConta, float saldo, int diaRendimento) {
        super(nome, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento){
        super.setSaldo(getSaldo()+(getSaldo()*taxaRendimento/100));
    }

    public void consultarDados(){
        System.out.println("Tipo da conta: Conta Poupança");
        super.consultarDados();
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: "+super.getSaldo()+"\n");
    }
}

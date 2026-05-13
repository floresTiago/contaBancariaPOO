public class ContaPoupança extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupança(String nome, int numConta, float saldo, int diaRendimento) {
        super(nome, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento){
        super.setSaldo(getSaldo()+(getSaldo()*taxaRendimento/100));
    }

}

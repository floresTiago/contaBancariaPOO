public class ContaBancaria {
    private String nome;
    private int numConta;
    private float saldo;

    public ContaBancaria(String nome, int numConta, float saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(float movimentacao){
        this.saldo = this.saldo-movimentacao;
    }

    public void depositar(float movimentacao){
        this.saldo = this.saldo+movimentacao;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}

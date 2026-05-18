public abstract class ContaBancaria {
    private String nome;
    private int numConta;
    private float saldo;

    public ContaBancaria(String nome, int numConta, float saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(float valor){
        if(valor<=saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Sem saldo disponível\n");
        }
    }

    public void depositar(float valor){
        if (valor<0){
            System.out.println("Valor negado\n");
        }else{
            this.saldo += valor;
        }
    }

    public void consultarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Numero da conta: "+numConta);
    }

    public abstract void consultarSaldo();

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

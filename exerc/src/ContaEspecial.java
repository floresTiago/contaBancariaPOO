public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(String nome, int numConta, float saldo, float limite) {
        super(nome, numConta, saldo);
        this.limite = limite;
    }

    public void sacar(float valor) {
        if (super.getSaldo() + limite >= valor) {
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Sem limite disponível\n");
        }
    }

    public void consultarDados(){
        System.out.println("Tipo da conta: Conta Especial");
        super.consultarDados();
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: "+super.getSaldo()+"\n");
    }
}

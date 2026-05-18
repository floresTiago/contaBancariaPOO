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
        System.out.println("\n");
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: "+super.getSaldo());
        System.out.println("Limite total: "+limite);
        if(super.getSaldo()<=0){
            System.out.println("Limite atual: "+(limite+getSaldo())+"\n");
        }else{
            System.out.println("Limite atual: "+limite+"\n");
        }
    }
}

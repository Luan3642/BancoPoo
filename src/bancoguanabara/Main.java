package bancoguanabara;



public class Main {

    public static void main(String[] args){
        
        Pessoa luan = new Pessoa("Luan", "m", "24/05/2000", 18, 1.72);
        System.out.println("\n");
        luan.depositoLuan();
        luan.desejoConta();
        luan.exibePessoa();
        luan.fecharConta();
        
        System.out.println("\n");
        
        Pessoa iza = new Pessoa("Izabela ", "f", "01/08/2000", 18, 1.59);
        
        iza.depositoIza();
        iza.desejoConta();
        iza.exibePessoa();
        iza.fecharConta();

    }
}

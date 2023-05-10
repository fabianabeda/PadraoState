// Classe Transportado implementa o estado "Na transportadora"
public class Transportadora implements State {
    @Override
    public void atualizaStatus(Pedido pedido) {
        System.out.println("----------------------");
        System.out.println("Status: ENVIANDO PARA A TRANSPORTATORA");
        System.out.println("----------------------");
        System.out.println("Status: ENVIANDO PARA O CLIENTE");
        pedido.setStatus(new Recebido());
    }
}

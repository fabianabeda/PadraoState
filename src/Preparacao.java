// Classe Preparacao implementa o estado "Em preparação"
public class Preparacao implements State {
    @Override
    public void atualizaStatus(Pedido pedido) {
        System.out.println("----------------------");
        System.out.println("Status: EM PREPARAÇÃO");
        pedido.setStatus(new Transportadora());
    }
}
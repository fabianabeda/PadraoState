// Classe Recebido implementa o estado "Recebido"
public class Recebido implements State {
    @Override
    public void atualizaStatus(Pedido pedido) {
        System.out.println("----------------------");
        System.out.println("Status: RECEBIDO");
    }
}


// Classe Principal representa o programa cliente
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pedido pedido = new Pedido();

        System.out.println(
                "Bem-vindo à nossa loja! Estamos muito felizes em recebê-lo. Para fazer seu pedido, por favor confirme digitando true ou cancele digitando false.");

        boolean fazerPedido = scanner.nextBoolean();
        scanner.nextLine(); // Consumir nova linha deixada no buffer

        if (fazerPedido) {
            pedido.solicitaPedido();
            pedido.atualizaStatus();

            System.out.println("----------------------");
            System.out.println(
                    "Esperamos que você fique satisfeito com sua compra. Caso tenha algum problema com seu pedido, por favor nos informe digitando true. Caso contrário, digite false. Obrigado!");

            boolean teveProblema = scanner.nextBoolean();
            pedido.informaRecebimento(teveProblema);
        } else {
            System.out.println("----------------------");
            System.out.println("Seu pedido foi cancelado");

        }
    }
}

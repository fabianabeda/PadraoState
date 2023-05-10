public class Pedido {
    private State status;

    public Pedido() {
        this.status = new Preparacao();
    }

    public void solicitaPedido() {
        System.out.println("----------------------");
        System.out.println(
                "Seu pedido foi confirmado com sucesso! Obrigado por escolher nossa loja. Abaixo está o status atual do seu pedido:");
        atualizaStatus();
    }

    public void informaRecebimento(boolean teveProblema) {
        if (teveProblema) {
            System.out.println("----------------------");
            System.out.println(
                    "Pedimos desculpas pelo inconveniente e gostaríamos de informar que estaremos enviando um novo pedido imediatamente. Agradecemos pela compreensão e pela sua preferência.");
            setStatus(new Preparacao());
        } else {
            setStatus(new Recebido());
        }
        atualizaStatus();
    }

    public void setStatus(State status) {
        this.status = status;
    }

    public void atualizaStatus() {
        status.atualizaStatus(this);
    }
}
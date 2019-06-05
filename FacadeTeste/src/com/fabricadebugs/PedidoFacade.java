package com.fabricadebugs;

public class PedidoFacade {
    protected Pedido pedido;
    protected Prato prato;
    protected Pagamento pagamento;


    public void inicializarPedido(){
        prato = new Prato();
        prato.prepararIngredientes();
        prato.montarPrato();

        pedido = new Pedido();
        pedido.realizarPedido();
        pedido.reservarMesa();

        pagamento = new Pagamento();
        pagamento.calcularValorTotal();
        pagamento.carregarPagamento();
    }

    public void carregarPagamento(){
        pagamento.carregarPagamento();
    }

    public void finalizarPedido(){
        System.out.println("Selecionado. Conectando SiTef...");
        System.out.println("Conectado!");
        System.out.println("Pagamento realizado. Imprimir via do pedido?");
        System.out.println("Imprimindo...");
    }
}

public class Transferencia {
    String produto;
    String formaPagamento;
    int valorProduto;

    void pagar(int dinheiro){
        valorProduto-=dinheiro;
    }
}

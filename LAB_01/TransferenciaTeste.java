public class TransferenciaTeste {

    public static void main(String[] args) {
        Transferencia tr = new Transferencia();

        tr.produto = "Fogao";
        tr.valorProduto = 4000;
        tr.formaPagamento = "dinheiro";

        tr.pagar(5000);
        if (dinheiro >= 4000) {
        System.out.println("O valor do troco será R$" + Math.abs(tr.valorProduto));
        }
        else if (dinheiro == 5000){
            System.out.println("O produto foi pago");
        }
        else  if (dinheiro <= 4000){
            System.out.println("Faltam R$" + tr.valorProduto);
        }
    }
}

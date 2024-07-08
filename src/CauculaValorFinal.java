public class CauculaValorFinal {
    
    public Double cauculaValorFinal(int valorFornecido, String pagamentoEscolhido, int quantiaDeParcelas){
        
        if (pagamentoEscolhido.equals("dinheiro")){
            return valorFornecido * 0.85;
        }
        if (pagamentoEscolhido.equals("pix")){
            return valorFornecido * 0.85;
        }
        if (pagamentoEscolhido.equals("crédito")) {
            if (quantiaDeParcelas == 2) {
                return valorFornecido  * 0.95;
            }
            if(quantiaDeParcelas >= 3){
                return  valorFornecido * 1.00;
            }
            return valorFornecido * 0.9;

        }
        return null;
    }

}

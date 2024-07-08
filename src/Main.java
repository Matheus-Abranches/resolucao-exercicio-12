import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int quantidadeDeParcelas = 0;

        CauculaValorFinal cauc = new CauculaValorFinal();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        int valordoproduto = scanner.nextInt();
        System.out.println("Qual a forma de pagamento? " + "Dinheiro ou Pix, " + " crédito, " + "Parcelado 2 vezes, " + "Parcelado 3 vezes.");
        String formadepagamento = scanner.next();
        if (formadepagamento.equals("crédito")){
            quantidadeDeParcelas = scanner.nextInt();
        }
        Double valorFinal =  cauc.cauculaValorFinal(valordoproduto, formadepagamento, quantidadeDeParcelas);
        System.out.println(valorFinal);
        }

    }

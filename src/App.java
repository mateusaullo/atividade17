import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        double litro, metro, preco, capacidade, latas, total, galoes, preco2, galoes2;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("\nColoque o tamanho em metros quadrados da área a ser pintada: ");
        metro = teclado.nextDouble();
        teclado.close();

        litro = metro / 6;
        preco = 80.0;
        capacidade = 18;
        latas = Math.ceil(litro/capacidade);
        total = latas * preco;

        System.out.printf("\nVocê precisará de %.2f litros de tinta\n", litro);
        System.out.printf("\nComprando apenas latas de 18 litros, você precisará de %.0f latas ao custo de R$%.2f\n", latas, total);

        
        capacidade = 3.6;
        preco2 = 25;
        galoes = Math.ceil(litro / capacidade);
        total = galoes * preco2;

        System.out.printf("\nComprando apenas galões de 3,6 litros, você precisará de %.0f galões ao custo de R$%.2f\n", galoes, total);

        
        galoes2 = Math.ceil((litro%capacidade) / 3.6);
        latas = Math.floor(litro/capacidade);
        total = latas * preco + galoes2 * preco2;

        System.out.printf("\nCombinando latas e galões, você precisará de %.0f latas e %.0f galões ao custo de R$%.2f\n", latas, galoes2, total);
    }
}
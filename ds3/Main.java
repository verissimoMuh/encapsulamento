package ds3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto:");
        String nome = in.next();
        
        System.out.println("Digite o custo do produto:");
        double precoCusto = in.nextDouble();
        
        System.out.println("Digite o preço de venda do produto:");
        double precoVenda = in.nextDouble();
        
        Produto produto = new Produto(nome, precoCusto, precoVenda);
        
        System.out.println("\nDetalhes do produto:");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Custo: R$" + produto.getPrecoCusto());
        System.out.println("Venda: R$" + produto.getPrecoVenda());
        System.out.println("Margem de lucro: R$" + produto.getMargemLucro());
        System.out.println("Margem de lucro em porcentagem: " + produto.getMargemLucroPorcentagem() + "%");
    }
}
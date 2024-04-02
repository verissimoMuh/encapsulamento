package ds3;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;
 
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        setPrecoVenda(precoVenda);
        calcularMargemLucro();
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public double getPrecoCusto() {
        return precoCusto;
    }
 
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
        calcularMargemLucro();
    }
 
    public double getPrecoVenda() {
        return precoVenda;
    }
 
    public void setPrecoVenda(double precoVenda) {
        if (precoVenda >= precoCusto) {
            this.precoVenda = precoVenda;
            calcularMargemLucro();
        } else {
            System.out.println("O preço de venda não pode ser inferior ao preço de custo.");
        }
    }
 
    public double getMargemLucro() {
        return margemLucro;
    }
 
    public void calcularMargemLucro() {
        this.margemLucro = precoVenda - precoCusto;
    }
 
    public double getMargemLucroPorcentagem() {
        return (margemLucro / precoCusto) * 100;
    }
}
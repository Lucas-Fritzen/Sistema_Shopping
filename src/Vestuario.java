public class Vestuario  extends Loja{
    private boolean produtosImportados;

    // Construtor que inicializa todos os atributos, incluindo os da superclasse
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBase, Endereco endereco, Data dataFundacao, boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao, maxProdutos ); // Chamada ao construtor da superclasse
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.produtosImportados = produtosImportados;
    }

    // Getter para produtosImportados
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    // Setter para produtosImportados
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return super.toString() + // Chama o toString da superclasse para reaproveitar a formatação
                "\nProdutos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    public boolean estaVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno()) {
            return true; // Se o ano da validade for anterior ao atual, já venceu
        } else if (dataValidade.getAno() == dataAtual.getAno()) {
            if (dataValidade.getMes() < dataAtual.getMes()) {
                return true; // Se o mês da validade for anterior ao atual no mesmo ano, venceu
            } else if (dataValidade.getMes() == dataAtual.getMes()) {
                return dataValidade.getDia() < dataAtual.getDia(); // Se o dia de validade for anterior
            }
        }
        return false; // Caso contrário, o produto não está vencido
    }

    public String toString() {
        return "Produto: " + nome +
                "\nPreço: R$ " + preco +
                "\nData de Validade: " + (dataValidade != null ? dataValidade : "Data de validade não informada");
    }
}

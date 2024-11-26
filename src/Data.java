public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Atribuindo data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia) {
        if (dataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
    } else {
            System.out.println("Dia inválido! Valor não alterado.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (dataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido! Valor não alterado.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (dataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! Valor não alterado.");
        }
    }

    // Método para validar a data
    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verifica ano bissexto
        if (verificaAnoBissexto()) {
            diasNoMes[1] = 29; // Fevereiro tem 29 dias em anos bissextos
        }

        return dia >= 1 && dia <= diasNoMes[mes - 1];
    }

    // Método para verificar se o ano é bissexto
    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Método toString
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}



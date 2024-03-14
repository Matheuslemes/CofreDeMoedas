public abstract class Moeda {
    // Aluno: Matheus Silva Lemes
    // RU: 4394193
    protected double valor;

    public Moeda(double valor) { // Construtor
        this.valor = valor;
    }

    public double getValor() { // Metodo que retorna o valor da moeda
        return valor;
    }

    public abstract String getNome(); // Metodo que retorna o nome da moeda

    public abstract void info(); // Metodo que retorna informações da moeda

    public abstract double converter(); // Metodo que retorna o valor da moeda convertido para real
}

public class Dolar extends Moeda {
    // Aluno: Matheus Silva Lemes
    // RU: 4394193
    public Dolar(double valor) { // Construtor
        super(valor);
    }

    @Override
    public String getNome() { // Metodo que retorna o nome da moeda
        return "Dólar";
    }

    @Override
    public void info() { // Metodo que retorna informações da moeda
        System.out.println("Moeda: " + getNome() + ", Valor: " + getValor());
    }

    @Override
    public double converter() { // Metodo que retorna o valor da moeda convertido para real
        return getValor() * 5.5; // Valor fictício
    }

}

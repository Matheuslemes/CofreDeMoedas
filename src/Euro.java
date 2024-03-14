public class Euro extends Moeda {
    // Aluno: Matheus Silva Lemes
    // RU: 4394193

    public Euro(double valor) { // Construtor
        super(valor);
    }

    @Override
    public String getNome() { // Metodo que retorna o nome da moeda
        return "Euro";
    }

    @Override
    public void info() { // Metodo que retorna informações da moeda
        System.out.println("Moeda: " + getNome() + ", Valor: " + getValor());
    }

    @Override
    public double converter() { // Metodo que retorna o valor da moeda convertido para real
        return getValor() * 6.5; // Valor fictício
    }
}

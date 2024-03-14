import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Cofrinho {
    // Aluno: Matheus Silva Lemes
    // RU: 4394193

    private ArrayList<Moeda> moedas; // Lista que armazena as moedas do cofre

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) { // Metodo que adiciona moedas ao cofre
        moedas.add(moeda);
        System.out.println(moeda.getNome() + " adicionado ao cofrinho!");
    }

    public void remover(int indice) { // Metodo que remove as moedas do cofre
        if(indice >= 0 && indice < moedas.size()) {
            Moeda moedaRemovida = moedas.remove(indice);
            System.out.println(moedaRemovida.getNome() + " removido do cofrinho!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listagemMoedas() { // Metodo que lista as moedas contidas no cofre
        System.out.println("Moedas no cofrinho:");
        for (int i = 0; i < moedas.size(); i++) {
            Moeda moeda = moedas.get(i);
            moeda.info();
        }
    }

    public double totalConvertido() { // // Metodo que retorna o valor de todas as moedas convertido para real
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converter();
        }
        return total;

    }
}

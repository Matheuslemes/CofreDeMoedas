import java.util.Scanner;

public class Principal {
    // Aluno: Matheus Silva Lemes
    // RU: 4394193

    public static void main(String[] args) {
        Scanner opcaoScanner = new Scanner(System.in); // Variavel que declara um novo Scanner
        Cofrinho cofrinho = new Cofrinho();

        while (true) { // Laço de repetição que gera o menu de opções para o usuário
            System.out.println( // Impressão do menu de opções
                            "\nBEM VINDO AO COFRE!\n" +
                            "MENU PRINCIPAL!\n" +
                            "1-Adiconar Moeda\n" +
                            "2-Remover Moeda\n" +
                            "3-Listar Moedas\n" +
                            "4-Calcular Total em Reais\n" +
                            "0-Sair"
            );
            int opcao = opcaoScanner.nextInt(); // Variável que recebe o Scanner declarado anteriormente

            switch (opcao) { // Switch case que verifica a opção selecionada

                case 1: // Case 1: Adiconar moeda
                    System.out.println( // Impressão do menu de opções para a seleção de qual moeda adicionar
                                    "\n1-Dólar\n" +
                                    "2-Euro\n" +
                                    "3-Real"
                    );
                    System.out.println("Escolha o tipo de moeda: ");
                    int tipoMoeda = opcaoScanner.nextInt(); // Variável que recebe a opção do tipo de moeda selecionada pelo usuário via Scanner
                    System.out.println("Digite o Valor da Moeda: ");
                    double valorMoeda = opcaoScanner.nextDouble(); // Variável que recebe o valor da moeda selecionada via Scanner
                    Moeda novaMoeda = null; // Variável de referência para a criação de um novo objejeto
                    if (tipoMoeda == 1) { // If e Else que verifica qual é o tipo de moeda selecionado pelo usuário
                        novaMoeda = new Dolar(valorMoeda); // Cria um novo objeto/moeda do tipo Dólar com seu valor
                    } else if (tipoMoeda == 2) {
                        novaMoeda = new Euro(valorMoeda); // Cria um novo objeto/moeda do tipo Euro com seu valor
                    } else if (tipoMoeda == 3) {
                        novaMoeda = new Real(valorMoeda); // Cria um novo objeto/moeda do tipo Real com seu valor
                    }
                    cofrinho.adicionar(novaMoeda); // Chama o método "adicionar" que adicona uma nova moeda ao cofre
                    break;

                case 2: // Case 2: Remover moeda
                    cofrinho.listagemMoedas(); // Chama o método "listagemMoedas" que lista as moedas que contém no cofre
                    int indice = opcaoScanner.nextInt(); // Variável que recebe a opção do índice da moeda selecionada pelo usuário via Scanner
                    System.out.println("Digite o índice da moeda que deseja remover: ");
                    cofrinho.remover(indice - 1); // Chama o método "remover" que remove a moeda selecionada do cofre pelo índice
                    break;

                case 3: // Case 3: Listar Moedas
                    cofrinho.listagemMoedas(); // Chama o método "listagemMoedas" que lista as moedas do cofre
                    break;

                case 4: // Case 4: Calcular Total em Reais
                    System.out.println("Total em reais no cofrinho: " + cofrinho.totalConvertido()); // Imprime uma mensagem e chama o método "totalConvertido" que retorna o valor total convertido para real
                    break;

                case 0: // Case 0: Sair
                    System.out.println("Saindo do Programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            if (opcao == 0 ) { // If que verifica se a opção é 0 para encerrar o código
                System.out.println("Programa encerrado com sucesso!");
                break; // Encerra o while
            }
        }
    }
}


import calculadora.Calculadora;

/**
 * Classe principal responsável por iniciar
 * a execução do programa.
 */
public class App {

    public static void main(String[] args) throws Exception {

        Calculadora operacoes = new Calculadora();

        // Realiza uma operação de multiplicação
        String resposta = operacoes.calc(8, 6, "*");

        // Exibe o resultado obtido
        System.out.println(resposta);
    }
}

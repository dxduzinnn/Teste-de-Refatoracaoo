package calculadora;

/**
 * Classe responsável por realizar cálculos matemáticos
 * utilizando dois valores inteiros e um operador.
 *
 * @author Eduardo Moraes
 * @version 2.0
 */
public class Calculadora {

    private static final String MENSAGEM_RESULTADO = "O resultado é: ";

    /**
     * Gera uma mensagem informando que o operador
     * utilizado não é reconhecido pela calculadora.
     *
     * @return texto indicando operador inválido
     */
    private String mensagemOperadorInvalido() {
        return "Operador inválido, tente (+, -, / ou *)";
    }

    /**
     * Adiciona o texto padrão ao valor obtido
     * após a execução de uma operação.
     *
     * @param valor valor final da operação
     * @return resultado formatado
     */
    private String formatarResultado(int valor) {
        return MENSAGEM_RESULTADO + valor;
    }

    /*
    Recebe dois números e executa a operação
    correspondente ao símbolo informado.
    @param a primeiro valor inteiro
    @param b segundo valor inteiro
    @param op símbolo da operação desejada
    @return resultado do cálculo ou aviso de erro
     */
    public String calc(int a, int b, String op) {

        if (op == null) {
            return mensagemOperadorInvalido();
        }

        switch (op) {
            case "+":
                return formatarResultado(a + b);

            case "-":
                return formatarResultado(a - b);

            case "*":
                return formatarResultado(a * b);

            case "/":
                if (b == 0) {
                    return "Não é possível divisão por 0";
                }
                return formatarResultado(a / b);

            default:
                return mensagemOperadorInvalido();
        }
    }
}


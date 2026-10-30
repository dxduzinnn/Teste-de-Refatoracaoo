package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Verifica se os cálculos realizados pela classe Calculadora
 * apresentam os resultados esperados.
 *
 * @author Felipe Sanches Venâncio
 * @version 1.0
 */
public class TesteCalculadora {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void verificarMultiplicacao() {
        // Operação: 8 vezes 4
        // Resultado esperado: 32
        assertEquals("O resultado é: 32",
                calculadora.calc(8, 4, "*"));
    }

    @Test
    public void verificarOperadorIncorreto() {
        // Símbolo não reconhecido: %
        assertEquals("Operador inválido, tente (+, -, / ou *)",
                calculadora.calc(12, 3, "%"));
    }

    @Test
    public void verificarAdicao() {
        // Operação: 18 + 7
        // Resultado esperado: 25
        assertEquals("O resultado é: 25",
                calculadora.calc(18, 7, "+"));
    }

    @Test
    public void verificarDivisaoInvalida() {
        // Tentativa de dividir um número por zero
        assertEquals("Não é possível divisão por 0",
                calculadora.calc(20, 0, "/"));
    }

    @Test
    public void verificarSubtracao() {
        // Operação: 15 - 6
        // Resultado esperado: 9
        assertEquals("O resultado é: 9",
                calculadora.calc(15, 6, "-"));
    }

    @Test
    public void verificarDivisao() {
        // Operação: 36 dividido por 6
        // Resultado esperado: 6
        assertEquals("O resultado é: 6",
                calculadora.calc(36, 6, "/"));
    }
}

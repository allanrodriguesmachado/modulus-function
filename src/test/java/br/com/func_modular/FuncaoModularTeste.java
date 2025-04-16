
package br.com.func_modular;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FuncaoModularTeste {
    @Test
    public void testModuloComNumeroNegativo() {
        assertEquals(10.0, calcularModulo(-10));
    }

    @Test
    public void testeModuloComNumeroPositivo() {
        assertEquals(5, calcularModulo(5));
    }

    @Test
    public void testeModuloComNumeroCom4CasaDecimais() {
        assertEquals(2000, calcularModulo(-2000));
    }

    private static double calcularModulo(double valor) {
        return Math.abs(valor);
    }
}

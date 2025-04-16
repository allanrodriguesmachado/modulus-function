
package br.com.func_modular;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FuncaoModularTeste {
    @Test
    public void testModuloComNumeroNegativo() {
        assertEquals(10.0, Main.CalculadoraModular.calcularModulo(-10));
    }

    @Test
    public void testeModuloComNumeroPositivo() {
        assertEquals(5, Main.CalculadoraModular.calcularModulo(5));
    }

    @Test
    public void testeModuloComNumeroCom4CasaDecimais() {
        assertEquals(2000, Main.CalculadoraModular.calcularModulo(-2000));
    }
}

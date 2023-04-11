package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnalistaTest {

    @Test
    void deveRetornarSalarioAnalistaEstagio() {
        Senioridade senioridade = new Estagio();
        Analista analista = new Analista(1000.0f);
        analista.setSenioridade(senioridade);
        assertEquals(1000.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarAnalistaJunior() {
        Senioridade senioridade = new Junior();
        Analista analista = new Analista(3000.0f);
        analista.setSenioridade(senioridade);
        assertEquals(3600.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarAnalistaPleno() {
        Senioridade senioridade = new Pleno();
        Analista analista = new Analista(3300.0f);
        analista.setSenioridade(senioridade);
        assertEquals(3600.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarAnalistaSenior() {
        Senioridade senioridade = new Senior();
        Analista analista = new Analista(4000.0f);
        analista.setSenioridade(senioridade);
        assertEquals(4600.0f, analista.calcularSalario(), 0.01f);
    }


}
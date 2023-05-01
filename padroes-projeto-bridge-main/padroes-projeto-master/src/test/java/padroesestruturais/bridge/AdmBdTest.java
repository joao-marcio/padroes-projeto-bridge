package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdmBdTest {

    @Test
    void deveRetornarSalarioAdmBdEstagio() {
        Senioridade senioridade = new Estagio();
        Analista analista = new Analista(1000.0f);
        analista.setSenioridade(senioridade);
        assertEquals(1000.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdmBdJunior() {
        Senioridade senioridade = new Junior();
        Analista analista = new Analista(3000.0f);
        analista.setSenioridade(senioridade);
        assertEquals(3300.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdmBdPleno() {
        Senioridade senioridade = new Pleno();
        Analista analista = new Analista(3000.0f);
        analista.setSenioridade(senioridade);
        assertEquals(3600.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdmBdSenior() {
        Senioridade senioridade = new Senior();
        Analista analista = new Analista(3000.0f);
        analista.setSenioridade(senioridade);
        assertEquals(3900.0f, analista.calcularSalario(), 0.01f);
    }


}
package padroesestruturais.bridge;

public class Analista extends Cargo {

    public Analista(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.senioridade.percentualAumento());
    }
}

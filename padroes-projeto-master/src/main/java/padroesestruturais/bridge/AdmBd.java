package padroesestruturais.bridge;

public class AdmBd extends Cargo {

    public AdmBd(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.senioridade.percentualAumento());
    }
}

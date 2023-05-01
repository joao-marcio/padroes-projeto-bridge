package padroesestruturais.bridge;

public abstract class Cargo {

    protected Senioridade senioridade;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setSenioridade(Senioridade senioridade) {
        this.senioridade = senioridade;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}

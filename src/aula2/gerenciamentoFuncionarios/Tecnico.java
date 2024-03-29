package aula2.gerenciamentoFuncionarios;

public class Tecnico extends FuncionarioCLT{
    private final double SALARIO_BASE = 3200.0;
    private final double PORCENTAGEM_BONIFICACAO = 0.05;

    @Override
    public double pagarSalario() {
        return SALARIO_BASE + calcularBonificacao();
    }

    @Override
    public double calcularBonificacao() {
        return this.getMetasBatidas() * PORCENTAGEM_BONIFICACAO * SALARIO_BASE;
    }
}
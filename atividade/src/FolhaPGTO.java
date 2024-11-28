import java.util.ArrayList;

public class FolhaPGTO {
    private ArrayList<Empregado> empregados;

    public FolhaPGTO() {
        empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void calcularFolha() {
        for (Empregado empregado : empregados) {
            double irpf = empregado.calcularIrpf();
            double inss = empregado.calcularInss();
            double salarioLiquido = empregado.getSalario() - irpf - inss;

            System.out.println("----- Dados do Empregado -----");
            System.out.println("Nome: " + empregado.getNome());
            System.out.println("Endereço: " + empregado.getEndereco());
            System.out.println("Salário Bruto: R$ " + empregado.getSalario());
            System.out.println("Desconto IRPF: R$ " + irpf);
            System.out.println("Desconto INSS: R$ " + inss);
            System.out.println("Salário Líquido: R$ " + salarioLiquido);
            System.out.println("--------------------------------");
        }
    }
}

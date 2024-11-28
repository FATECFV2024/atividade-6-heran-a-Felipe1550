public class App {
    public static void main(String[] args) {
        FolhaPGTO folha = new FolhaPGTO();

        Mensalista mensalista1 = new Mensalista("João", "Rua A, 123", "Junior");
        mensalista1.calcularSalario();
        folha.adicionarEmpregado(mensalista1);

        Mensalista mensalista2 = new Mensalista("Maria", "Rua B, 456", "Pleno");
        mensalista2.calcularSalario();
        folha.adicionarEmpregado(mensalista2);

        Horista horista1 = new Horista("Carlos", "Rua C, 789", 160);
        horista1.calcularSalario();
        folha.adicionarEmpregado(horista1);

        folha.calcularFolha();
    }
}

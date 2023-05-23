import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GestaoHospital gestao = new GestaoHospital();
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nSistema de Atendimento Hospitalar");
            System.out.println("1. Adicionar paciente à fila");
            System.out.println("2. Atender próximo paciente");
            System.out.println("3. Exibir número de pacientes na fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    gestao.adicionaPaciente();
                    break;
                case 2:
                    gestao.atenderSeguintePaciente();
                    break;
                case 3:
                    int numeroPacientes = gestao.getNumeroPacientesNaFila();
                    System.out.println("Número de pacientes na fila: " + numeroPacientes);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
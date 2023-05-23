// Aqui iremos importar o Arraylist que foi da minha preferencia...
//e o scanner para ler o que for digitado no teclado...
import java.util.ArrayList;
import java.util.Scanner;
class GestaoHospital {
    //Aqui estamos fazendo a criação de um Array de Pacientes obviamente
    private ArrayList<Paciente> PacientePrioridade;

    public GestaoHospital() {
        PacientePrioridade = new ArrayList<>();
    }
    //Aqui temos a criação do método de Adicionar paciente em forma de opções e que serão lidas pelo scanner
    //e vai pedir os atributos do paciente que foram dados na questao

    public void adicionaPaciente() {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o Nome do paciente: ");
        String nome = input.nextLine();
        System.out.print("Insira o número do CPF do Paciente: ");
        String cpf = input.nextLine();
        System.out.print("Informe qual o nível de prioridade (0 - normal, 1 - leve, 2 - moderado, 3 - severo): ");
        int prioridade = input.nextInt();

        Paciente paciente = new Paciente(nome, cpf, prioridade);
        PacientePrioridade.get(paciente.getPrioridade());
        System.out.println("O paciente foi adicionado na fila de atendimento.");
    }
        //Aqui é uma verificação para saber se a o array de prioridades está vazio
    public void atenderSeguintePaciente() {
        if (PacientePrioridade.isEmpty()) {
            System.out.println("Não há pacientes na fila.");
            return;
        }
            //fiz a criação de um simples vetor onde tem os niveis de prioridade acerca do que foi informado na questão sobre prioridades e a ordem
        int[] prioridades = {3, 2, 1, 3, 2, 3, 0};

        for (int i = 0; i < prioridades.length; i++) {
            int prioridadeAtual = prioridades[i];
            for (Paciente paciente : PacientePrioridade) {
                if (paciente.getPrioridade() == prioridadeAtual) {
                    System.out.println("Atendendo ao paciente " + paciente.getNome() + " (Prioridade: " + paciente.getPrioridade() + ")");
                    PacientePrioridade.remove(paciente);
                    return;
                }
            }
        }
    }

    public int getNumeroPacientesNaFila() {
        return PacientePrioridade.size();
    }
}
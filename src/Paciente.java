// Classe Paciente com fins de montar o perfil do Paciente com os seguintes Atributos: Nome,CPF e (prioridade)
// logo depois o construtor e os getters e setters gerados

class Paciente {
    private String nome;
    private String cpf;
    private int prioridade;

    public Paciente(String nome, String cpf, int prioridade) {
        this.nome = nome;
        this.cpf = cpf;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
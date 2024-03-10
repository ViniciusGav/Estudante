public class Estudante {
    String nome;
    double[] notas;
    int quantidadeNotas;


    public Estudante() {
        notas = new double[100];
        quantidadeNotas = 0;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addNota(double nota) {
        notas[quantidadeNotas] = nota;
        quantidadeNotas++;
    }

    public double CalcularMedia() {
        double somasNotas = 0;
        for(int i = 0; i < quantidadeNotas; i++){
            somasNotas += notas[i];
        }
        return somasNotas / quantidadeNotas;
    }
}
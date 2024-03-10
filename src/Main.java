import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Qual seu nome: ");
        String nome = ler.next();
        estudante.setNome(nome);

        System.out.println("Quantas notas você possui? ");
        int quantidade = ler.nextInt();

        for(int i = 1; i <= quantidade; i++){
            System.out.println("Digite sua " + i + "ª nota: ");
            double nota = ler.nextDouble();
            estudante.addNota(nota);
        }

        double media = estudante.CalcularMedia();
        System.out.println("Sua média é: " + media);

        if(media <= 6){
            System.out.println(nome + " REPROVADO");
        } else{
            System.out.println(nome + " APROVADO!");
        }
    }
}

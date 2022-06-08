import java.util.Scanner;

class BatistaMoraesQuestao6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero referente à um dia da semana: ");
        int diaDaSemana = input.nextInt();

        while (diaDaSemana != 0) {

            switch (diaDaSemana) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
            }
            System.out.print("Digite um numero referente à um dia da semana: ");
            diaDaSemana = input.nextInt();
        }
        input.close();
    }
}
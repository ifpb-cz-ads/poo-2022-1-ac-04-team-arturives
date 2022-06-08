import java.util.Scanner;

class BatistaMoraesQuestao7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = input.nextInt();

        int y;

        do {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }
            System.out.println(y);
            x = y;
        } while (y != 1);

        input.close();
    }
}
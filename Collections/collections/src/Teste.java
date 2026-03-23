import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var nome = "";

        System.out.println("O nome agora é: " + nome);

        System.out.print("Quer alterar o nome? ");
        var resposta = sc.nextLine();

        if(resposta.equalsIgnoreCase("sim")){
            System.out.print("Digite o novo nome: ");
            nome = sc.nextLine();

            System.out.println("O nome agora é:" + nome);
        }else {
            System.out.println("O nome ainda é:" + nome);
        }






        sc.close();
    }
}

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a sua idade: ");

        int idade = scanner.nextInt();

        int pontuacao = 0;

        // Pergunta 1: Cartão de vacina esta em dia
        System.out.print("Seu cartão de vacina está em dia? (SIM/NAO) ");

        String resposta1 = scanner.next().toUpperCase();

        while (!resposta1.equals("SIM") && !resposta1.equals("NAO")) {

            System.out.print("Resposta inválida. Tente novamente: ");

            resposta1 = scanner.next().toUpperCase();
        }
        if (resposta1.equals("NAO")) {
            pontuacao += 10;
        }

        // Pergunta 2: Teve sintomas recentes
        System.out.print("Teve algum dos sintomas recentemente? (SIM/NAO) ");

        String resposta2 = scanner.next().toUpperCase();

        while (!resposta2.equals("SIM") && !resposta2.equals("NAO")) {

            System.out.print("Resposta inválida. Tente novamente: ");
            resposta2 = scanner.next().toUpperCase();
        }
        if (resposta2.equals("SIM")) {
            pontuacao += 30;
        }

        // Pergunta 3: Teve contato com pessoa infectada
        System.out.print("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM/NAO) ");

        String resposta3 = scanner.next().toUpperCase();

        while (!resposta3.equals("SIM") && !resposta3.equals("NAO")) {

            System.out.print("Resposta inválida. Tente novamente: ");
            resposta3 = scanner.next().toUpperCase();
        }
        if (resposta3.equals("SIM")) {
            pontuacao += 30;
        }

        // Pergunta 4: Está retornando de viagem
        System.out.print("Está retornando de viagem realizada no exterior? (SIM/NAO) ");
        String resposta4 = scanner.next().toUpperCase();

        while (!resposta4.equals("SIM") && !resposta4.equals("NAO")) {

            System.out.print("Resposta inválida. Tente novamente: ");
            resposta4 = scanner.next().toUpperCase();
        }
        if (resposta4.equals("SIM")) {
            pontuacao += 30;
            System.out.println("Você ficará sob observação por 05 dias.");
        }

        // Calcular porcentagem de risco
        int porcentagem = pontuacao;

        // Imprimir informações coletadas
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cartão Vacinal em Dia: " + resposta1);
        System.out.println("Teve sintomas recentemente: " + resposta2);
        System.out.println("Teve contato com pessoas infectadas: " + resposta3);
        System.out.println("Retornando de viagem: " + resposta4);
        System.out.println("Porcentagem de risco: " + porcentagem + "%");

        // Imprimir orientação final do atendimento
        if (porcentagem <= 30) {
            System.out.println("Paciente sob observação");

            scanner.close();
        }
    }
}
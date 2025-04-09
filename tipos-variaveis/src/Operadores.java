public class Operadores {
    public static void main(String[] args) throws Exception {
        /* 
        String nomeUm = "Hugo";
        String nomeDois = new String("Hugo");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("Numero 1 é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente a numero 2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que numero 2? " + simNao);*/

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && ( 7>4)) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
}
}
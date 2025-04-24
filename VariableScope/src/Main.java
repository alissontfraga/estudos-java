public class Main {

    static int x = 3; //Class  - se tiver aqui fora nos outros blocos ele será reconhecido

    public static void main(String[] args) {

        //variable scope = where a variable can be accessed


        int x = 1; //local    - só será reconhecido nesse bloco

        System.out.println(x);

        doSomething();

    }
    static void doSomething(){
        int x = 2; //local

        System.out.println(x);
        // print tem prioridade pro local do que pro class
    }


}

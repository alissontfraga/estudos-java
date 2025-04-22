public class Main {
    public static void main(String[] args) {
        //break = break out of a loop (STOP)
        //continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++){

//          if (i == 5){
//              break; vai do 0 até o 4
//          }

            if (i == 5){
                continue;      //vai do 0 até o 9, pula o 5
            }

            System.out.print(i + " ");

        }


    }
}

public class Main {
    public static void main(String[] args) {

        String name = "Alisso";
        int length = name.length(); //número de letras
        //System.out.println(length);

        char letter = name.charAt(5); //pegar caractere
        //System.out.println(letter);

        int index = name.indexOf("o"); //localizar o primeiro index
        int lastIndex = name.lastIndexOf("o"); //ultimo index

        //name = name.toUpperCase();
        //System.out.println(name);

        //name = name.toLowerCase();
        //System.out.println(name);

        String name2 = "    Alisso        ";
        //name2 = name2.trim();  //corta os espaços
        //System.out.println(name2);
        //name = name.replace("o", "a"); //replace letter
        //System.out.println(name);

        //boolean values
        name2.isEmpty(); //verificar se vazio, true or false

       /* if(name2.isEmpty()){
            System.out.println("Your name is empty! ");
        }
        else{
            System.out.println("not empty!");
        }
        */

        /* if (name.contains("A")){ //case sensitive
            System.out.println("Your name contains an A");
        }
        else{
            System.out.println("Your name doesn't contains an A");
        }
        */

        if (name.equals("password")){ //case sensitive, can be used name.equalsIgnoreCase to ignore
            System.out.println("You name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }





    }

}

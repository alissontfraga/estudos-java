public class Main {
    public static void main(String[] args) {

//        static = makes a variable or method belong to the class
//                 rather than to any specific object.
//                 commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Alisso");
        Friend friend2 = new Friend("lisa");
        Friend friend3 = new Friend("liz");
        Friend friend4 = new Friend("Isa");

        System.out.println(Friend.numOfFriends);

        Friend.showFriends();

    }
}

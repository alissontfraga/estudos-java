public class Main {
    public static void main(String[] args) {

//        2D array = An array where each element is an array
//                useful for storing a matrix of data

//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef","porkshop"};
//
//        String[][] groceries = {fruits, vegetables, meats};
//
//        for (String[] foods : groceries) {
//            for (String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }


        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef","porkshop"}};

        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";  // row - column
        groceries[1][2] = "batata";

        for (String[] foods : groceries) {
            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }






    }
}

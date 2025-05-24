public class Main {
    public static void main(String[] args) {
//        super = Refers to the parent class (subclass <- superclass)
//                Used in constructors and method overriding
//                Calls the parent constructor to initialize
//                attributes

        Person person = new Person("Alisso", "aly");
        Student student = new Student("lissa", "lis",9.5);
        Employee employee = new Employee("Isa", "sa", 1800);

        person.showName();
        student.showName();
        employee.showName();

        student.showGPA();

        employee.showSalary();







    }
}

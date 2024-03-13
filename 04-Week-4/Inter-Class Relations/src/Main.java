public class Main {
    public static void main(String[] args) {
        //Course math = new Course("Math", 55);
        Student student1 = new Student("Ahmed","Ali",45, new Course("Math", 55));
        Student student2 = new Student("Ahmed","Ali",44, new Course("Physic", 56));
        //System.out.println(student1.getStudentNo());
        student1.print();
        student2.print();
    }
}
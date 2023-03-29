package classroom;

public class Students {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "carlos";
        student1.age = 19;
        student1.letterGrade = 'B';
        student1.printStudentInfo();

        Student student2 = new Student();
        student2.name = "Josh";
        student2.age = 18;
        student2.letterGrade = 'C';
        student2.printStudentInfo();

        Student student3 = new Student();
        student3.name = "kim";
        student3.age = 15;
        student3.letterGrade = 'A';
        student3.printStudentInfo();
    }
}

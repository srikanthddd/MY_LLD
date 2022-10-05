public class Client {

    public static void fillRegistry(StudentRegistry registry){

        Student student = new Student();
        student.setCollege("scaler");
        student.setUniversity("IIT Bangalore");

        registry.register("normalStudent", student);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setIQ("100");
        intelligentStudent.setCollege("scaler");
        intelligentStudent.setUniversity("IIT Bangalore");

        registry.register("IntelligentStudent", intelligentStudent);

    }

    public static void main(String[] args) {

        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student scalerStudentCopy  = registry.get("normalStudent").CloneMyObject();

        scalerStudentCopy.setId(1);
        scalerStudentCopy.setName("Srikanth");
        scalerStudentCopy.setEmail("srikanth@gmail.com");


        Student intelligentStudent  = registry.get("IntelligentStudent").CloneMyObject();
        System.out.println("Debug");
    }
}

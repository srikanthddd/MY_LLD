package CreationalDesignPatterns.BuilderDesignPattern;

public class Client {

    public static void main(String[] args) {

        //StudentBuilder sb = new StudentBuilder();
        //sb.setAddress("address");
        //sb.setCollege("college");

        Student student =   Student.getStudentBuilder()
                            .setAddress("Hyderabad")
                            .setId(1)
                            .setCollege("JNTU")
                            .setMarks(100).build();
        System.out.println(student.getAddress());
        System.out.println(student.getCollege());
    }
}

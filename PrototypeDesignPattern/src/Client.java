public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Srikanth D");
        s1.setEmail("d.sri6365@gmail.com");
        s1.setCollege("Scaler College of Engineering");
        s1.setUniversity("Bangalore university");

        Student copy = (Student) s1.CloneMyObject();
        System.out.println(copy.getId());
        System.out.println(copy.getName());
        System.out.println(copy.getEmail());
        System.out.println(copy.getCollege());
        System.out.println(copy.getUniversity());
    }
}
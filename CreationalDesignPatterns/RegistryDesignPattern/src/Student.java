public class Student implements Prototype{

    private int id;
    private String name;
    private String college;
    private String email;
    private String university;

    public Student(){

    }

    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.email = s.email;
        this.college = s.college;
        this.university = s.university;
    }

    public  Student CloneMyObject(){
        Student s = new Student();
        s.setId(this.id);
        s.setName(this.name);
        s.setEmail(this.email);
        s.setCollege(this.college);
        s.setUniversity(this.university);

        return s;
    }



    /*public int getId() {
        return id;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    /*public String getName() {
        return name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    /*public String getCollege() {
        return college;
    }*/

    public void setCollege(String college) {
        this.college = college;
    }

    /*public String getEmail() {
        return email;
    }*/

    public void setEmail(String email) {
        this.email = email;
    }

    /*public String getUniversity() {
        return university;
    }*/

    public void setUniversity(String university) {
        this.university = university;
    }

}

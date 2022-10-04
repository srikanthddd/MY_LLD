public class Student implements  Prototype{

    private int id;
    private String name;
    private String college;
    private String email;
    private String university;

    public Object CloneMyObject(){
        Student s = new Student();
        s.setId(this.getId());
        s.setName(this.getName());
        s.setEmail(this.getEmail());
        s.setCollege(this.getCollege());
        s.setUniversity(this.getUniversity());

        return s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

}

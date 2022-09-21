package BuilderDesignPattern;

public class Student {

    private int id;
    private String name;
    private String batchId;
    private String college;
    private int marks;
    private boolean isRegular;
    private String Address;

    private String University;

    private Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.name = studentBuilder.getName();
        this.batchId = studentBuilder.getBatchId();
        this.college = studentBuilder.getCollege();
        this.marks = studentBuilder.getMarks();
        this.isRegular = studentBuilder.isRegular();
        this.Address = studentBuilder.getAddress();
        this.University = studentBuilder.getUniversity();
    }

    public static StudentBuilder getStudentBuilder() {
        return new StudentBuilder();
    }

    /*public Student(int id, String name, String batchId, String college, int marks, boolean isRegular, String address, String university) {
        this.id = id;
        this.name = name;
        this.batchId = batchId;
        this.college = college;
        this.marks = marks;
        this.isRegular = isRegular;
        Address = address;
        University = university;
    }*/

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

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

     static class StudentBuilder {

        private int id;
        private String name;
        private String batchId;
        private String college;
        private int marks;
        private boolean isRegular;
        private String Address;
        private String University;

        public Student build() {
            return new Student(this);
        }

        public int getId() {
            return id;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatchId() {
            return batchId;
        }

        public StudentBuilder setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        public String getCollege() {
            return college;
        }

        public StudentBuilder setCollege(String college) {
            this.college = college;
            return this;
        }

        public int getMarks() {
            return marks;
        }

        public StudentBuilder setMarks(int marks) {
            this.marks = marks;
            return this;
        }

        public boolean isRegular() {
            return isRegular;
        }

        public StudentBuilder setRegular(boolean regular) {
            isRegular = regular;
            return this;
        }

        public String getAddress() {
            return Address;
        }

        public StudentBuilder setAddress(String address) {
            Address = address;
            return this;
        }

        public String getUniversity() {
            return University;
        }

        public StudentBuilder setUniversity(String university) {
            University = university;
            return this;
        }

    }
}

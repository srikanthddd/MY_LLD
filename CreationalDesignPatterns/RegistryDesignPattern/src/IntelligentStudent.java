public class IntelligentStudent extends Student{

    private String IQ;

    public String getIQ() {
        return IQ;
    }

    public void setIQ(String IQ) {
        this.IQ = IQ;
    }

//Overriding this would not work. Because the student class attributes are private and does not have getter methods.
    // so, we cant clone/copy student object and add IntelligentStudent attributes to it.
    // Now, How do we create the copy of the child Class ?? Answer : Using the copy constructor in both child and parent classes.

    /*public IntelligentStudent CloneMyObject(){

        Student st = super.clone;

        IntelligentStudent is = new IntelligentStudent();
        is.IQ = this.IQ;

        return  is;
    }*/

    public IntelligentStudent(){

    }

    public  IntelligentStudent(IntelligentStudent is){
        super(is);  // It will fill the attributes specific to parent
        this.IQ = is.IQ; // It will fill the attributes of its own.
    }

    public  IntelligentStudent CloneMyObject(IntelligentStudent is){
        return new IntelligentStudent(is);
    }

}

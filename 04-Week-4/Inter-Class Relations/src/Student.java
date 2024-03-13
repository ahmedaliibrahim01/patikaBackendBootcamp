public class Student {
    private String name;
    private String surName;
    private int studentNo;
    Course course;

    public Student(String name, String surName, int studentNo, Course course) {
        this.name = name;
        this.surName = surName;
        this.studentNo = studentNo;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getStudentNo() {
        if (studentNo < 0 || studentNo > 100){
            studentNo = 0;
        }
        return studentNo ;
    }

    public void setStudentNo(int studentNo) {
        if (studentNo < 0 || studentNo > 100){
            studentNo = 0;
        }
        this.studentNo = studentNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    void print(){
        System.out.println("\n<== Student İnformation ==>");
        System.out.println("Name : " + getName());
        System.out.println("Surname : " + getSurName());
        System.out.println("Student No : " + getStudentNo());
        System.out.println("Course Name : " + this.course.getName());
        System.out.println("Course Code : " + this.course.getCode());
        System.out.println("==========================");
    }
}

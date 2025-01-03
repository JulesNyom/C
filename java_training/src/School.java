public class School {
    
private int student;
private int[] course;

School (int student, int[] course) {
    this.course = course;
    this.student = student;
}

public int getStudent () {
    return student;
}
public void setStudent (int student) {
    this.student = student;
}

}

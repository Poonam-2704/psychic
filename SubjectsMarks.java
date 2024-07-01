class Subject{
    private String studId;
    private String name;
    private int maxMarks;
    private int marksObtains;
    public Subject(String studId,String name,int maxMarks){
        this.studId=studId;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getStudId(){return studId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtains;}
    public void setMaxMarks(int mm){
        maxMarks=mm;
    }
    public void setMarksObtain(int m){
        marksObtains=m;
    }
    boolean isQualified(){
        return marksObtains>=maxMarks/10*4;
    }
    public String toString(){
        return "\n SubjectId: "+studId+"\n Name: "+name+"\n MarksObtained: "+marksObtains;
    }
}
public class SubjectsMarks {
    public static void main(String[] args) {
        Subject sub[] = new Subject[3];
        sub[0]=new Subject("s101", "DS", 100);
        sub[1]=new Subject("s102", "Pyton", 100);
        sub[2]=new Subject("s103", "Java", 100);
        for(Subject s:sub)
            System.out.println(s);
    }
}

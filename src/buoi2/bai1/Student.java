package buoi2.bai1;

public class Student {
    String name;
    int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String xepLoai() {
        String xepLoai = "";
        if(score>=0 && score<=100){
            if(score>=0){
                xepLoai = "F";
            }else if(score>50){
                xepLoai = "D";
            }else if(score>65){
                xepLoai ="C";
            }else if(score>75){
                xepLoai = "B";
            }else{
                xepLoai = "A";
            }
        }
        return xepLoai;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

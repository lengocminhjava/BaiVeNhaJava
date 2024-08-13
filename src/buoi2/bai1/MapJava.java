package buoi2.bai1;

import java.util.*;

public class MapJava {
    private Map<String,List<String>> students = new HashMap<>();
    public static void main(String[] args) {
        MapJava maps = new MapJava();
        maps.addStudent("Hưng",1);
        maps.addStudent("Đức",52);
        maps.addStudent("Quý",66);
        maps.addStudent("Hà",76);
        maps.addStudent("Văn",87);
        maps.addStudent("Duy",87);
        maps.displayAllGrades();
        maps.getStudentsByGrade("A");

    }
    public void addStudent(String name, int score){
     String loai =  phanLoai(score);
     students.computeIfAbsent(loai, k -> new ArrayList<>()).add(name);
    }
    public void getStudentsByGrade(String grade){
        System.out.println(students.get(grade));
    }
    public void displayAllGrades(){
        System.out.println(students);
    }
    public String phanLoai(int score){
        String loai = "";
        if(score>=0 && score<=100){
            if(score>86){
                loai = "A";
            }else if(score>75){
                loai = "B";
            }else if(score>65){
                loai ="C";
            }else if(score>51){
                loai = "D";
            }else if(score>=0){
                loai = "F";
            }
        }
        return loai;
    }
}

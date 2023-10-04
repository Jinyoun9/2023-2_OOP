import java.util.Scanner;

class Student{
    int no, ph;
    String name, major;

    void setName(String name){
        this.name = name;
    }
    void setMajor(String major){
        this.major = major;
    }
    void setNo(int no){
        this.no = no;
    }
    void setPh(int ph){
        this.ph = ph;
    }
    int getNo(){
        return no;
    }
    String getPh(int ph){
        String phString = Integer.toString(ph);
        String phRevised="0";
        for(int i=0;i<phString.length();i++){
            if(i==2 || i==6){
                phRevised+="-";
            }
            phRevised += phString.charAt(i);

        }
        return phRevised;
    }
    String getName(){
        return name;
    }
    String getMajor(){
        return major;
    }

}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        int no, ph;
        String name, major;

        for(int i=0;i<3;i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            s[i] = new Student();
            no = sc.nextInt();
            name = sc.next();
            major = sc.next();
            ph = sc.nextInt();
            s[i].setName(name);
            s[i].setMajor(major);
            s[i].setNo(no);
            s[i].setPh(ph);
        }
        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for(int i=0;i<3;i++){
            System.out.printf("%d번째 학생: %d %s %s %s\n", i+1, s[i].getNo(), s[i].getName(), s[i].getMajor(),s[i].getPh(s[i].ph));
        }

    }
}
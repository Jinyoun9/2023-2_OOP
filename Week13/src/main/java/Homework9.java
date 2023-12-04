import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Homework9 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        String id, pw;
        int end = 0;
        try{
            Scanner sc = new Scanner(new FileInputStream("db.txt"));
            while(sc.hasNext()){
                id = sc.next().trim();
                pw = sc.next().trim();
                map.put(id, pw);
            }
        }
        catch (Exception e){
                throw new RuntimeException();
        }
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id : ");
            id = scanner.next().trim();
            if (map.containsKey(id)){
                System.out.print("password : ");
                pw = scanner.next().trim();
                if(pw.equals(map.get(id))){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    end = 1;
                }
                else{
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }
            else{
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
        }while(end == 0);
    }


}

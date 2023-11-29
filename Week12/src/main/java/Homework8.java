import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Homework8 {

    public static void main(String[] args) {
        Homework8 hw8 = new Homework8();
        Map<String, String> map = hw8.login();
        String id=null, pw=null;
        boolean idExist = false;
        do{
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            Scanner sc = new Scanner(System.in);
            id = sc.next().trim();
            for(Map.Entry<String, String> entry : map.entrySet()){
                if (id.equals(entry.getKey())){
                    idExist = true;
                    System.out.print("pw: ");
                    pw = sc.next().trim();
                    if (pw.equals(entry.getValue())){
                        System.out.println("id와 비밀번호가 일치합니다.");
                        return;
                    }
                    else{
                        System.out.println("id와 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                        break;
                    }
                }
            }
            if(!idExist){System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");}
        }while(id != pw);
    }

    Map<String, String> login() {
        Map<String, String> idpw = new HashMap<String, String>();
        idpw.put("myId", "myPass");
        idpw.put("myId2", "myPass2");
        idpw.put("myId3", "myPass3");
        return idpw;
    }
}

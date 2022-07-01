import dto.Item;
import dto.User;
import java.util.ArrayList;
import java.util.Scanner;

public class Del {
    private int id;
    Scanner sc;
    int i;
    public Del(){
        sc= new Scanner(System.in);
    }

    public void idel(){
        DB db = new DB();
        Item idto = new Item();
        System.out.printf("몇개의 아이템을 삭제하겠습니까?(최대 10개)%n" +
                "입력 : ");
        i= sc.nextInt();

            if (i <= 10) {
                System.out.println(i + "개를 삭제합니다");
                for (int a = 0; i > a; a++) {
                    System.out.print("삭제할 아이템 고유 번호 입력 : ");
                    id = sc.nextInt();

                    idto.setId(id);
                    db.deleteItem(idto);
                    db.getItem();
                }
            } else {
                System.out.println("그만큼의 아이템이 있지 않음");

            }

    }
    public void udel(){
        DB db = new DB();
        User udto = new User();
        System.out.printf("몇개의 캐릭을 삭제하겠습니까?(최대 10개)%n" +
                "입력 : ");
        i= sc.nextInt();

        if (i <= 10) {
            System.out.println(i + "개를 삭제합니다");
            for (int a = 0; i > a; a++) {
                System.out.print("삭제할 캐릭 고유 번호 입력 : ");
                id = sc.nextInt();

                udto.setId(id);
                db.deleteUser(udto);
                db.getUser();
            }
        } else {
            System.out.println("그만큼의 아이템이 있지 않음");

        }

    }

}

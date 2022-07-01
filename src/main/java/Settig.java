import java.util.Scanner;

public class Settig {
    DB db;
    Add ai;
    Scanner sc;
    Del di;

    public Settig(){
        sc= new Scanner(System.in);
        ai= new Add();
        db= new DB();
        di = new Del();
    }

    public int setgame() {
        for (; ; ) {
            int i;
            System.out.println("게임을 설정합니다.");
            System.out.printf("1. 캐릭터 설정%n" +
                    "2. 아이템 설정%n" +
                    "3. 몬스터 설정%n" +
                    "4. 돌아가기%n");
            System.out.print("선택 : ");
            i = sc.nextInt();
            if (i == 1) {
                user();
            } else if (i == 2) {
                item();
            } else if (i == 3) {
                mon();
            } else if (i == 4) {
                break;
            } else {
                System.out.println("님 눈 없?");
            }
        }

        return 0;
    }
    public void user(){
        for (; ; ) {
            System.out.printf("%n현재 있는 아이템 :%n");
            db.getUser();
            System.out.printf("%n1.추가 2.삭제 3.돌아가기%n" +
                    "선택 : ");
            int i = sc.nextInt();
            if (i == 1) {
                ai.setuser();;
            } else if (i == 2) {
                di.udel();
            } else if (i == 3) {
                break;
            } else {
                System.out.println("님 눈 없?");
            }
        }
    }
    public void item(){
        for (; ; ) {
            System.out.printf("%n현재 있는 아이템 :%n");
            db.getItem();
            System.out.printf("%n1.추가 2.삭제 3.돌아가기%n" +
                    "선택 : ");
            int i = sc.nextInt();
            if (i == 1) {
                ai.setItem();
            } else if (i == 2) {
                di.idel();
            } else if (i == 3) {
                break;
            } else {
                System.out.println("님 눈 없?");
            }
        }
    }
    public void mon(){
        for (; ; ) {
            System.out.printf("%n현재 있는 아이템 :%n");
            db.getItem();
            System.out.printf("%n1.추가 2.삭제 3.돌아가기%n" +
                    "선택 : ");
            int i = sc.nextInt();
            if (i == 1) {
                ai.setItem();
            } else if (i == 2) {
                di.idel();
            } else if (i == 3) {
                break;
            } else {
                System.out.println("님 눈 없?");
            }
        }
    }
}

import dto.Item;
import dto.User;

import java.util.Random;
import java.util.Scanner;



public class Main {
    static User udto= new User();







    public static  void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {

            System.out.printf("1. 개임 시작%n" +
                    "2. 개임 설정%n" +
                    "3. 개임 정보 보기%n" +
                    "4. 종료%n" +
                    "선택 :");

            int i = sc.nextInt();
            if (i == 1) {
                int hp = udto.getHp();
                System.out.println("공격받음");
                Random ran = new Random();
                int r= ran.nextInt(5);
                hp = hp-r;
                System.out.println(hp);
            } else if (i == 2) {
                Settig set = new Settig();
                set.setgame();
            } else if (i == 3) {

            } else if (i == 4) {
                break;
            } else {
                System.out.println("님 눈 없?");
            }


        }
    }


}

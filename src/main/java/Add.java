import dto.Item;
import dto.User;

import java.util.Scanner;

public class Add {
    private String name;
    private String att;
    private int dmg;
    private String eff;
    private int hp;
    private String job;
    private static Scanner sc;

    public Add() {
        sc = new Scanner(System.in);
    }
    public void setItem(){
        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("설명 입력 : ");
        att = sc.nextLine();
        System.out.print("데미지 입력 : ");
        dmg = sc.nextInt();
        sc.nextLine();
        System.out.print("효과 입력 : ");
        eff = sc.nextLine();

        Item idto = new Item();
        idto.setName(name);
        idto.setAtt(att);
        idto.setDmg(dmg);
        idto.setEff(eff);

        DB db = new DB();
        db.insertItem(idto);
        db.getItem();
    }
    public void setuser(){
        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("직업 입력 : ");
        job = sc.nextLine();
        System.out.print("채력 입력 : ");
        hp = sc.nextInt();
        sc.nextLine();

        User udto = new User();
        udto.setName(name);
        udto.setJob(job);
        udto.setHp(hp);


        DB db = new DB();
        db.insertUser(udto);
        db.getUser();
    }
}



package report;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member {
    private String name;
    private int age;
    private String email;
    private String address;

    public Member(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getInfo() {
        return name + "\t" + age + "\t" + email + "\t" + address;
    }
}

class MemberManager {
    private List<Member> memberList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void inputMembers(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("\n[" + i + "번째 회원 정보 입력]");
            System.out.print("이름: ");
            String name = sc.nextLine();

            int age = 0;
            while (true) {
                System.out.print("나이: ");
                try {
                    age = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력하세요.");
                }
            }

            System.out.print("이메일: ");
            String email = sc.nextLine();

            System.out.print("주소: ");
            String address = sc.nextLine();

            memberList.add(new Member(name, age, email, address));
            System.out.println("회원가입이 완료되었습니다.");
        }
    }

    public void printMembers() {
        if (memberList.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }

        System.out.println("\n--- 회원 목록 ---");
        for (Member m : memberList) {
            System.out.println(m.getInfo());
        }
    }
}

public class MemberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberManager manager = new MemberManager();

        while (true) {
            System.out.println("\n1. 회원가입");
            System.out.println("2. 회원 정보 출력");
            System.out.println("0. 종료");

            int choice = -1;
            while (true) {
                System.out.print("메뉴 선택: ");
                String input = sc.nextLine();

                try {
                    choice = Integer.parseInt(input);
                    if (choice < 0 || choice > 2) {
                        System.out.println("잘못된 입력입니다.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                }
            }

            switch (choice) {
                case 1:
                    int count = 0;
                    while (true) {
                        System.out.print("등록할 회원 수(2명 이상): ");
                        String cntInput = sc.nextLine();
                        try {
                            count = Integer.parseInt(cntInput);
                            if (count < 2) {
                                System.out.println("2명 이상 입력하세요.");
                                continue;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("숫자를 입력하세요.");
                        }
                    }
                    manager.inputMembers(count);
                    break;

                case 2:
                    manager.printMembers();
                    break;

                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
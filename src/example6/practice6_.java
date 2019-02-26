package example6;

import java.util.Random;
import java.util.Scanner;

public class practice6_ {
    public static void main(String[] args) {

//        multiplicationTable();
        electronicClock();
//        fortuneteller();
//        circumferenceRatio();
    }

    private static void circumferenceRatio() {
        System.out.println("====연습문제 6-4, 원주율구하기 프로그램====");
        System.out.println("던질 횟수를 입력해주세요");
        long tries = new Scanner(System.in).nextLong();
        int hits = 0;

        for (int i = 0; i < tries; i++) {
            double x = new Random().nextDouble();
            double y = new Random().nextDouble();
//            System.out.println(x);
//            System.out.println(y);
            if(Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0)) < 1){
                hits += 1;
            }
        }

        double piEstimate = (double)4 * hits / tries;
        System.out.println("PI의 에상값 : " + piEstimate);

    }


    private static void electronicClock() {
        System.out.println("====연습문제 6-3, 전자시계 프로그램====");
        String format = "%2d:%02d\t";
        for (int i = 0; i <60 ; i++) {
            for (int j = 1; j < 13 ; j++) {
                System.out.printf(String.format(format, j ,i , (i * j) ));
            }
            System.out.println();
        }
    }

    private static void multiplicationTable() {
        System.out.println("====연습문제 6-2, 구구단 프로그램====");
        String format = "%d * %d = %2d\t\t";
        for (int i = 1; i <10 ; i++) {
            for (int j = 2; j < 10 ; j++) {
                System.out.printf(String.format(format,j ,i , (i * j) ));
            }
            System.out.println();
        }
    }

    private static void fortuneteller() {
        System.out.println("====연습문제 , 점쟁이 프로그램====");
        System.out.println("점쟁이 집에 어서오세요");
        System.out.println("당신의 이름을 입력해 주세요");
        String name = new Scanner(System.in).nextLine();
        System.out.println("당신의 나이를 입력 해 주세요");
        String ageString = new Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new Random().nextInt(4);
        fortune += 1;
        System.out.println("점꾀의 결과가 나왔습니다!");
        System.out.println(age + "살의 " + name + "씨, 당신의 운세번호는 " +
                fortune + " 입니다.");
        System.out.println("1:대길 2:중길 3:길 4:흉");
    }


}

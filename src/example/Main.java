package example;

public class Main {

    public static void main(String[] args) {
        introduceOneself();
        System.out.println();
        email("aaa", "bbb@dfg.sdf", "dklfjsdjhfashfd");
        System.out.println();
        email("sss@sss.ddd", "dfadfkajfak");
        System.out.println();
        System.out.println("삼각형의 넓이는 : " + calcTriangleArea(5, 2.6) + "cm² 입니다.");
        System.out.println();
        System.out.println("원의 넓이는 : " + calcCircleArea(5) + "cm² 입니다");

    }

    public static void introduceOneself() {
        String name = "이선영";
        int age = 41;
        double height = 158.5;
        String gender = "여자";

        System.out.println("안녕하세요. 저는 " + name + "이라고 합니다.");
        System.out.println("저는 " + age + "살 이고 키는 " + height + "이고, 성별은 " + gender + " 입니다.");
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + title);
        System.out.println("본문 : " + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + " 에 아래의 메일을 송신한다.");
        System.out.println("제목 : 제목 없음");
        System.out.println("본문 : " + text);
//        email("제목 없음","sdf","dfsdfsdf");   코드의 중복을 막을수 있다.
    }

    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * Math.PI;
    }


}

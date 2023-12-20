package ex03;

class GugudanUtil {
    static void gugudan(int x) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
        System.out.println();
    }
}

public class GugudanEx04 {

    public static void main(String[] args) {

        // 구구단을 출력해주는 메서드
        // ex) GugudanUtil.gugudan(5);
        // GugudanUtil 클래스에 gugudan 정적 메서드를 호출하시오.
        // Parameter는 int 한개가 필요합니다.

        GugudanUtil.gugudan(9);
    }
}








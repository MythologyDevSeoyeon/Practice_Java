package Chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "명재현"; /* 문자열 자료형의 변수선언 String*/
        int hour = 15; /* 숫자형 자료_정수의 변수 선언 int */

        System.out.println(name + "님, 오늘 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다. ");

        double score = 90.5; /* 숫자형 자료_실수의 변수 선언 double */
        char grade = 'A'; /* 문자열 자료형의 한글자만사용시 변수 선언 char */
        name = "이상혁"; /* name 변수에 명재현이 있었는데, 이상혁을 다시 넣어줬기에, 이상혁으로 출력됨 */

        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println(name + "님은 성적에 만족 하셨을까요? " + pass );

    }
}

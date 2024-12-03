package Chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "명재현"; // 문자의 변수의 자료형 String
        int hour = 15; // 정수(숫자형 자료)의 변수의 자료형 선언 int 

        System.out.println(name + "님, 오늘 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다. ");

        double score = 90.5; // 실수(숫자형 자료)의 변수의 자료형 double 
        char grade = 'A'; // 한글자 문자의 변수의 자료형 char 
        name = "이상혁"; // name 변수에 명재현이 있었는데, 이상혁을 다시 넣어줬기에, 이상혁으로 출력됨 

        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println(name + "님은 성적에 만족 하셨을까요? " + pass );

        double d = 0.123456789;
        float f = 0.123456789F; // double 보다 작은 범위의 실수를 표현하는 변수의 자료형으로, 숫자 뒤에 F나, f를 입력해줘야 함
        System.out.println(d);
        System.out.println(f);

        int i = 1000000000;
        long l = 100000000000L; // int 보다 큰 범위의 정수를 표현하는 변수의 자료형으로, 숫자 뒤에 L이나, l을 입력해줘야 함
        l = 1_000_000_000l;
        System.out.println(l);

        // 변수의 자료형
        // String - 문자
        // char - 한 글자의 문자
        // int - 정수
        // long - int보다 큰 정수 + L or l
        // double - 실수
        // float - double 보다 작은 실수 + F or f
        // boolean - 참/거짓

    }
}

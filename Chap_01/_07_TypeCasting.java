package Chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 -> 실수형
        // 실수형 -> 정수형
    

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score);


        //float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98


        // 정수 + 실수 연산
        int a = 1;
        double b = 1.3;
        System.out.println((double) a+b); // 2.3

        score = 93 + (int)98.8;
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; // 191.8
        System.out.println(score_d);


        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // int 자료형인 score가 double로 자동으로 형변환 (191 -> 190.0)
        // (자동 형변환) int -> long -> float -> double
        int convertedScoreInt = (int) score_d; // double 자료형인 score_d가 int로 변환 시, 앞에 int 표기 (191.8 -> 191)
        // (수동 형변환) double -> float -> long -> int
        System.out.println(convertedScoreDouble); // 190.0
        System.out.println(convertedScoreInt);  // 191

        // 숫자를 문자열로 변환
        String s1 = String.valueOf(93); // String 클래스의 valueOf 기능을 사용 || 정수 -> 문자형 자료로 변환
        s1 = Integer.toString(93); // Integer 클래스의 toString 기능을 사용 || 정수 -> 문자형 자료로 변환
        System.out.println(s1);
        
        String s2 = String.valueOf(98.8); // String 클래스의 valueOf 기능을 사용 || 정수 -> 문자형 자료로 변환
        s2 = Double.toString(98.8); // Double 클래스의 toString 기능을 사용 || 정수 -> 문자형 자료로 변환
        System.out.println(s2);
        

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // int error = Integer.parseInt("자바");


    }
}
 
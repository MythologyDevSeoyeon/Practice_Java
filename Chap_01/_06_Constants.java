package Chap_01;

public class _06_Constants {
    //상수
    public static void main(String[] args) {
        
        // 변수 값 변경 가능
        String KR_COUNTRY_CODE = "+82"; // 절대 변하지 않는 국가 번호
        KR_COUNTRY_CODE = "+8282"; // 변경 시도
        System.out.println(KR_COUNTRY_CODE);

        // 변수 값 변경 불가능 = 상수
        final String KR_ULSAN_CODE= "052";
        // KR_ULSAN_CODE = "+052"; -> 변경 불가능 (에러 발생)
        System.out.println(KR_ULSAN_CODE); 

        // 상수는 대문자로만 변수이름 짓기
        final double PI = 3.141592; //원주율
        final String DATE_OF_BIRTH = "2000-01-01"; //생년월일

}
  
}

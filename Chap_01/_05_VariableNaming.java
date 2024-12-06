package Chap_01;
public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 첫 단어는 소문자로 시작, 다음 단어의 시작 글자는 대문자
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)
        
        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "상혁";
        String lastName = "이";
        int age = 26;
        String dateOfBirth = "2000-01-01";
        String purposeOfVisit = "관광";
        String flightNo_1 = "KE657";
        String _flight_no_2 = "VK234";
        int accompany = 2;
        int lenthOfStay = 3;
        String item_1 = "시계";
        String item_2 = "가방";
        
        // 프로그램의 흐름의 위해 사용되는 경우 (크게 이름이 중요하지 않을 때)
        int i =0;
        String s = "";
        String str = "";

        
        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";



    }
}

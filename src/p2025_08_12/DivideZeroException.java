public class DivideZeroException {
    public static void main( String[] args ) {
    	
	// int type의 변수 선언
 	int b = 20;
	int a = 0;

	try {
    // 두 수의 나눗셈 결과를 구한다
    int c = b / a;
    System.out.println(c);
  } catch (ArithmeticException e) {
    System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
  }

	int total = a + b;
	int sub = b-a;
	
   }
}


public class ExceptionEx04 {
    public static void main(String[] args){
        System.out.println("시작");
        
        System.out.println("1");
        int num1 = 0; 
        int num2 = 10;

        try{
            System.out.println("2");
            int result = num2 / num1;   // 여기서 예외발생
            // 예외발생하면 아래부분 실행 안함
            System.out.println("3");    
            System.out.println("결과 : " + result);
        }catch(ArithmeticException e) {
            System.out.println("4");
        }finally{
            System.out.println("5");
        }

        System.out.println("끝");
    }
}
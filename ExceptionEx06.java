public class ExceptionEx06 {
    public static void main(String[] args){
        try{
            // Exception 발생 가능 1
            String data1 = args[0];
            String data2 = args[1];

            // Exception 발생 가능 2
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;

            System.out.println(data1 + "+" + data2 + "=" + result);
        // Exception 1           
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println("[실행 방법]");
            System.out.println("java CatchByExceptionKindExample  num1   num2");
        // Exception 전부 처리
        }catch(Exception e){
            System.out.println("숫자로 변환할 수 없습니다.");
            
        
        }finally{
            System.out.println("다시 실행하세요.");
        }
    }
}


public class ExceptionEx07 {
    public void method1(int num ){
        System.out.println("시작");

        try{
            if(num < 100){
                // 강제 익셉션 발생
                throw new Exception("익셉션 발생");
            }
        }catch(Exception e){
            System.out.println("[익셉션]" + e.getMessage());
        }
    
        System.out.println("끝");
    }

    public void method2(int num) throws Exception {
        
        System.out.println("시작");

        if(num < 100){
            // 강제 익셉션 발생
            throw new Exception("익셉션 발생");
        }
        System.out.println("끝");
    }

    public static void main(String[] args){
        ExceptionEx07 e = new ExceptionEx07();
        e.method1(101);
        e.method1(10);

        try{
            e.method2(101);
        }catch(Exception e1){
            System.out.println("[익셉션]" + e1.getMessage());
        }
        
    }
}
import java.io.IOException;

public class ProcessBuilderEx02{
    public static void main(String[] args){
        try{
            ProcessBuilder processBuilder
                = new ProcessBuilder("C:\\Program Files \\ Internet Explorer\\iexplore");
            processBuilder.start(); // 여기서 발생할 수 있는 에러를
        }catch(IOException e){  // 여기서 처리
            System.out.println("[예외] : " + e.getMessage());
        }
    }
}
package 파일입출력;
import java.io.*;

public class ByteStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        //try catch도 지역변수처럼 내부에서 선언된 변수는 finally에서 사용될 수 없더라.
        try {
            fis = new FileInputStream("../123.jpg");  // 파일이라는 노드를 입력하는 통로
            fos = new FileOutputStream("dog-copy.jpg");
            
            int b;  // byte를 담는 바구니
            
            // 파일을 다 읽을 때까지
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("통로를 못찾았어!");
        } catch (IOException e) {
            System.out.println("파일 못찾았어!");
        } finally {
            // 통로를 닫자!
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("파일 닫을 때 오류 발생!");
            }
        }
    }
    
}
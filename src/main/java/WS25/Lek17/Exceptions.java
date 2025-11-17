package WS25.Lek17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {
/*      // 1. NumberFormatException: 숫자로 변환될 수 없는 형식의 문자열을 숫자로 변환하려고 시도할 때 발생
        String txt = "abc123";
        int value = Integer.parseInt(txt);
*/
/*
        // 2. ArrayIndexOutOfBoundsException: 배열의 유효한 인덱스 범위를 벗어난 인덱스로 배열 요소에 접근하려고 할 때 발생
        int[] values = {1,2,3};
        int num = values[3];
*/

/*        // 3. NullPointerException: null 값을 가진 참조 변수를 통해 객체의 멤버(메서드나 필드)에 접근하려고 할 때 발생
        String txt = null;
        int length = txt.length();
*/

/*        // 4. OutOfMemoryError: JVM(Java Virtual Machine)이 힙(Heap) 메모리 공간을 모두 사용하여 더 이상 객체를 할당할 수 없을 때 발생 (Exception X, Error)
        List<byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new byte[1024 * 1024]);
        }
*/

        // 5. FileNotFoundException: 입력/출력(I/O) 작업을 수행할 때 지정된 경로에 파일이 존재하지 않을 때 발생
/*
        try {
            File file = new File("./nonexistent.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
*/

/*        // 6. ArithmeticException: 보통 정수 나눗셈에서 0으로 나눌 때 발생
        int result = 3 / 0;
*/
    }

}

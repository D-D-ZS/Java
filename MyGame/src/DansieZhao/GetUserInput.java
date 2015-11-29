package DansieZhao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetUserInput {
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.println(prompt + " : ");
		try {
			/*从标准输入流System.in中直接读取使用者输入时
			System.in 输入一位读取一位；InputStreamReader将位获取类型转换为String类型；BufferedReader读取内容，对使用者输入的字符进行缓冲；
			readLine()方法在读取到使用者的换行字符时，再一次将整行字符串传入*/
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)
				return null;
//			

		} catch (IOException e){
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}

package DansieZhao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetUserInput {
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.println(prompt + " : ");
		try {
			/*�ӱ�׼������System.in��ֱ�Ӷ�ȡʹ��������ʱ
			System.in ����һλ��ȡһλ��InputStreamReader��λ��ȡ����ת��ΪString���ͣ�BufferedReader��ȡ���ݣ���ʹ����������ַ����л��壻
			readLine()�����ڶ�ȡ��ʹ���ߵĻ����ַ�ʱ����һ�ν������ַ�������*/
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

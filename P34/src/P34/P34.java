package P34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34 
{
	public static void main(String[] arg)throws IOException
	{
		System.out.println("Ոݔ��һ������");
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num= Integer.parseInt(str);
		
		System.out.println("��ݔ��Ĕ���"+num);
	}
}

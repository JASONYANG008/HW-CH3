package P37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P37
{
	public static void main(String[] arg)throws IOException
	{
		System.out.println("Ոݔ��Ӣ����ĸ");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		String stru= str.toUpperCase();
		String strl= str.toLowerCase();
		
		System.out.println("�D�Q�ɴ󌑕r��"+stru);
		System.out.println("�D�Q��С���r��"+strl);
	}
}

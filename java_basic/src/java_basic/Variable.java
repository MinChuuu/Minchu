package java_basic;

public class Variable {

	public static void main(String[] args) {
		
		byte b; //1byte = 8bit
		short s; //2byte
		int i; //4byte
		long l; //8byte
		char c; //2byte
		String str;
		
		//b = 127;
		b = Byte.MAX_VALUE;
		//s = 32767;
		s = Short.MAX_VALUE;
		//i = 2147483647;
		i = Integer.MAX_VALUE;
		//l = 9223372036854775807L;
		l = Long.MAX_VALUE;
		
		c = 'A';
		str = "\"�ȳ��ϼ���.\"\t�ݰ����ϴ�.\n�ȳ��ϼ���.";
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.printf("����: %c\n",c);
		System.out.println("����: " + (int)c);
		System.out.println(str);
		
	}

}

package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
		
		boolean status = true;
       System.out.println("Shahbaz - " + status);
       
       char gender = 'M';
       System.out.println("Gender - "+ gender );
       
       int age = 24;
       System.out.println("My Age is - "+ age);
       
       float n = 24.43f;
       System.out.println("float value -  "+ n);
       
       double s = 3.143434;
       System.out.println("Value of Pie is - "+ s);
       
       int i =100;
       long l = i;
       System.out.println("long value - "+ l);
       
       int o = (int) l;
       System.out.println("int value - "+o);
       
       char t = (char) i;
       System.out.println("char value - "+t);
       
       double d = 1346569.4644435;
       float r= (float)d;
       System.out.println("float value - "+r);
       System.out.println("double value - "+d);
       
       double d2 = 12554646465.49816316841;
       long l2 = (long)d2;
       int i2 = (int)l2;
       System.out.println("double value - "+d2);
       System.out.println("long value - "+l2);
       System.out.println("Int value - "+i2);
       
       float f=l;
       System.out.println("float value - "+f);
       
       byte b;
       int ii = 257;
       double dd = 323.142;
       System.out.println("Conversion of int to byte");
       b = (byte)ii;
       System.out.println("ii = "+ ii + " b = " +b);
       System.out.println("\nConversion of double to byte");
       
       b = (byte) dd;
       System.out.println("dd = " + dd + " b= " + b);
	}

}

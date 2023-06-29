
public class Brad31 {

	public static void main(String[] args) {
		String s1="Brad";//這時記憶體產生Brad 這個物件
		String s4 = s1;//這時s4,s1指向同個物件
		System.out.println(s1==s4);//是數相同物件
		String s2= s1.concat("iii");
		System.out.println(s1);
		System.out.println(s2);
		String s3=s1.replace('a','k' );//Br"a"d置換成k
		System.out.println(s3);
		
	}

}

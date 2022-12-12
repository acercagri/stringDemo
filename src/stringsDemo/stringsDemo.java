package stringsDemo;

import javax.naming.ldap.SortResponseControl;

public class stringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "dun okula gıttım";
		System.out.println(mesaj);
		System.out.println("eleman sayısı " + mesaj.length());
		System.out.println("5. eleman :" + mesaj.charAt(4));
		System.out.println(mesaj.concat(". bugun gıtmeyecegım"));
		System.out.println(mesaj.startsWith("a"));
		System.out.println(mesaj.endsWith("m"));
	    char[] karakterler = new char [8];
        mesaj.getChars(0, 8, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("o"));
        System.out.println(mesaj.lastIndexOf("ı"));
	}

}

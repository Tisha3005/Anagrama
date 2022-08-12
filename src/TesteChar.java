
public class TesteChar {

	
	public static void main(String[] args) {

		String stringA = "thais";
        String stringB = "tisha";
      
        char[] charArrayA = new char[stringA.length()];
        char[] charArrayB = new char[stringB.length()];
       
        for (int i = 0; i < stringA.length(); i++) {
            
        	charArrayA[i] = stringA.charAt(i);
        	charArrayB[i] = stringB.charAt(i);
        
        	System.out.print(charArrayA[i]);
        	System.out.println(charArrayB[i]);
        	//System.out.println(charArrayB[i]);
        }
    }
}




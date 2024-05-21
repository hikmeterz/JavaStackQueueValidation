import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		//Stack stack1=new Stack();
		//Stack stack2= new Stack();
		Scanner key = new Scanner(System.in);
		//System.out.println("Stringi giriniz:");
		String s = key.nextLine();
		
		String temp="";
		
		boolean tagDogruMu=true;
		boolean ayniTagVarMi=false;//tag kapatilmadan ayni tag acilma kotrolu....
		boolean aciliTagVarMi=false;
		Stack stack1;
		while(s.length()>0){
			
			temp= s.substring(s.indexOf('<'),s.indexOf('>')+1);//'>' isaretine kadar alicaz.Ama tempi de incelememiz gerekiyor.
			
			if(temp.charAt(1)!='/'){
				
				stack1= new Stack();
				while(true) {
					String value = stack.pop();
					if( !value.equals("") ) {
						stack1.push(value);
						if(value.equals(temp)) {
							aciliTagVarMi=true;
							break;
						}
					}else
						break;
				}
				if(aciliTagVarMi==true) {
					System.out.println("Yanlis, tag kapatilmadan ayni tag acilmis.");
					System.exit(0);
				}else {
					while(true) {
						String value = stack1.pop();
						if( !value.equals("") ) {
							stack.push(value);
						}else
							break;
				
					
					}
				}
				
				
				stack.push(temp);
				
				
			}else if(temp.charAt(1)=='/'){
			
				if(stack.peek().equals('<'+temp.substring(2))){
					stack.pop();//cikaricaz cunku o tag dogru bir sekilde kapandi.
					//stack1.pop();
					
				}else{
					tagDogruMu=false;
					break;
					
				}
				
			}
			
			
			s=s.substring(s.indexOf('>')+1);
			
			temp="";
			
			
			
		}
		
		if(tagDogruMu==false){
			
			
			while(true) {
				String value = stack.pop();
				if( !value.equals("") ) {
					if(value.equals('<'+temp.substring(2))) {
						System.out.println("Yanlis, tag farkli sirada kapatilmis.");
						ayniTagVarMi=true;
						break;
					}
				}else
					break;
			}
			if(ayniTagVarMi==false) {
				System.out.println("Yanlis, henuz acilmamis bir tag kapatilmis.");
				
			}
		}else if(tagDogruMu==true) {
			if(!(stack.peek().equals(""))) {
				System.out.println("Yanlis, kapatilmayan tag var.");
			}else
				System.out.println("Dogru.");
			
		}
		
		
	}
}
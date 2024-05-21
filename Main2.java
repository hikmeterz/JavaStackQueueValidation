import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Queue q1 = new Queue();
		//Queue q2 = new Queue();
		//Queue q3 = new Queue();

		
		//System.out.println("1.kuyrugu giriniz: ");
	
		String s = key.nextLine();
		
		int sinir_sayisi=0;
		int islem_sayisi=0;
		boolean kucukVarMi=false;
		sinir_sayisi=Integer.parseInt(s.substring(s.lastIndexOf(' ')+1));
		
		//System.out.println(sinir_sayisi);
		s=s.substring(0,s.lastIndexOf(" |"));
		//System.out.println(s+".");
		int eklenen_sayi=0;
		while(s.length()>0) {
			if(s.lastIndexOf(' ')>0) {
				eklenen_sayi=Integer.parseInt(s.substring(s.lastIndexOf(' ')+1));
				q1.enqueue(eklenen_sayi);
				s=s.substring(0,s.lastIndexOf(' '));
			}else {
				eklenen_sayi=Integer.parseInt(s.substring(0));
				q1.enqueue(eklenen_sayi);
				s="";
			}
			
		}
		
		
		
		
		
		
		
	}

}

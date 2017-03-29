package HW2;

public class Test {
	
	// Do not change anything in this class
	
	public static void main(String[] args) {
		
		int score = 0;
		
		Team t1 = new BasketballTeam("Bulls", 1966);
		Team t2 = new BasketballTeam("Lakers", 1946);
		Team t3 = new BasketballTeam("Celtics", 1946);
		
		BasketballPlayer b1 = new BasketballPlayer("Tim", 134, 205, t1, "Bigman");
		BasketballPlayer b2 = new BasketballPlayer("John", 109, 198, t1, "Guard");
		BasketballPlayer b3 = new BasketballPlayer("Kevin", 100, 189, t2, "Guard");
		BasketballPlayer b4 = new BasketballPlayer("Richard", 93, 185, t3, "Cornerman");
		BasketballPlayer b5 = new BasketballPlayer("Karl", 117, 198, t3, "Guard");
		BasketballPlayer b6 = new BasketballPlayer("David", 120, 200, t3, "Bigman");
		
		if (BasketballPlayer.getNumber() == 6) {
                    System.out.println("oyuncu sayısı kısım doğru");//+++++++++
			score += 10;
		}
		if (BasketballTeam.getNumber() == 3) {
                    System.out.println("takım sayısı kısım doğru");//++++++++++
			score += 10;
		}
		if (b2.equals(b5)) {System.out.println("oyuncuları kıyaslama equal  kısım doğru");//--------
			score += 20;
		}
		if (b3.toString().equals("Kevin@Lakers-H:189-W:100")) {System.out.println("oyuncuyu string yapma kısım doğru");//++++++
			score += 15;
		}
		if (t1.equals(t1)) { System.out.println("Aynı takım eşitmi t1-t1 kısım doğru"); //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			score += 20;
		}
		if (t1.toString().equals("Bulls/1966")) {System.out.println("takımların string karşılaştırması kısım doğru");//++++++++++
			score += 15;
		}
		if (b6.calculateBMI() == 30.0) {System.out.println("body mass index. kısım doğru");//+++++++++++++++++++++
			score += 10;
		}
				
		System.out.println("your grade is " + score);
                
                System.out.println(b3.toString());
               // System.out.println(b3.height+"  "+b3.name+" "+b3.position+"   "+b3.team+"   "+b3.weight);
               // System.out.println(b6.calculateBMI());
                
                
                //
                //Oyuncun toStringinde Takımın adını yazdıramadım
                
                
                
	}
	
}

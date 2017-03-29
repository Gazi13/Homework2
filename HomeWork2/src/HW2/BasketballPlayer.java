package HW2;

public class BasketballPlayer extends Player {

	protected Team team;
	protected String position;

	// Do not change anything in this method
	public static int getNumber() {
		return Player.number;
	}

	// Fill in the blanks. Do not forget to use the keyword "super"
	public BasketballPlayer(String name, int weight, int height, Team team,
						String position) {
            
            super(name,weight,height);
            this.team = team;
            this.position = position;

	}

	// Erase the content. Fill in the blanks. If heights and positions are equal, it returns true
         
	@Override
	public boolean equals(Object obj) {
        
            if(this.height==((BasketballPlayer) obj).height)
            {
                if(this.position==((BasketballPlayer) obj).position)
                {
                    return true;
                }
                else
                {
                    return false;  
                }
 
            }
            else
            {
                return false;
            }
           
        }
       /* public boolean equals(BasketballPlayer p1, BasketballPlayer p2){
            
            if(p1.height==p2.height)
            {
                if(p1.position.equals(p2.position))
                {
                    return true;
                }
                else
                    return true;
               
            }
            else
                return true;
        }*/

	// Erase the content.
	// Fill in the blanks. Format: [name]@[teamName]-H:[height]-W:[weight]
	// For example: Jim@Spurs-H:202-W:112
	@Override
	public String toString() {
            
            //BasketballPlayer(this.name+"@"+this.team+"-H:"+this.height+"-W:"+this.weight);
           
		return this.name+"@"+this.team.name+"-H:"+this.height+"-W:"+this.weight;

	}

	// Erase the content. Fill in the blanks. It calculates body mass index.
	public double calculateBMI() {
       
		return (this.weight/((this.height*0.01)*(this.height*0.01)));
	}
}

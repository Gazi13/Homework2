package HW2;

public class Team {

	protected String name;
	protected int foundationYear;
	public static int number;


	// Do not change anything in this method
	public String getName() {
		return name;
	}


	// Fill in the blanks. 
	public Team(String name, int foundationYear) {

            this.name = name;
            this.foundationYear = foundationYear;
         //@@@@@@@@@@BURASI DOLACAK@@@@@@@@@@@

	}
	// Erase the content. Fill in the blanks. If name and foundationYear are equal, it returns true
        @Override
	public boolean equals(Object obj) {
            
           if(this.name==((BasketballTeam)obj).name){
               if(this.foundationYear==((BasketballTeam)obj).foundationYear)
               {
                   return true;
                  
               }
               else{
                   return false;
               }
               
               
           }
           else{
               return false;
           }
             
            
        }                                               
	// Erase the content. Fill in the blanks. Format: [name]/[foundationYear]
	// For example: Lakers/1946
	@Override
	public String toString() {
            
            

		return this.name+"/"+this.foundationYear;

	}

		
		

}

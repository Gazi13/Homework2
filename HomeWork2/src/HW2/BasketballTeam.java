package HW2;

public class BasketballTeam extends Team{


    public BasketballTeam(String name, int foundationYear) {

        super(name,foundationYear);
        Team.number++;
       

    }
    // Erase the content. Fill in the blanks. It returns number.
    public static int getNumber() {
        //BURADA NE YAPACAĞIZ ??????????????????????????
        return Team.number;

    }

}

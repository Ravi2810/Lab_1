//student name -:Ravikumar purohit
//student number -: A00226683

//Die class

public class Die {

    private String Name;      // ..
    private int Sides;        // Variables
    private int SideUp;       // ..

//Normal cunstructor (without arguments)
    public Die() {
        Name = "d6";  //default name.
        Sides = 6;    //default number.
        roll();       //roll method for random side uo
    }

//One argument cunstructor
    public Die(int Sides) {
        this.Sides = Sides;
        Name = "d" + Sides;
        roll();
    }


//Two argument constructor
    public Die(int Sides, int SideUp) {
        this.Sides = Sides;
        Name = "d" + Sides;
        this.SideUp = SideUp;
    }

//cunstructor to get random value.
    public void roll() {
        SideUp = (int) (1 + Math.random() * Sides);
    }

    public String getName() {          //for name
        return Name;
    }

    public int getSides() {            //for side's number
        return Sides;
    }

    public int getSideUp() {           // for side up number
        return SideUp;
    }

    public void setSides(int Sides) {
        this.Sides = Sides;             // For set number of sides
        Name = "d6";
    }

    public void setSideUp(int SideUp) {
        this.SideUp = SideUp;                // for set side up.
    }
}

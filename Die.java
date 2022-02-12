public class Die {

    private String Name;
    private int Sides;
    private int SideUp;

    public Die() {
        Name = "d6";
        Sides = 6;
        roll();
    }

    public Die(int Sides) {
        this.Sides = Sides;
        Name = "d" + Sides;
        roll();
    }

    public Die(int Sides, int SideUp) {
        this.Sides = Sides;
        Name = "d" + Sides;
        this.SideUp = SideUp;
    }

    public void roll() {
        SideUp = (int) (1 + Math.random() * Sides);
    }

    public String getName() {
        return Name;
    }

    public int getSides() {
        return Sides;
    }

    public int getSideUp() {
        return SideUp;
    }

    public void setSides(int Sides) {
        this.Sides = Sides;
        Name = "d6";
    }

    public void setSideUp(int SideUp) {
        this.SideUp = SideUp;
    }
}

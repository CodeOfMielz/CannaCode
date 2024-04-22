public class Blunt extends Cannabis{
    int rolled;
    String wrap;

    public Blunt(String name, String type, int thc, int rolled, String wrap) {
        super(name, type, thc);
        this.rolled = rolled;
        this.wrap = wrap;
    }

    @Override
    public int getRolled() {
        return rolled;
    }

    public void setRolled(int rolled) {
        this.rolled = rolled;
    }

    public String getWrap() {
        return wrap;
    }
    public void setWrap(String wrap) {
        this.wrap = wrap;
    }

    public void smoke(){
        System.out.println("Looks like you've got " + rolled + " blunts of " + getStrainName() + " Rolled up in a " + wrap +"!" +
                " Cheers!");
    }
}


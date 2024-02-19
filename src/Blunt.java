public class Blunt extends MaryJane {
    int rolled;
    String wrap;

    public Blunt(String name, String type, int thc, int rolled, String wrap) {
        super(name, type, thc);
        this.rolled = rolled;
        this.wrap = wrap;
    }


    public int getRolled() {
        return rolled;
    }

    public String getWrap() {
        return wrap;
    }

    public void setRolled(int rolled) {
        this.rolled = rolled;
    }

    public void setWrap(String wrap) {
        this.wrap = wrap;
    }

    public void rollThatShit(){
        System.out.println("Looks like you've got " + rolled + " blunts of " + getName() + " Rolled up in a " + wrap +"!" +
                " Cheers!");
    }
}


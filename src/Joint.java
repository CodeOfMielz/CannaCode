public class Joint extends MaryJane {

    String bigOrSmall;
    int rolled;
    String hempOrPaper;
    public Joint(String name, String type, int thc, String bigOrSmall, int rolled, String hempOrPaper) {
        super(name, type, thc);
        this.bigOrSmall = bigOrSmall;
        this.rolled = rolled;
        this.hempOrPaper = hempOrPaper;
    }


    public String getBigOrSmall() {
        return bigOrSmall;
    }

    public int getRolled() {
        return rolled;
    }

    public String getHempOrPaper() {
        return hempOrPaper;
    }

    public void setRolled(int rolled) {
        this.rolled = rolled;
    }

    public void setBigOrSmall(String bigOrSmall) {
        this.bigOrSmall = bigOrSmall;
    }

    public void setHempOrPaper(String hempOrPaper) {
        this.hempOrPaper = hempOrPaper;
    }

    public void stuffThatShit(){
        System.out.println("Looks like you've got " + rolled + " joints of " + getName() + " rolled up in a "
                + bigOrSmall + " " + hempOrPaper + " joint!" +
                " Cheers!");
    }
}

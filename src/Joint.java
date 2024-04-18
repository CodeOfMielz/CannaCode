public class Joint extends Cannabis {

    String kingOrRegular;
    int rolled;
    String hempOrPaper;
    public Joint(String name, String type, int thc, String kingOrRegular, int rolled, String hempOrPaper) {
        super(name, type, thc);
        this.kingOrRegular = kingOrRegular;
        this.rolled = rolled;
        this.hempOrPaper = hempOrPaper;
    }


    public String getKingOrRegular() {
        return kingOrRegular;
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

    public void setKingOrRegular(String kingOrRegular) {
        this.kingOrRegular = kingOrRegular;
    }

    public void setHempOrPaper(String hempOrPaper) {
        this.hempOrPaper = hempOrPaper;
    }

    public void smoke(){
        System.out.println("Looks like you've got " + rolled + " joints of " + getStrainName() + " rolled up in a "
                + kingOrRegular + " " + hempOrPaper + " joint!" +
                " Cheers!");
    }
}

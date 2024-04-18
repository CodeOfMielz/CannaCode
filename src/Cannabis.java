public class Cannabis implements Smoke{

    private String strainName;
    private String indicaSativa;
    private int thcLevel;


    public Cannabis(String strainName, String indicaSativa, int thcLevel){
        this.strainName = strainName;
        this.indicaSativa = indicaSativa;
        this.thcLevel = thcLevel;
    }


    public int getThcLevel() {
        return thcLevel;
    }

    public String getIndicaSativa() {
        return indicaSativa;
    }

    public String getStrainName() {
        return strainName;
    }

    @Override
    public void smoke() {
        System.out.println(getStrainName() + getIndicaSativa() + getThcLevel());
    }

    @Override
    public int getRolled() {
        return 0;
    }

    @Override
    public void setRolled(int rolled) {

    }
}

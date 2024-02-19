public class MaryJane {

    private String name;
    private String type;
    private int thc;


    public MaryJane(String name, String type, int thc){
        this.name = name;
        this.type = type;
        this.thc = thc;
    }


    public int getThc() {
        return thc;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void smoke(){
        System.out.println("You're smoking on some " +name + " and shes a beautiful little " + type +
                ". You are gonna be STONED because " + name + " Has a THC level of " + thc + "!! Cheers!");
    }
}

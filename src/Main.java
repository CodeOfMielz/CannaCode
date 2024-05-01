import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        String filePathYes = "Yes.txt";
        ArrayList<String> yesLinesList = FileUtil.readFile(filePathYes);

        String filePathNo = "No.txt";
        ArrayList<String> noLinesList = FileUtil.readFile(filePathNo);

        Questions questions = new Questions();
        Scanner scanner = new Scanner(System.in);

        System.out.println(questions.getQuestion1());
        String name = scanner.nextLine();

        System.out.println(questions.getQuestion2());
        String type = scanner.nextLine();

        System.out.println(questions.getQuestion3());
        int thc = scanner.nextInt();
        scanner.nextLine();

        //Create a choice variable to ask the user whether on not they are smoking a blunt or joint
        System.out.println(questions.getQuestion4());
        String choice = scanner.nextLine();


        /* if statement checks to see whether the user enters yes or no
        various ways that the user can say yes or no.
         */

        if (noLinesList.contains(choice)) {
            Cannabis cannabis = new Cannabis(name, type, thc);
            cannabis.smoke();
        }

        if (yesLinesList.contains(choice)) {
            Scanner bj = new Scanner(System.in); //new scanner created for if statement

            /* A new variable is created from the user input called rolledUp,
            this will store the integer value of the amount rolled
            We will use this inside of the setRolled method
             */
            System.out.println(questions.getbQuestion1());
            int rolledUp = bj.nextInt(); //creates a variable to store the int value of amount rolled
            bj.nextLine();

            System.out.println(questions.getbQuestion2());
            String bOrJ = bj.nextLine();

            //if statement for if the user enters paper

            if (bOrJ.equalsIgnoreCase("joint")) {

                Scanner jScan = new Scanner(System.in);

                /* Creates a new Joint object and uses the name, type, thc, variables we set using the
                first set of questions. The rest of the parameters are empty as we will use new questions to
                get that info
                 */

                Joint joint = new Joint(name, type, thc, "", 0, "");

                System.out.println(questions.getjQuestion1());
                String bigOrSmall = jScan.nextLine();

                System.out.println(questions.getjQuestion3());
                String hempOrPaper = scanner.nextLine();

                //We set the empty parameters to the user input values

                joint.setKingOrRegular(bigOrSmall);
                joint.setRolled(rolledUp);
                joint.setHempOrPaper(hempOrPaper);

                //Method is used to print a statement showing the info the user input
                joint.smoke();

                //if statement for if the user enters rello

            } else if (bOrJ.equalsIgnoreCase("tobacco")) {
                Scanner bluntscan = new Scanner(System.in);

                /* Creates a new Blunt object and uses the name, type, thc, variables we set using the
                first set of questions. The rest of the parameters are empty as we will use new questions to
                get that info
                 */
                Blunt blunt = new Blunt(name, type, thc, 0, "");

                System.out.println(questions.getBquestion2_1());
                String wrap = bluntscan.nextLine();

                //We set the empty parameters to the user input values
                blunt.setRolled(rolledUp);
                blunt.setWrap(wrap);

                //Method is used to print a statement showing the info the user input
                blunt.smoke();

            }
        }
    }
}
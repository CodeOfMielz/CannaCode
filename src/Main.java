import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Create Questions that the user can answer, these will set the name, type, thc.

        String question1 = "What are you smokin' on tonight? ";
        String question2 = "Nice! Is that an indica or sativa? ";
        String question3 = "That's dank! What's the THC percentage?";
        String question4= "Do you know how many you have rolled? (Yes/No)";

        //Using questions to get info and set variables

        System.out.println(question1);
        String name = scanner.nextLine();

        System.out.println(question2);
        String type = scanner.nextLine();

        System.out.println(question3);
        int thc = scanner.nextInt();
        scanner.nextLine();

        //Create a choice variable to ask the user whether on not they are smoking a blunt or joint
        System.out.println(question4);
        String choice = scanner.nextLine();

        /* if statement checks to see whether the user enters yes or no
        various ways that the user can say yes or no.
         */

        if(choice.equalsIgnoreCase("No") ||
                choice.equalsIgnoreCase("Nope") ||
                choice.equalsIgnoreCase("N") ||
                choice.equalsIgnoreCase("Nah") ||
                choice.equalsIgnoreCase("Not really") ||
                choice.equalsIgnoreCase("Negative") ||
                choice.equalsIgnoreCase("Not at all") ||
                choice.equalsIgnoreCase("I'm afraid not") ||
                choice.equalsIgnoreCase("No way") ||
                choice.equalsIgnoreCase("Absolutely not") ||
                choice.equalsIgnoreCase("I disagree") ||
                choice.equalsIgnoreCase("I don't think so") ||
                choice.equalsIgnoreCase("Unfortunately, no") ||
                choice.equalsIgnoreCase("That's a negative") ||
                choice.equalsIgnoreCase("IDK") ||
                choice.equalsIgnoreCase("I don't know") ||
                choice.equalsIgnoreCase("Don't know")){

                MaryJane maryJane = new MaryJane(name, type, thc);
                maryJane.smoke();
        }

        if(choice.equalsIgnoreCase("Yes") ||
                choice.equalsIgnoreCase("Yeah") ||
                choice.equalsIgnoreCase("Yup") ||
                choice.equalsIgnoreCase("Yea") ||
                choice.equalsIgnoreCase("Hell yeah") ||
                choice.equalsIgnoreCase("Of course") ||
                choice.equalsIgnoreCase("Absolutely") ||
                choice.equalsIgnoreCase("Definitely") ||
                choice.equalsIgnoreCase("Certainly") ||
                choice.equalsIgnoreCase("Without a doubt") ||
                choice.equalsIgnoreCase("You bet")){

            Scanner bj = new Scanner(System.in); //new scanner created for if statement

            String bQuestion1 = "How many do you have rolled up?";
            String bQuestion2 = "Damn! Paper or Rello?";
            String bquestion2_1 = "What kind of rello are you rolling it in? ";

            /* A new variable is created from the user input called rolledUp,
            this will store the integer value of the amount rolled
            We will use this inside of the setRolled method
             */
            System.out.println(bQuestion1);
            int rolledUp = bj.nextInt(); //creates a variable to store the int value of amount rolled
            bj.nextLine();

            System.out.println(bQuestion2);
            String bOrJ =bj.nextLine();

            //if statement for if the user enters paper

            if(bOrJ.equals("paper")){

                Scanner jScan = new Scanner(System.in);

                /* Creates a new Joint object and uses the name, type, thc, variables we set using the
                first set of questions. The rest of the parameters are empty as we will use new questions to
                get that info
                 */

                Joint joint = new Joint(name, type, thc,"", 0, "");

                String jQuestion1 = "King Size or Regular Size?";
                String jQuestion3 = "Yummy, are you rolling it in hemp or paper?";

                System.out.println(jQuestion1);
                String bigOrSmall = jScan.nextLine();


                System.out.println(jQuestion3);
                String hempOrPaper = scanner.nextLine();

                //We set the empty parameters to the user input values
                joint.setBigOrSmall(bigOrSmall);
                joint.setRolled(rolledUp);
                joint.setHempOrPaper(hempOrPaper);

                //Method is used to print a statement showing the info the user input
                joint.stuffThatShit();

                //if statement for if the user enters rello

            } else if (bOrJ.equals("rello")) {
                Scanner bluntscan = new Scanner(System.in);

                /* Creates a new Blunt object and uses the name, type, thc, variables we set using the
                first set of questions. The rest of the parameters are empty as we will use new questions to
                get that info
                 */
                Blunt blunt = new Blunt(name, type, thc, 0, "");

                System.out.println(bquestion2_1);
                String wrap  = bluntscan.nextLine();

                //We set the empty parameters to the user input values
                blunt.setRolled(rolledUp);
                blunt.setWrap(wrap);

                //Method is used to print a statement showing the info the user input
                blunt.rollThatShit();

            }


        }

        }

    }
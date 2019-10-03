package final3;

public class Final3 {

    /**
     * Create an array of ten first names, and another array of ten last names.
     * Then, write a function that concatenates the first and last name, in all
     * caps. Use that function to create a new array that contains all ten full,
     * all caps, names.
     */
    public static void main(String[] args) {
        String[] firstNames = {"Anna", "Bob", "Carol", "Dean", "Evelyn", 
            "Frank", "Gary", "Howard", "Igor", "Judy"};
        String[] lastNames = {"Killroy", "Leeroy", "Meroy", "Neroy", "Ohroy",
            "Peroy", "Queroy", "Reroy", "Seroy", "Teroy"};
        
        String[] fullNames = concaps(firstNames, lastNames);
        
        for (String name : fullNames) {
            System.out.println(name);
        }
    }
    
    //Concatenate the first and last names, and make them all caps.
    public static String[] concaps(String[] firsts, String[] lasts) {
        String[] fulls = new String[firsts.length];
        for (int i=0; i<firsts.length; ++i) {
            fulls[i] = firsts[i].toUpperCase() + " " + lasts[i].toUpperCase();
        }
        return fulls;
    }
}

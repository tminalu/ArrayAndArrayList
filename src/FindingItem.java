public class FindingItem {
    public static void main(String[] args) {
        String[] names= {"John", "Gary", "Maria", "Beth"};

        //enhanced for loop to find values not an index
        for (String name:names) {
            if(name.equals("Maria")) {
                System.out.println("Maria is in the array");
                // stops at Maria from going to "Beth"
                break;
            }
        }

        // loop through array..for loop to find in an index not in a value
        for (int i=0; i<names.length; i++) {
            if (names[i].equals("Maria")){
                System.out.println("Maria is in the array!");
            }
        }
    }
}

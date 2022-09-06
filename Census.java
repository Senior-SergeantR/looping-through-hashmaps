package hashmaps;


import java.util.HashMap;

import java.util.Scanner;


public class Census {
    public static void main(String[] args) {


        HashMap<Integer,String> countries = new HashMap<>();

        countries.put(206139589, "Nigeria");
        countries.put(114983588, "Ethiopia");
        countries.put(102334404, "Egypt");
        countries.put(89561403, "DR Congo");
        countries.put(59308690, "South Africa");
        countries.put(59734218, "Tanzania");
        countries.put(53771296, "Kenya");
        countries.put(45741007, "Uganda");
        countries.put(43851044, "Algeria");
        countries.put(43849260, "Sudan");
        countries.put(36910560, "Morocco");
        countries.put(32866272, "Angola");
        countries.put(31072940, "Ghana");
        countries.put(31255435, "Mozambique");
        countries.put(27691018, "Madagascar");
        countries.put(26545863, "Cameroon");
        countries.put(24206644, "Niger");
        countries.put(20903273, "Burkina faso");
        countries.put(20250833, "Mali");
        countries.put(19129952, "Malawi");
        countries.put(18383955, "Zambia");
        countries.put(16743927, "Senegal");
        countries.put(16425864, "Chad");
        countries.put(15893222, "Somalia");
        countries.put(14862924, "Zimbabwe");
        countries.put(13132795, "Guinea");
        countries.put(12952218, "Rwanda");
        countries.put(12123200, "Benin");
        countries.put(11818619, "Tunisia");
        countries.put(11890784, "Burundi");
        countries.put(11193725, "South Sudan");

        Scanner  sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Welcome to our African countries database: ");
        System.out.println("=============================================");
        System.out.println("Choose what you wish to search for" +
                "\n1. Search country by Name:" +
                "\n2. Search country by population:" +
                "\n3. Exit program:");

        int entry = sc.nextInt();

        switch (entry) {
            case 1 -> {
                System.out.println("Enter the country's name: ");
                String name = sc.next();
                int found = 0;
                for (Integer i : countries.keySet()) {
                    if (name.equalsIgnoreCase(countries.get(i))) {

                        System.out.println(" Country == " + countries.get(i) + " Population == " + i);
                        found++;
                    }

                }
                System.out.println("it was found: " +found+ " times");
            }

            case 2 -> {
                System.out.println("Enter the Estimated population in Millions:");
                int population = sc.nextInt();

                    if(population >= 200_000_000) {
                        for (int i : countries.keySet()) {
//                            if(countries.keySet()>=200000000){
//                                System.out.println(i);
//                            }
                        }
                    }
                }

            case 3 -> System.exit(0);

            default -> System.out.println("Not a valid choice");
        }


    }
}

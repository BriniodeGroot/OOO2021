package wachtwoordapp;

import java.util.*;

public class WachtwoordApp {



    public static void main(String[] args) {
        //array met 5 usernamen
        String [] userNames_a = {"u1234567", "u7654321", "u1122334", "u1212123", "u4443332"};
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList(userNames_a));

        //TO DO Maak een collectie om per user al zijn wachtwoorden bij te houden
        Map<String , ArrayList<String>> wachtwoorden = new HashMap<>();
        for (String user: userNames_a) { wachtwoorden.put(user , new ArrayList<>()); }


        //deel1
        //ingeven van wachtwoorden van users
        Scanner scanner = new Scanner(System.in);
        String userName = "";
        System.out.println("Typ usernaam om wachtwoord toe te voegen (* = stoppen)");
        userName = scanner.nextLine();
        while (!userName.equals("*")) {
            // TO DO controleer of de user bestaat
            if(!wachtwoorden.containsKey(userName)) {
                System.out.println("user niet gevonden gevonden");
            }

	        else {
                System.out.println("Typ paswoord");
                String nieuwWachtwoord = scanner.nextLine();
                // TO DO indien het wachrwoord bij die user nog niet bestaat voeg het wachtwoord toe
                if(!wachtwoorden.get(userName).contains(nieuwWachtwoord)) {
                    wachtwoorden.get(userName).add(nieuwWachtwoord);
                    System.out.println(wachtwoorden.get(userName));
                    System.out.println("nieuw paswoord toevoegen gelukt");
                }
                else {
                    System.out.println("nieuw paswoord toevoegen niet gelukt - wachtwoord bestaat al");

            }

            }
            System.out.println("Typ usernaam om paswoord te setten/veranderen (* = stoppen)");
            userName = scanner.nextLine();
        }


	    scanner.close();

    //lijst van alle paswoorden per user
	    System.out.println("Lijst van wachtwoorden per user\n"+wachtwoorden.toString());


    //deel2
    //lijst van alle paswoorden van alle users samen geordend van langste naar kortste wachtswoord en bij gelijke lengte oplopend alfabetisch
    //TO DO    Maak de lijst met geordende wachtwoorden (wachtwoordenGeordend)
        ArrayList<String> wachtwoordenGeordend = new ArrayList<>();
        for (Object array:wachtwoorden.values().toArray()) {
           wachtwoordenGeordend.addAll((ArrayList<String>) array);
        }


        wachtwoordenGeordend.sort(new geordendwachtwoorden());
        System.out.println("Lijst van alle ingegeven wachtwoorden geordend van lang naar kort\n"+wachtwoordenGeordend.toString());
}
}

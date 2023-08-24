package SPNR;

import java.util.LinkedList;
import java.util.Scanner;

public class Pojistovna {

    private final LinkedList<Uzivatele> uzivatel = new LinkedList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void Run() {
        String volba = "";

        while (!volba.equals("5")) {
            System.out.println("------------------------------------------");
            System.out.println("--------   Databáze pojištěnců   ---------");
            System.out.println("----------------   MENU   ----------------");
            System.out.println("Vyberte jednu z možností");
            System.out.println("- 1 - Najdi pojištěnce");
            System.out.println("- 2 - Výpis všech pojištěnců ");
            System.out.println("- 3 - Vytvoř pojištěnce");
            System.out.println("- 4 - KONEC");
            System.out.println("Zadejte volbu:");
            volba = scanner.nextLine();

        switch (volba) {
                case "1" -> najdiUzivatele();
                case "2" -> vypisUzivatele();
                case "3" -> vytvorNovyUzivatel();
                case "4" -> System.exit(0);
                default -> System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");

            }
            }
        }
        private void najdiUzivatele() {
            System.out.println("------------------------------------------");
            System.out.println("Zadej jméno hledaného pojištěnce:");
            String hledaneJmeno = scanner.nextLine();
            System.out.println("Zadej příjmení hledaného pojištěnce:");
            String hledanePrijmeni = scanner.nextLine();
            for (Uzivatele uzivatel : uzivatel){
                if ((!uzivatel.getJmeno().startsWith(hledaneJmeno)) && ((!uzivatel.getPrijmeni().startsWith(hledanePrijmeni)))) {
                    System.out.println(hledaneJmeno  +  hledanePrijmeni);
                }
                ;
            }
    }

        private void vytvorNovyUzivatel() {
            System.out.println("------------------------------------------");
            System.out.println("Zadejte Jméno: ");
            System.out.println("------------------------------------------");
            String jmeno = scanner.nextLine();
            System.out.println("------------------------------------------");
            System.out.println("Zadejte Příjmení: ");
            System.out.println("------------------------------------------");
            String prijmeni = scanner.nextLine();
            System.out.println("------------------------------------------");
            System.out.println("Zadejte Věk: ");
            System.out.println("------------------------------------------");
            String vek = scanner.nextLine();
            System.out.println("------------------------------------------");
            System.out.println("Zadejte Telefoní číslo: ");
            System.out.println("------------------------------------------");
            String telefon = scanner.nextLine();

            Uzivatele uzivatele = new Uzivatele(jmeno, prijmeni, vek, telefon);
            uzivatel.add(uzivatele);

            System.out.println("------------------------------------------");
            System.out.println("Záznam pojištěnce byl vytvořen");
        }
        private void vypisUzivatele() {

            for (Uzivatele uzivatele : uzivatel)

                System.out.println(uzivatele);
        }
}






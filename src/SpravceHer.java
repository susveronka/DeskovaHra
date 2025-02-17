import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpravceHer {

    private List <Hra> hry = new ArrayList<>();



public void nactiZeSouboru(String soubor, String oddelovac){


    try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(soubor)))){
        while(scanner.hasNextLine()){
            String[] radek = scanner.nextLine().split(oddelovac);
            hry.add(parseHra(radek));
        }
    } catch(FileNotFoundException e){ throw new RuntimeException();

    }

}


private Hra parseHra(String[] radek) {
    String nazev = radek[0].trim();
    Boolean jeHraKoupena = Boolean.parseBoolean(radek[1].trim());
    int oblibenost = Integer.parseInt(radek[2].trim());
    return new Hra(nazev , jeHraKoupena, oblibenost);

}

public void zapisDoSouboru(String soubor, String oddelovac){
    try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(soubor)))){
        for(Hra hra: hry){
            String radek = hra.getNazev() + oddelovac + hra.getOblibenost() ;
            writer.println(radek);
        }
    } catch (RuntimeException | IOException e) {
        throw new RuntimeException(e);
    }
}

}

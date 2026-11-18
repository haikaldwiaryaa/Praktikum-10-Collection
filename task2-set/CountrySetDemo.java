import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class CountrySetDemo {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();

        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Indonesia"); // duplikat

        System.out.println(countries);
        System.out.println("Jumlah elemen = " + countries.size());

        System.out.println(countries.contains("Indonesia"));

        countries.remove("Japan");
        System.out.println(countries);
        System.out.println(countries.size());
        HashSet<String> countriesSet = new HashSet<String>();

        // Collections.sort(countriesSet);

        ArrayList<String> countriesList = new ArrayList<String>();
        countriesList.add("Japan");
        countriesList.add("Indonesia");
        countriesList.add("Malaysia");

        Collections.sort(countriesList);
        System.out.println(countriesList);

        ArrayList<String> sortedCountries = new ArrayList<>(countries);
        Collections.sort(sortedCountries);
        System.out.println(sortedCountries);
    }
}
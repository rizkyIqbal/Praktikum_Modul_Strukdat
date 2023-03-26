package Modul1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CobaTes {


    public static void main(String[] args) {
        String tes = "Nama";
        String regex = ".*\\d.*";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcherText = pattern.matcher(tes);

        Boolean textMatches = matcherText.matches();
        System.out.println(textMatches);
    }


}


public class Main {

    public static String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("TTTT"));
    }

}
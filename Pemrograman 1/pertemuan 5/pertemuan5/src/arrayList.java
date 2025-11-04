import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> isiDompet = new ArrayList<>();

        isiDompet.add("Foto");
        isiDompet.add("100000");
        isiDompet.add("Struk Belanja");
        isiDompet.add("50000");
        isiDompet.add("Kartu ATM");
        isiDompet.add("5000");
        isiDompet.add("2000");

        isiDompet.remove("Struk Belanja");

        System.out.println(isiDompet);
        System.out.println("Dompet berisi " + isiDompet.size() + " item");
    }
}

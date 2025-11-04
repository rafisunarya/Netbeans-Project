public class array2d {
    
    public static void main(String[] args) {
        String[][] dataMahasiswa = {
            {"Nayla", "Serpong"},
            {"Eki", "Ciputat"},
            {"Ade", "Bogor"},
            {"Faisal", "Jakarta"}
        };

        for(int i=0; i < dataMahasiswa.length; i++){
            System.out.println("==========================");
            System.out.println("Nama    : " + dataMahasiswa[i][0]);
            System.out.println("Alamat  : " + dataMahasiswa[i][1]);
            System.out.println("==========================");
        }
    }
}

package ZTasks.Practices.Encaps;

public class EncTester {
    public static void main(String[] args) {
        Enc enc=new Enc("Shavy", "Malabo", 1999);

        enc.setMake("Kamaz");
        enc.setModel("Yonoskioch");
        enc.setYear(1980);

        System.out.println(enc.getMake());
        System.out.println(enc.getModel());
        System.out.println(enc.getYear());


    }
}

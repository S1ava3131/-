public class sotrudnic {
    private String FIO;
    private String Dolzhnost;

    public void set_FIO (String FIO){
        this.FIO = FIO;
    }
    public void set_Dolznost (String Dolzhnost){
        this.Dolzhnost = Dolzhnost;
    }

    public String get_FIO() {
        return FIO;
    }
    public String get_Dolzhnost() {
        return Dolzhnost;
    }
    public sotrudnic (String FIO, String Dolznost) {
        this.FIO = FIO;
        this.Dolzhnost = Dolzhnost;
    }
    void take() {
        System.out.println("");
        System.out.println("Информация о клиенте:");
        System.out.println("ФИО - " + FIO);
        System.out.println("Должность - " + Dolzhnost);
        System.out.println("");
    }
    public sotrudnic (String FIO) {
        this.FIO = FIO;
    }
    public String tell() {
        return this.FIO;
    }
}

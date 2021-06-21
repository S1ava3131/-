 public class klient {
    private String FIO;
    private String telefon;
    private String adres;

    public void set_FIO (String FIO){
        this.FIO = FIO;
    }
    public void set_telefon (String telefon){
        this.telefon = telefon;
    }
    public void set_adres (String adres){
        this.adres = adres;
    }

    public String get_FIO() {
        return FIO;
    }
    public String get_telefon() {
        return telefon;
    }
    public String get_adres() {
        return adres;

    }
    public klient (String FIO, String telefon, String adres) {
        this.FIO = FIO;
        this.telefon = telefon;
        this.adres = adres;
    }
    void take() {
        System.out.println("");
        System.out.println("Информация о клиенте:");
        System.out.println("ФИО - " + FIO);
        System.out.println("Телефонный номер - " + telefon);
        System.out.println("Адрес - " + adres);
        System.out.println("");
    }
    public klient (String FIO) {
        this.FIO = FIO;
    }
    public String tell() {
        return this.FIO;
    }
}


public class putevka {
    private String cena;
    private String data_prebavania;
    private String strana_prebavania;
    private String otel;


    public void set_cena (String cena){
        this.cena = cena;
    }
    public void set_data_prebavania (String data_prebavania){
        this.data_prebavania = data_prebavania;
    }
    public void set_strana_prebavania (String strana_prebavania){
        this.strana_prebavania = strana_prebavania;
    }
    public void set_otel (String otel){
        this.otel = otel;
    }
    public String get_cena() {
        return cena;
    }
    public String get_data_prebavania() {
        return data_prebavania;
    }
    public String get_strana_prebavania() {
        return strana_prebavania;
    }
    public String get_otel() {
        return otel;
    }


    public putevka (String cena, String data_prebavania, String strana_prebavania,String otel) {
        this.cena = cena;
        this.data_prebavania = data_prebavania;
        this.strana_prebavania = strana_prebavania;
        this.otel = otel;
    }
    void output () {
        System.out.println("Информация о путёвке:");
        System.out.println("Цена - " + cena);
        System.out.println("Дата пребывания - " + data_prebavania);
        System.out.println("Страна пребывания - " + strana_prebavania);
        System.out.println("Отель  - " + otel);
        System.out.println("");
    }
    public putevka (String cena) {
        this.cena = cena;
    }
    public String say() {
        return cena;
    }
}

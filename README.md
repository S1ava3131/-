
учебная практика

public class Main
{
	public static void main(String[] args) {
	    klient pers = new klient("Левин Андрей Ярославович");
		putevka r = new putevka("Гватемала");
		System.out.println("Пассажир " + pers.tell() + " выбрал путёвку в Гватемалу " + r.say());
		klient k = new klient("Левин Андрей Ярославович", "+7 926 458-65-88", "zolotzya.ribka@mail.com");
		k.take();
		sotrudnic s = new sotrudnic("Овсянников Макар Михайлович","старший консультант");
		s.take();
	    putevka p = new putevka("17535 рублей", "2 июня", "Гватемала","Laguna Lodge Eco-Resort & Nature Reserve");
	    p.output();
	
	}
}  


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




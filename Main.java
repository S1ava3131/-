 public class Main
{
    public static void main(String[] args) {
        klient pers = new klient("Аккерман Леви Ярославович");
        putevka r = new putevka("Гватемала");
        System.out.println("Пассажир " + pers.tell() + " выбрал путёвку в Киото " + r.say());
        klient k = new klient("Аккерман Леви Ярославович", "+7 926 458-65-88", "leviackerman.@gmail.com");
        k.take();
        sotrudnic s = new sotrudnic("Овсянников Макар Михайлович","старший консультант");
        s.take();
        putevka p = new putevka ("28 179 рублей", "31 июня", " Киото,", "Miyako Kyoto Hotel Hahijo 3*");
        p.output();
    }
}

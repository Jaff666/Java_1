public class main {
    public static void main(String[] args) {
        TransformacjaString zdanie = new TransformacjaString();
        System.out.println(zdanie.usunZnaki("Ala ma kota $$$$", Znak.ZNAK_SPECJALNY));
        System.out.println(zdanie.pozostawZnaki("Ala ma kota $$$$", Znak.ZNAK_SPECJALNY));
        System.out.println(zdanie.podmienZnaki("Ala ma kota $$$$", Znak.ZNAK_SPECJALNY,"#"));
    }
}

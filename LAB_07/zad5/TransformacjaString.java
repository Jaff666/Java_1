import javax.print.DocFlavor.STRING;

public class TransformacjaString {
    protected Znak znak;
    private String tekst;
    private String podmien;
    
    TransformacjaString() {
        this.znak = znak;
        this.tekst = tekst;
        this.podmien = podmien;    
    }
    public String usunZnaki(String tekst, Znak znak) {
        String tekst1;
        switch(znak){
            case SAMOGLOSKA:
                tekst1 = tekst.replaceAll("[aiouey]", "");
                return tekst1;
            case SPOLGLOSKA:
                tekst1 =tekst.replaceAll("[^aiouey]", "");
                return tekst1;
            case SPACJA:
                tekst1 = tekst.replaceAll("[\\s]", "");
                return tekst1;
            case LICZBA:
                tekst1 =tekst.replaceAll("[1-9]", "");
                return tekst1;
            case ZNAK_SPECJALNY:
                tekst1 =tekst.replaceAll("[\\W]", "");
                return tekst1;
        }
        return "";
    }

    public String podmienZnaki(String tekst, Znak znak, String podmien) {
        String tekst1;
        switch(znak){
            case SAMOGLOSKA:
                tekst1=tekst.replaceAll("[aiouey]", podmien);
                return tekst1;
            case SPOLGLOSKA:
                tekst1=tekst.replaceAll("[^aiouey]", podmien);
                return tekst1;
            case SPACJA:
                tekst1=tekst.replaceAll("[\\s]", podmien);
                return tekst1;
            case LICZBA:
                tekst1=tekst.replaceAll("[1-9]", podmien);
                return tekst1;
            case ZNAK_SPECJALNY:
                tekst1=tekst.replaceAll("[\\W]", podmien);
                return tekst1;
        }
        return "";
    }
    public String pozostawZnaki(String tekst, Znak znak) {
        String tekst1;
        switch(znak){
            case SAMOGLOSKA:
                tekst1=tekst.replaceAll("[^aiouey]", "");
                return tekst1;
            case SPOLGLOSKA:
                tekst1=tekst.replaceAll("[aiouey]", "");
                return tekst1;
            case SPACJA:
                tekst1=tekst.replaceAll("[^\\s]", "");
                return tekst1;
            case LICZBA:
                tekst1=tekst.replaceAll("[^1-9]", "");
                return tekst1;
            case ZNAK_SPECJALNY:
                tekst1=tekst.replaceAll("[^\\W]", "");
                return tekst1;
        }
        return "";
    }
}

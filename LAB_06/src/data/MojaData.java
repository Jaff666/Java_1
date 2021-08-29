package data;

public class MojaData {
    private int number1;
    private int number2;
    private int number3;


    MojaData(int number1, int number2, int number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }
    protected String data1() {
        if(number1<10){
            return "0" + number1;
        }else
        {
            return "" + number1;
        }
    }

    protected String data2(){
        switch(number2){
            case 1:
                return "styczeń";
            case 2:
                return "luty";
            case 3:
                return "marzec";
            case 4:
                return "kwiecień";
            case 5:
                return "maj";
            case 6:
                return "czerwiec";
            case 7:
                return "lipiec";
            case 8:
                return "sierpień";
            case 9:
                return "wrzesień";
            case 10:
                return "październik";
            case 11:
                return "listopad";
            case 12:
                return "grudzień";
        }
        return "";
        
    }

    @Override
    public String toString(){
        //return number1 + "." + number2 + "." + number3;
        //return "" +  data1() +   "." + number2 + "." + number3;
        return  number2 +   "." + data2() + "." + number3;
    }
}

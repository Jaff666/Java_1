public class zad13 {
    public static void main(String[] args) {
        int nwd = nwd(100,15);
        System.out.println(nwd);
    }
    private static int nwd(int a, int b) {
        int nwd = 1;
        for (int i=2; i<a; i++){
            if (a%i==0 && b%i==0){
                nwd=i;
            }
        }
        return nwd;
    }
}



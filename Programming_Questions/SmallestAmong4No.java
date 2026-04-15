public class SmallestAmong4No{
    public static void main(String[] args) {
        int a = 20; int b=34; int c=211; int d = 3;
        int smallest=a;
        if(b<smallest)
            smallest=b;
        if(c<smallest)
            smallest=c;
        if(d<smallest)
            smallest=d;
        System.out.println(smallest);
    }
}
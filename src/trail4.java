public class trail4 {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        System.out.println(n1+" "+n2);
        for(int i=2;i<10;i++)
        {
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }//Fibonacci Series
}

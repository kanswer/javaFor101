public class test3{
    public static void main(String[] args) {
        t1 t = new t1();
        int[] c = new int[]{1,2,3};
        System.out.println(t.a(c));
    }
}
class t1{
    int a(int[] b){
        return b[0];
    }
}
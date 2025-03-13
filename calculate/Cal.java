public static cal{
    void add(int a, int b){
        int c=a+b;
        System.out.println(c); 
}
    void sub(int w, int q){
        int s=w-q;
        System.out.println(s);
}
    void multi(int x, int y){
        int z =x*y;
        System.out.println(z);
}
    void divd(int h, int g){
        int i =h/g;
        System.out.println(i);
}
public static void main(String args[]){
    cal tutu = new cal();
    tutu.add(11, 22);
    tutu.sub(44, 11);
   tutu.multi(22, 4);
    tutu.divd(99, 3);
}
}    
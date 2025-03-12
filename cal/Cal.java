public class Cal {
    void add (int x, int y){
        int z = x+y;
        System.out.println(z);
    }
        void sub (int a, int b){
            int c = a-b;
            System.out.println(c);
    }
            void multi (int r, int s){
                int g = r*s;
                System.out.println(g);
            }
                void divd (int m, int n){
                    int o = m/n;
                    System.out.println(o);
            }
    public static void main(String args[]){
    Cal huhh = new Cal();
    huhh.add(33,44);
    huhh.sub(55,11);
    huhh.multi(3,05);
    huhh.divd(75, 5);
    }
}
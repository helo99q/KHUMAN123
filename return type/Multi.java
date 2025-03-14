public class multi{
    int multi(int x, int y){
        int z =x*y;
        return z; 
    }
    public static void main(String args[]){
        multi changes = new multi();
        int j = changes.multi(11,2);
        System.out.println(j);
    }

}
public class add{
    int add(int a, int b){
        int c=a+b;
        return c; 
    }
    public static void main(String args[]){
        add van = new add();
        int l = van.add(33,55);
        System.out.println(l);
    }

}
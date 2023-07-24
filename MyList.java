public class MyList<E extends Number>{
    private Object[] data;
    private int index;
    public MyList(){
        data = (E[]) new Object[10];
        index = 0;
    }
    void add(E o){
        data[index] = o;
        index ++;
    }
    public void print(){
        for (int i=0; i<index; i++){
            System.out.printf("%s", data[i]);
        }
        System.out.println();
    }
}

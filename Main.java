public class Main {
    public static void main(String[] args) {
        MyList<Integer> list= new MyList<>();
        //MyList<Person> list2= new MyList();

        list.add(4);
        list.add(3);
        list.add(8);

        list.print();
    }
}
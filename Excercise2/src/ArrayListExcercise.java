import java.util.ArrayList;

public class ArrayListExcercise {
    static ArrayList<String> listname=new ArrayList<>();

    public static void main(String[] args) {
        listname.add("Prasanna");
        listname.add("Venkatesh");
        listname.add("Balaji");
        listname.add("Priya");
        listname.add("Loganathan");
        listname.add("Cauvery");

        ArrayListExcercise a=new ArrayListExcercise();
        a.display(listname);
        a.deletebypostion("Venkatesh");
        a.deletebyindex(1);

       // System.out.println(listname);
   }

    void display(ArrayList<String> names){
        for(String name:names){
            System.out.println(name);
        }}

        void deletebypostion(String position){
            listname.remove(position);
            System.out.println(listname);
        }
    void deletebyindex(int indx){
        listname.remove(indx);
        System.out.println(listname);
    }

}

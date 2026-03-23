import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Object> lista = new ArrayList<>();

        lista.add("Dinei");
        lista.add(123);
        lista.add(true);

        for(Object list : lista){
            System.out.println(list);
        }


        Set<Object> lista2 = new HashSet<>();

        lista2.addAll(lista);
        System.out.println(lista2);
    }
}
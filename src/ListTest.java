import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {
    public static void main(String [] args){
        LinkedList<String> friends = new LinkedList<>();

        friends.addLast("Kim");
        friends.addLast("Lee");
        friends.addLast("Park");
        friends.addLast("Jung");
        System.out.println(friends);

        ListIterator<String> iterator = friends.listIterator();
        iterator.next();
        iterator.next();

        iterator.add("Im");
        iterator.add("Dong");

        iterator.next();
        iterator.next();

        iterator.remove();

        System.out.println(friends);
    }
}

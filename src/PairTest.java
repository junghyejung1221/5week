public class PairTest {
    public static void main(String [] args){
        Pair<Integer, String> worldCup = new Pair<Integer,String>(2022,"Korea");

        System.out.println("World Cup "+worldCup.getFirst()+ " in " + worldCup.getSecond());
    }
}

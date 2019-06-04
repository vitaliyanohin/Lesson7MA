public class Application {

  public static void main(String[] args) throws Exception {

    Pair<Integer, String> pair = Pair.of(null, null);
    Integer i = pair.getFirst(); // 1
    String s = pair.getSecond(); // "hello"
    Pair<Integer, String> pair2 = Pair.of(null, null);
    boolean mustBeTrue = pair.equals(pair2); // true!
    boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
    System.out.println(mustBeTrue);
    System.out.println(mustAlsoBeTrue);
    Storage<Integer, String> storage = new Storage<>();
    storage.put(2, null);
    System.out.println(storage.get(2));
  }
}

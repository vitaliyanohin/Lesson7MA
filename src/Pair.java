public class Pair<T, V> {

  private T firstObject;
  private V secondObject;

  public static <T, V> Pair<T, V> of(T firstObject, V secondObject) {
    return new Pair<>(firstObject, secondObject);
  }

  public T getFirst() {
    return firstObject;
  }

  public V getSecond() {
    return secondObject;
  }

  private Pair(T firstObject, V secondObject) {
    this.firstObject = firstObject;
    this.secondObject = secondObject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    Pair<?, ?> pair = (Pair<?, ?>) o;
    if (this.firstObject == null || pair.firstObject == null || this.secondObject == null || pair.secondObject == null)
      return false;
    return this.firstObject == pair.firstObject & this.secondObject == pair.secondObject;
  }

  @Override
  public int hashCode() {
    Integer firstObjectToInteger;
    int result;
    if (this.firstObject != null & this.secondObject != null) {
      if (getFirst() instanceof Integer) {
        firstObjectToInteger = ((Integer) getFirst()).intValue();
      } else {
        firstObjectToInteger = 31 * getFirst().toString().length();
      }
      int secondObjectToInteger = getSecond().toString().length() * 31 * 100;
      result = 31 * (firstObjectToInteger * 100) + 31 * (secondObjectToInteger * 100);
      return result;
    }
    return 0;
  }
}

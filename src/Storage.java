public class Storage<T, V> {

  private T key;
  private V value;

  public void put(T key, V value) {
    this.setKey(key);
    this.setValue(value);
  }

  public V get(T key) throws KeyException {
    if (getKey() == key) {
      return getValue();
    } else {
      throw new KeyException("Такого ключа нет!");
    }
  }

  private T getKey() {
    return key;
  }

  private void setKey(T key) {
    this.key = key;
  }

  private V getValue() {
    return value;
  }

  private void setValue(V value) {
    this.value = value;
  }
}

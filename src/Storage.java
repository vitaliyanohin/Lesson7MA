public class Storage<T, V> {

  private T[] key;
  private V[] value;
  private int arraySize = 2;
  private int arrayIndexCounter;

  public Storage() {
    key = (T[]) new Object[arraySize];
    value = (V[]) new Object[arraySize];
  }

  public void put(T key, V value) {
    if (this.key.length == arrayIndexCounter) {
      arrayCopy();
    }
    this.key[arrayIndexCounter] = key;
    this.value[arrayIndexCounter] = value;
    arrayIndexCounter++;
  }

  public V get(T key) throws KeyException {
    for (int i = 0; i < this.key.length; i++) {
      if (this.key[i] == key) {
        return value[i];
      }
    }
    throw new KeyException("Key not found!");
  }

  private void arrayCopy() {
    arraySize = arraySize * 2;
    T[] key2 = (T[]) new Object[arraySize];
    V[] value2 = (V[]) new Object[arraySize];
    System.arraycopy(this.key, 0, key2, 0, this.key.length);
    System.arraycopy(this.value, 0, value2, 0, this.value.length);
    this.key = key2;
    this.value = value2;
  }
}

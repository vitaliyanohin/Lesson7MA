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
      arrayExpansion();
    }
    this.key[arrayIndexCounter] = key;
    this.value[arrayIndexCounter] = value;
    arrayIndexCounter++;
  }

  public V get(T key) {
    for (int i = 0; i < this.key.length; i++) {
      if (this.key[i] == key) {
        return value[i];
      }
    }
    return null;
  }

  private void arrayExpansion() {
    arraySize = arraySize * 2;
    T[] tempKey = (T[]) new Object[arraySize];
    V[] tempValue = (V[]) new Object[arraySize];
    System.arraycopy(this.key, 0, tempKey, 0, this.key.length);
    System.arraycopy(this.value, 0, tempValue, 0, this.value.length);
    this.key = tempKey;
    this.value = tempValue;
  }
}

package genericsexample;

public class Pair<K, V> {

    private K key;
    private V value;

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

}

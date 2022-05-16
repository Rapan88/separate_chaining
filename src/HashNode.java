public class HashNode<K, V> {
    public K key;
    public V value;
    public int HashCode;
    public HashNode<K, V> next;

    @Override
    public String toString() {
        return "HashNode{" +
                "key=" + key +
                ", value=" + value +
                ", HashCode=" + HashCode +
                ", next=" + next +
                '}';
    }

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        HashCode = hashCode;
    }
}

import java.util.*;

public class SlowMap<K,V> extends AbstractMap<K,V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	
	public V put(K key, V value) {
		V oldValue = get(key);
		if(!keys.contains(key)) {
			keys.add(key);
			values.add(value);
		} else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}

	public V get(Object key) {
		if(!keys.contains(key)) {
			return null;
		}
		return values.get(keys.indexOf(key));
	}

	public Set<Map.Entry<K,V>> entrySet() {
		Set<Map.Entry<K,V>> set = new HashSet<Map.Entry<K,V>>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while(ki.hasNext()) {
			set.add(new MapEntry<K,V>(ki.next(), vi.next()));
		}
		return set;
	}

	public static void main(String[] args) {
		SlowMap<String, String> m = new SlowMap<String, String>();
		m.put("one", "red");
		m.put("two", "blue");
		m.put("three", "white");
		System.out.println(m);
		System.out.println(m.get("one"));
		System.out.println(m.entrySet());
	}
}

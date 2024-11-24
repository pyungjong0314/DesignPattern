package TempleteMethod.Map;

import java.util.*;

public abstract class AbstractMap<K, V> {
    public V get(Object key) {
        Iterator<Entry<K,V>> i = entrySet().iterator();
        if (key==null) {
            while (i.hasNext()) {
                Entry<K,V> e = i.next();
                if (e.getKey()==null)
                    return e.getValue();
            }
        } else {
            while (i.hasNext()) {
                Entry<K,V> e = i.next();
                if (key.equals(e.getKey()))
                    return e.getValue();
            }
        }
        return null;
    }

    // 하위 클래스에서 구현해야 할 추상 메소드
    protected abstract Set<Entry<K, V>> entrySet();

    // 엔트리 인터페이스 정의
    public interface Entry<K, V> {
        K getKey();
        V getValue();
    }
}

package demo1;

import java.util.HashSet;
import java.util.Set;

public class names<String> {
    private Set<String> saxelebi = new HashSet<>();

    public void add(String name) {
        saxelebi.add(name);
    }

    @Override
    public java.lang.String toString() {
        return "Saxelebi ====> " + saxelebi;
    }
}

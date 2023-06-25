package framework;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Customer
        extends AbstractCollection<String> {

    private String name;
    private String item;

    public Customer(String name) {
        this.name = name;
        this.item = "hello";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayList<String>(List.of(this.name, this.item)).iterator();
    }

    @Override
    public int size() {
        return "%s%s".formatted(this.name, this.item).length();
    }
}

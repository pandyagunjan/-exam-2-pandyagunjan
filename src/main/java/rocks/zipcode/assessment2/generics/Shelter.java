package rocks.zipcode.assessment2.generics;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<p> implements Iterable<p>{
    ArrayList<p> sheltor;


    public Shelter() {
        sheltor = new ArrayList<>();
       // throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return sheltor.size();
    }

    public void add(Object object) {
        sheltor.add((p) object);
    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
        sheltor.remove(object);
    }

    public Object get(Integer index) {
        return sheltor.get(index);
    }

    public Integer getIndexOf(Object ageable) {
    return sheltor.indexOf(ageable);
    }

    @Override
    public Iterator<p> iterator() {
        return null;
    }
}
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
public class Shelter <p> implements Iterable <p>{
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

    public void add(p object) {
        sheltor.add(object);
    }

    public Boolean contains(p object) {
        return sheltor.contains(object);
    }

    public void remove(p object) {
        sheltor.remove(object);
    }

    public p get(Integer index) {
        return sheltor.get(index);
    }

    public Integer getIndexOf(p ageable) {
    return sheltor.indexOf(ageable);
    }

    @Override
    public Iterator<p> iterator() {
        return null;
    }
}
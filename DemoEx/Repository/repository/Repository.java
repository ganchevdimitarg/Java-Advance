package DemoEx.Repository.repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repository {
    private static final int DEF_ID_VALUE = -1;

    private Map<Integer, Person> data;
    private int id;

    public Repository() {
        this.data = new LinkedHashMap<>();
        this.id = Repository.DEF_ID_VALUE;
    }

    public int getId() {
        return id;
    }

    public void add(Person person) {
        this.id++;
        this.data.put(this.id, person);
    }

    public Person get(int id) {
        return this.data.get(id);
    }

    public boolean update(int id, Person newPersan) {
        if (!exists(id)) {
            return false;
        }
        this.data.put(id, newPersan);
        return true;

    }

    private boolean exists(int id) {
        return this.data.containsKey(id);
    }

    public boolean delete(int id) {
        if (!exists(id)) {
            return false;
        }
        this.data.remove(id);
        return true;
    }

    public int getCount() {
        return this.data.size();
    }
}

package OOP_Seminar_5.DZ_1.Service.Tree;

import java.util.Iterator;
import java.util.Map;

import OOP_Seminar_5.DZ_1.Entities.Human;

public class FTIterator<T extends Human> implements Iterator<T> {
    private int index;
    private Map<Integer, T> humans;

    public FTIterator(Map<Integer, T> humans) {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() {
        return index < humans.size();
    }

    @Override
    public T next() {
        return humans.get(index++);
    }

}

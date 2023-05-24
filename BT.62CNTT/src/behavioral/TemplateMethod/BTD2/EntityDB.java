package behavioral.TemplateMethod.BTD2;

import java.util.ArrayList;

public abstract class EntityDB<T> {
    ArrayList<T> list = new ArrayList();
    protected abstract  T findByID(int id);
    protected abstract int getId(T t);

    public boolean add(T t) {
        if(findByID(getId(t))==null)
        {
            list.add(t);
            return true;
        }
        return false;

    }
    public int update(T t) {
        T old = findByID(getId(t));
        if(old!=null)
        {
            int index = list.indexOf(old);
            list.set(index,t);
            return 1;
        }
        return 0;
    }

    public int delete(T t)
    {
        return deleteByID(getId(t));
    }

    public int deleteByID(int id)
    {
        T toDelete = findByID(id);
        if (toDelete!=null) {
            list.remove(toDelete);
            return 1;
        }
        return 0;
    }

    public void printInfo()
    {
        list.forEach((t) -> {
            System.out.println(t.toString());
        });
    }

}
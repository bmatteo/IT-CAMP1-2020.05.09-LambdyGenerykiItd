package pl.camp.it.generyki;

public class NonGenericClass {
    int count;
    Object object;

    public NonGenericClass(int count, Object object) {
        this.count = count;
        this.object = object;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

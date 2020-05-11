package pl.camp.it.generyki;

public class ExampleGenericClass<TYP, TYP2> {
    private int count;
    private TYP object;
    private TYP2 objecjt2;

    public ExampleGenericClass(int count, TYP object) {
        this.count = count;
        this.object = object;
        this.objecjt2 = null;
    }

    public ExampleGenericClass(int count, TYP object, TYP2 objecjt2) {
        this.count = count;
        this.object = object;
        this.objecjt2 = objecjt2;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TYP getObject() {
        return this.object;
    }

    public void setObject(TYP object) {
        this.object = object;
    }

    public TYP2 getObjecjt2() {
        return objecjt2;
    }

    public void setObjecjt2(TYP2 objecjt2) {
        this.objecjt2 = objecjt2;
    }
}

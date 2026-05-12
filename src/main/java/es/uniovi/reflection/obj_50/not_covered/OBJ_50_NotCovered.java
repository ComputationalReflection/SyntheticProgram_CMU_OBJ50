package es.uniovi.reflection.obj_50.not_covered;

import es.uniovi.reflection.obj_50.MutableMethodsSimpleList;

class MutableE {
    private int intVar;

    MutableE(int intVar) {
        this.intVar = intVar;
    }

    void setIntVar(int intVar) {
        this.intVar = intVar;
    }
}

public class OBJ_50_NotCovered {
    private final MutableMethodsSimpleList<String> stringListVar;
    private final MutableE instanceE;
    private final MutableMethodsSimpleList<Integer> returnedAndParam;

    public OBJ_50_NotCovered(MutableMethodsSimpleList<String> stringListVar,
                             MutableMethodsSimpleList<Integer> returnedAndParam) {
        this.stringListVar = stringListVar;
        this.returnedAndParam = returnedAndParam;
        this.instanceE = new MutableE(2);
        this.instanceE.setIntVar(8);
    }

    public MutableMethodsSimpleList<Integer> getReturnedAndParam() {
        return returnedAndParam;
    }

    public MutableMethodsSimpleList<String> getStringListVar() {
        return stringListVar;
    }

    public MutableE getInstanceE() {
        if (instanceE != null)
            return instanceE;
        else
            return new MutableE(0);
    }

    private static MutableMethodsSimpleList<String> getStaticList(){
       final MutableMethodsSimpleList local = new MutableMethodsSimpleList<>();
       return local;
    }
    public void removeInteger(MutableMethodsSimpleList<Integer> integerListVar) {
        integerListVar.remove(0);
    }

    public static void main(String[] args) {
        final OBJ_50_NotCovered obj = new OBJ_50_NotCovered(new MutableMethodsSimpleList<>(), null);
        obj.getStringListVar().add("str");
        obj.getInstanceE().setIntVar(8);
        getStaticList().add("staticStr");
        final OBJ_50_NotCovered obj2 = new OBJ_50_NotCovered(new MutableMethodsSimpleList<>(), null);
        obj2.removeInteger(obj2.getReturnedAndParam());

    }
}

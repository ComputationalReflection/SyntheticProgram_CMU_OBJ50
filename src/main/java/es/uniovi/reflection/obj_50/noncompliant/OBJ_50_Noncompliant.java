package es.uniovi.reflection.obj_50.noncompliant;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Calendar;

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

public class OBJ_50_Noncompliant {
    private final MutableMethodsSimpleList<String> stringListVar;
    public static final int[] intArrayVar = {1, 2, 3};

    private final MutableE instanceE;

    public OBJ_50_Noncompliant(MutableMethodsSimpleList<String> stringListVar) {
        this.stringListVar = stringListVar;
        this.instanceE = new MutableE(2);
        this.instanceE.setIntVar(8);
    }

    public void removeInteger(final MutableMethodsSimpleList<Integer> integerListVar){
        integerListVar.remove(0);
    }

    public static void main(String[] args) {
        final MutableE e = new MutableE(1);
        e.setIntVar(5);

        OBJ_50_Noncompliant.intArrayVar[0] = 0;
        final OBJ_50_Noncompliant obj = new OBJ_50_Noncompliant(new MutableMethodsSimpleList<>());
        obj.stringListVar.add("str");
        obj.instanceE.setIntVar(8);
    }
}

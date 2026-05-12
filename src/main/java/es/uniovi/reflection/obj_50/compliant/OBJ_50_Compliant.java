package es.uniovi.reflection.obj_50.compliant;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Calendar;

import es.uniovi.reflection.obj_50.InmutableMethodsSimpleList;

class InmutableE {
    private final int intVar;

    InmutableE(int intVar) {
        this.intVar = intVar;
    }
}

public class OBJ_50_Compliant {
    private final InmutableMethodsSimpleList<String> stringListVar;

    public static final int[] intArrayVar = {1, 2, 3};
    private final InmutableE instanceE;

    public OBJ_50_Compliant(InmutableMethodsSimpleList<String> stringListVar) {
        this.stringListVar = stringListVar;
        this.stringListVar.add("str");
        this.instanceE = new InmutableE(1);
    }

    public void removeInteger(final InmutableMethodsSimpleList<Integer> integerListVar){
        integerListVar.remove(0);
    }

    public static void main(String[] args) {
        final InmutableE e = new InmutableE(1);

        System.out.println("The first element is " + OBJ_50_Compliant.intArrayVar[0]);
    }
}

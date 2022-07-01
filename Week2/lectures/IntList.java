package Week2.lectures;

public class IntList{
    // fields of simple containers
    public int head;
    public IntList tail;

    // Constructor function (used to initialize new object)
    /** List cell containing (HEAD, TAIL).  */
    public IntList(int head, IntList tail){
        this.head = head;
        this.tail = tail;
    }

    public static void main(String[] args) {
        IntList P, Q, L;

        L = new IntList(3, null);
        Q = new IntList(42, null);
        P = new IntList(56, null);
        L.tail = Q;
        Q.tail = P;

        System.out.println(toString(L));
        IntList new_L1 = incrList1(L, 3);
        IntList new_L2 = incrList2(L, 3);
        System.out.println(toString(new_L1));
        System.out.println(toString(new_L2));
    }

    static IntList incrList1(IntList P, int n){
        if (P == null){
            return null;
        }else{
            return new IntList(P.head + n, incrList1(P.tail, n));
        }
    }

    static IntList incrList2(IntList P, int n){
        if (P == null){
            return null;
        }

        IntList cp1;
        cp1 = P;
        IntList result, cp2;
        result = cp2 = new IntList(P.head + n, null);
        
        while (cp1.tail != null){
            cp1 = cp1.tail;
            cp2.tail = new IntList(cp1.head + n, null);
            cp2 = cp2.tail;
        }

        return result;
    }

    static String toString(IntList P){
        IntList cp = P;
        String result = "[";
        while (cp != null){
            result += String.valueOf(cp.head) + " ";
            cp = cp.tail;
        }
        result += "]";
        
        return result;
    }
}
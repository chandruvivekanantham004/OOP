package Interface.nested;

public class B implements A.NestedInterface{
    @Override
    public boolean IsOdd(int n) {
        return (n&1)==1;
    }
}


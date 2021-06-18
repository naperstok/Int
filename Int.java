package Int;

class Int {

    private int n;

    Int ()
    {
        n = 0;
    }
    Int (int val) { n = val; }

    public void setInt (int val) {
        n = val;
    }

    public int getInt () {
        return n;
    }

    public void increment () {
        setInt(getInt() + 1);
    }

    public void decrement () {
       setInt(getInt() - 1);
    }

    public void add (Int num)
    {
        setInt(getInt() + num.getInt());
    }

    public void substract (Int num)
    {
        setInt(getInt() - num.getInt());
    }

    public String toString () {
        return " " + n;
    }

}



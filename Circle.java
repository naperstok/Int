package Int;

public class Circle {

    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1;

    }

    public boolean isInside (int x, int y) {
        int res = (int) Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        if(res <= r)
            return true;
        else return false;
    }

    public void zoom (int factor) {
        this.r = this.r * factor;
    }

    public String toString ()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle:\n" + "center: (" + this.x + "," + this.y + ")\n");
        sb.append("radius: " + this.r + "\n");
        String S = sb.toString();
        return S;
    }

}

package JoZeeGame;

public class IntPoint {
    private int x;
    private int y;

    public IntPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void addX(int add){
        this.x += add;
    }

    public void addY(int add){
        this.y += add;
    }
}

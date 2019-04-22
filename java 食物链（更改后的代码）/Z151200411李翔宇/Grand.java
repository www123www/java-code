package Animegai;


public class Grand extends Animalgai {
    private int x;
    private int y;

    Grand(String a, int l, int w) {
        super(a);
        this.SetBirthplace(l, w);
    }

	int getX() {
        return x;
    }

	void setX(int x) {
        this.x = x;
    }

	int getY() {
        return y;
    }

	void setY(int y) {
        this.y = y;
    }

	void SetBirthplace(int l, int w) {
        this.x = (int) (Math.random() * (l + 1) + 0);
        this.y = (int) (Math.random() * (w + 1) + 0);
    }
}
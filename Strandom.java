import java.util.Random;

public class Strandom {
    private Random rand;

    // Class Strandom
    public Strandom() {
        this.rand = new Random();
    }

    // method สุ่มเลขที่อยู่ตั้งแต่ start - end
    public int random(int start, int end) {
        return rand.nextInt(start, end + 1);
    }

    // method สุ่มเลขที่อยู่ตั้งแต่ start - (start * 100)
    public int randomstartx100(int start) {
        return rand.nextInt(100) * start;
    }

    // method สุ่มเลขที่อยู่ตั้งแต่ 0 - (end - 1)
    public int random0(int end) {
        return rand.nextInt(end + 0);
    }

    // method สุ่มเลขที่อยู๋ตั้งแต่ 0 - end
    public int random1(int end) {
        return rand.nextInt(end + 1);
    }
}
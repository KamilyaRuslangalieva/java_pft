public class Point {
    public double p1; //координаты точки p1(1;8)
    public double p2; //координаты точки p2(10;17)

    public double distance() {
        return Math.sqrt(this.p1 + this.p2);
    }
}
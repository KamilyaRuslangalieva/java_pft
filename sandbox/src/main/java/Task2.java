public class Task2 {
    public static void main(String[] args) {

        Point p= new Point();
        p.p1=Math.pow((10-1),2);
        p.p2=Math.pow((17-8),2);

        System.out.println("Расстояние между двумя точками p1 и p2" + "=" + distance(p));
    }


        public static double distance(Point p) {
            return Math.sqrt(p.p1+p.p2);
        }
}

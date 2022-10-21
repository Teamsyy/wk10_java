package int101.geometry;

import int101.geometry.Box3d;

public class boxMain {
    public static void main(String[] args) {

        testBox3d();

    }

    public static double testBox3d() {
        Box3d b1 = new Box3d(5.0, 5.0, 5.0,"red");
        Box3d b2 = new Box3d(10.0, 10.0, 10.0,"green");
        Box3d b3 = new Box3d(15.0, 15.0, 15.0,"black");
        System.out.println("b1 show width height depth = " + b1.toString());
        System.out.println("b2 show width height depth = " + b2.toString());
        System.out.println("b3 show width height depth = " + b3.toString());
        System.out.println("-----------------------------");
        System.out.println("b1 volume = " + b1.computeVolume());
        System.out.println("b2 volume = " + b2.computeVolume());
        System.out.println("b3 volume = " + b3.computeVolume());
        System.out.println("-----------------------------");
        System.out.println("b1 color = " + b1.getColor());
        System.out.println("b2 color = " + b2.getColor());
        System.out.println("b3 color = " + b3.getColor());
        System.out.println("-----------------------------");
        System.out.println("b1 can cover b2 = " + b1.canCover(b2));
        System.out.println("b1 can cover b3 = " + b1.canCover(b3));
        System.out.println("b2 can cover b1 = " + b2.canCover(b1));
        System.out.println("b2 can cover b3 = " + b2.canCover(b3));
        System.out.println("b3 can cover b1 = " + b3.canCover(b1));
        System.out.println("b3 can cover b2 = " + b3.canCover(b2));


        return 0;

    }
}

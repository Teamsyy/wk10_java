package int101.geometry;

import int101.geometry.Sphere;
import int101.geometry.Box3d;
public class sphereMain {
    public static void main(String[] args) {

        testSphere();

    }


    public static double testSphere() {
        Sphere s1 = new Sphere(5.0);
        Sphere s2 = new Sphere(10.0);
        
        s1.setColor("red");
        System.out.println("sphere color = " + s1.getColor());
        System.out.println("s1 volume = " + s1.getRadius());
        System.out.println("s2 volume = " + s2.getRadius());
        System.out.println("s2 volume = " + s2.computeVolume());
        System.out.println("Volume of Sphere 1 is :"+s1.computeVolume());
        System.out.println("Volume of Sphere 2 is :"+s2.computeVolume());
        System.out.println("Surface of Sphere 1 is :"+s1.computeSurface());
        System.out.println("Surface of Sphere 2 is :"+s2.computeSurface());
        System.out.println("S1 / S2 volume is :"+s1.compareVolume(s2));


        return 0;
    }

}

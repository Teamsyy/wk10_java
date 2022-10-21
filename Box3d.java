package int101.geometry;

public class Box3d {
    private double width;
    private double height;
    private double depth;

    private static String color;


    public Box3d(double width, double height, double depth , String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }
    public double computeVolume() {
        return width * height * depth;
    }


    public boolean canCover(Box3d b){
        boolean n ;
        if (n = (b.width >= this.width)&& (b.height >= this.height) && (b.depth >= this.depth)) n= true ;
            return n;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }



    public void setDepth(double depth) {
        this.depth = depth;
    }
        public String toString() {
            return "Box3d{" +
                    "width=" + width +
                    ", height=" + height +
                    ", depth=" + depth +
                    '}';
        }



    public static String getColor() {
        return color;
    }

        public static void setColor(String color) {
            Box3d.color = color;
        }



    }



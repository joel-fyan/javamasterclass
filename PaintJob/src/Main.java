import jdk.dynalink.beans.StaticClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Four param method:");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2) + " buckets. Expected -1");
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2) + " buckets. Expected 3");
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1) + " buckets. Expected 3");
        System.out.println();
        System.out.println("Three param method:");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5) + " buckets. Expected -1");
        System.out.println(getBucketCount(3.4, 2.1, 1.5) + " buckets. Expected 5");
        System.out.println(getBucketCount(7.25, 4.3, 2.35) + " buckets. Expected 14");
        System.out.println();
        System.out.println("Two param method:");
        System.out.println(getBucketCount(3.4, 1.5) + " buckets. Expected 3");
        System.out.println(getBucketCount(6.26, 2.2) + " buckets. Expected 3");
        System.out.println(getBucketCount(3.26, .75) + " buckets. Expected 5");
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if((width<=0 || height<=0 || areaPerBucket<=0) || extraBuckets < 0) {
            return -1;
        }

        double areaToPaint = width * height;

        return (int) (Math.ceil(areaToPaint / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <=0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) (Math.ceil(area / areaPerBucket));
    }
}

public class PaintJob {
    public static void main(String[] arguments) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(0.75,0.75,0.5,0));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.26,0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            int bucketNeeded = (int) Math.ceil(((width * height) - (extraBuckets * areaPerBucket)) / areaPerBucket);
            return bucketNeeded;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width<=0 || height<=0 || areaPerBucket<=0) {
            return -1;
        }
        int bucketNeeded = (int)Math.ceil((width * height) / areaPerBucket);
        return bucketNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area<=0 || areaPerBucket<=0) {
            return -1;
        }
        int bucketNeeded = (int)Math.ceil((area) / areaPerBucket);
        return bucketNeeded;
    }
}

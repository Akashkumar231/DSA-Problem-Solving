
/*
    278. First Bad Version
    You are a product manager and currently leading a team to develop a new product.
    Unfortunately, the latest version of your product fails the quality check.
    Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 */
/*
public class First_Bad_Version {

    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;


        while (low<=high){
            int mid = low + (high - low)/2;

            if (isBadVersion(mid)==false){
                low = mid + 1;
            }else {
                high = mid - 1;
            }

        }

        return low;

    }

    public static void main(String [] args){
    }
}
 */

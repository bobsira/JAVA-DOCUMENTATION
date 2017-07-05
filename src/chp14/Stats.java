package chp14;

/**
 * Created by bobsira on 7/5/17.
 * Stats attempts (unsuccessfully) to
 * create a generic class that can compute
 * the average of an array of numbers of
 * any given type
 * <p>
 * The class contains an error!
 */
//public class Stats<T> {
//    T[] nums; // nums is an array of type T
//
//    // Pass the constructor a reference to
//    // an array of type T.
//    Stats(T[] nums){
//        this.nums=nums;
//    }
//
//    // Return type double in all cases.
//    double average(){
//        double sum=0.0;
//        for (int i=0;i<nums.length;i++)
//            sum +=nums[i].doubleValue(); // Error
//
//        return sum / nums.length;
//    }
//}


/**
 * In this version of Stats, the type argument for
 * T must be either Number, or a class derived
 * from Number
 */
public class Stats<T extends Number> {
    T[] nums;  // array of Number or subclass

    // pass the constructor a reference to
    // an array of type Number or subclass
    Stats(T[] nums) {
        this.nums = nums;
    }

    // Return type double in all cases.
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }
}

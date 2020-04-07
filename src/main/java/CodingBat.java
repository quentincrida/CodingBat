import java.util.Arrays;

public class CodingBat {
    private String CodingBat;

    public CodingBat(String codingBat) {
        CodingBat = codingBat;
    }
    //    public int dateFashion(int you, int date) {
//        int dateFashion = 0;
//
//        if (you <= 2 || date <= 2) {
//            dateFashion = 0;
//        } else if (you >= 8 || date >= 8) {
//            dateFashion = 2;
//        } else {
//            dateFashion = 1;
//        }
//        return dateFashion;
//    }
//
//    public String alarmClock(int day, boolean vacation) {
//        String alarmClock = "";
//        if (!vacation && (day == 0 || day == 6)) {
//            return alarmClock = "10:00";
//        } else if (!vacation && (day >= 1 && day <= 5)) {
//            return alarmClock = "7:00";
//        } else {
//            alarmClock = "7:00";
//        }
//        if (vacation && (day >= 1 && day <= 5)) {
//            return alarmClock = "10:00";
//        } else {
//            if (vacation && (day == 0 || day == 6)) {
//                return alarmClock = "off";
//            }
//        }
//
//
//        return alarmClock;
//    }
//
//    public boolean love6(int a, int b) {
//        if ((a == 6) || (b == 6)) {
//            return true;
//        } else if ((Math.abs(a + b) == 6) || (Math.abs(a - b) == 6)) {
//            return true;
//        }
//             else if((Math.abs(a+b) == 6) || ((Math.abs(b-a) == 6))){
//                return true;
//            }
//            return false;
//        }
//
//
//    public boolean firstLast6(int[] nums) {
////        for( int i = 0; i > firstLast6().length(); i++){
//            if(nums[0] == 6 || nums[-1] == 6){
//                return true;
//            }
//            return false;
//        }
//    public int[] makePi() {
//        int[] makePi = new int[3];
//        makePi[0] = 3;
//        makePi[1] = 1;
//        makePi[2] = 4;
//        return makePi;
//    }
//
//    public boolean commonEnd(int[] a, int[] b) {
//        if(a.length >1 && b.length > 1) {
//
//            if(a[0] == b[0] && (a[a.length-1] == b[b.length-1])){
//                return true;
//            }
//
//            return false;
//        }
//
//        public int sum3(int[] nums) {
//            for(int i = 0; i < sum3.length; i++){
//                return sum3.sum();
//            }
//
//        }

//        public int bigDiff(int[] nums) {
//            int largestNum = nums[0];
//            int smallestNum = nums[0];
//            for(int i = 0; i < nums.length; i++){
//                if(nums[i] > largestNum){
//                    largestNum = nums[i];
//                } else {
//                    if(nums[i] < smallestNum) {
//                        smallestNum = nums[i];
//                    }
//                }
//
//            }
//            return largestNum - smallestNum;
//        }
//        }

//    public int bigDiff(int[] nums){
//       for(int i = 0; i < nums.length; i++){
//
//       }
//
//        return Math.max(nums[0], nums[-1]) - Math.min(nums[0], nums[-1]);
//
//    }

    //    public int centeredAverage(int[] nums) {
//        int total = 0;
//        int biggestNum = Integer.MIN_VALUE;
//        int smallestNum = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++){
//            total = total + nums[i];
//        }
//
//        int average = total/nums.length;
//
//        return average;
//}
//    public int centeredAverage(int[] nums) {
//        Arrays.sort(nums);
//        int total = 0;
////        int average = total / nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            return total = nums[i] - (nums[0] - nums[-1]);
//        }
//        int average = total / nums.lengt
//        return average;
//    }
//}
//    public String frontTimes(String str, int n) {
//        String front = str[indexOf(0,1,2)];
//        for(i = 0; i < n; i++){
//            front = front * n;
//        }
//        return front;
//    }

//    public int centeredAverage(int[] nums) {
//        Arrays.sort(nums);
//        int total = 0;
//
//        for (int i = 1; i < nums.length-1; i++) {
//            total = total + nums[i];
//        }
//
//        int average = total/nums.length;
//        return average;
//    }

//    public int sum13(int[] nums) {
//        int sum = 0;
//        for(int i = 0, i < nums.length; i++)){
//            if(nums[i] == 13){
//                return ((nums - 13) && ( nums[i+1] && nums[i-1]));
//            }
//            return sum = sum + nums[i];
//
//        }
//        return sum;


    //}
    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int total = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            total += nums[i];
        }
        int average = total / (nums.length - 2);

        return average;
    }

    //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }


//    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

    public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum = sum + nums[i];
            }

        }
        if (sum == 8) {
            return true;
        }
        return false;

    }





    //
}





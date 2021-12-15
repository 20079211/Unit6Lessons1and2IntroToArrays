import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = new int[6]; // nums.length = 6
    /*
    for(int i = 0; i < nums.length; i++) {
      nums[i] = 5*(i + 1);
      System.out.println(nums[i]);
    }*/ // populating an array with loops

    nums[0] = 5; // populating array indexes individually
    nums[1] = 10;
    nums[2] = 15;
    nums[3] = 20;
    nums[4] = 25;
    nums[5] = 30;
    //System.out.println(nums); // java garbage - memory address of array
    for(int i = 0; i < nums.length; i++) {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    System.out.println();
    // printing an array backwards
    for(int i = (nums.length-1); i >= 0; i--) {
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    // using array elements in a calculation
    int sum = nums[0] + nums[1];
    System.out.println("\nsum = " + sum);
    nums[5] = nums[5]*2;
    System.out.println("nums[5] = " + nums[5] + "\n");
    for(int i = 0; i<nums.length; i++) {
      nums[i] = (nums[i]/5);
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    System.out.println("\nnums2 array:");
    // initializing an array with data
    int[] nums2 = {5,10,15,20,25,30};
    for(int i = 0; i<nums2.length; i++) {
      nums2[i] = nums2[i] + 100;
      System.out.println("nums2[" + i + "] = " + nums2[i]);
    }

    String[] candy = new String[5];
    System.out.println("\nEnter your five favorite candies:");
    int index = 0;
    while(index<candy.length) {
      candy[index] = input.nextLine();
      System.out.println("candy[" + index + "] = " + candy[index]);
      index++;
    }
  }
}
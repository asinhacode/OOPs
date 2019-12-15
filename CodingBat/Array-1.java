// 1
public boolean firstLast6(int[] nums) {
  return nums[0] == 6 || nums[nums.length - 1] == 6;
}

// 2
public boolean sameFirstLast(int[] nums) { 
  return (nums.length != 0) && (nums[0] == nums[nums.length - 1]);
}

// 3
public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

// 4
public boolean commonEnd(int[] a, int[] b) {
  return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
}

// 5
public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}

// 6
public int[] rotateLeft3(int[] nums) {
  int[] left = {nums[1], nums[2], nums[0]};
  return left;
}

// 7
public int[] reverse3(int[] nums) {
  int[] reverse = {nums[2], nums[1], nums[0]};
  return reverse;
}

// 8
int large = 0;
  
  if(nums[0] > nums[nums.length - 1])
   large = nums[0];
    
  else
    large = nums[nums.length - 1];
    
   int[] largest = {large, large, large};

  return largest;
  
  // or
  
  public int[] maxEnd3(int[] nums) 
{
  int max = Math.max(nums[0], nums[nums.length - 1]);
  
  int[] maX = {max, max, max};
  return maX;
  
}

// 9
public int sum2(int[] nums) {
  if(nums.length == 0)
    return 0;
    
  else if (nums.length < 2)
    return nums[0];
    
  return nums[0] + nums[1];
}

// 10
public int[] middleWay(int[] a, int[] b) {
  int[] middle = {a[a.length / 2], b[b.length / 2]};
  
  return middle;
}

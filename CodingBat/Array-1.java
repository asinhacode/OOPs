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

// 11
public int[] makeEnds(int[] nums) 
{
  int[] two = new int[2];
  
    if(nums.length < 2)
    {
       two[0] = nums[0];
       two[1] = nums[0];
    }
    
    else
    {
      two[0] = nums[0];
      two[1] = nums[nums.length - 1];
    }
    
      return two;
}

// 12
public boolean has23(int[] nums) {
  
  int first = nums[0];
  int second = nums[1];
  
    return (first == 2 || first == 3 || second == 2 || second == 3);
}

// 13
public boolean no23(int[] nums) {
    int first = nums[0];
  int second = nums[1];
  
  return !(first == 2 || first == 3 || second == 2 || second == 3);
}

// 14
public int[] makeLast(int[] nums) {
  
  int[] twice = new int[nums.length * 2];
  twice[twice.length - 1] = nums[nums.length - 1];
  
    return twice;
}

// 15
public boolean double23(int[] nums) {
  
  if(nums.length < 2)
    return false;
    
  else
    return ( nums[0] == 2 && nums[1] == 2 ) || ( nums[0] == 3 && nums[1] == 3 );
  
}

// 16
public int[] fix23(int[] nums) {
  
  if(nums[0] == 2)
  {
    if(nums[1] == 3)
      nums[1] = 0;
  }
  
  if(nums[1] == 2)
  {
    if(nums[2] == 3)
      nums[2] = 0;
  }
  
  return nums;
  
}

// 17

public int start1(int[] a, int[] b) {
  int one = 0;
  
  if(a.length > 0)
  {
    if(a[0] == 1)
      one++;
  }
  
  if(b.length > 0)
  {
    if(b[0] == 1)
      one++;
  }
  
  return one;
  
  
}

// 18

public int[] biggerTwo(int[] a, int[] b) {
  
  int sumA = a[0] + a[1];
  int sumB = b[0] + b[1];
  
    if(sumB > sumA)
    {
      return b;
    }
    
    else
      return a;
  
}

// 19
public int[] makeMiddle(int[] nums) {
  
  int[] two = new int[2];
  
    two[0] = nums[nums.length / 2 - 1];
    two[1] = nums[nums.length / 2];
  
      return two;
}

// 20
public int[] plusTwo(int[] a, int[] b) { // add all elements from 2 arrays
  int[] ab = {a[0], a[1], b[0], b[1]};
  
  return ab;
}

// 21
public int[] swapEnds(int[] nums) { // switch first and last
  int temp = nums[0];
  nums[0] = nums[nums.length - 1];
  nums[nums.length - 1] = temp;
  
  return nums;
}

// 22
public int[] midThree(int[] nums) {
  int[] odd = new int[3];
  
  odd[0] = nums[nums.length / 2 - 1]; // middle left
  odd[1] = nums[nums.length / 2 ]; // middle
  odd[2] = nums[nums.length / 2 + 1]; // middle right

    return odd;
  
}

// 23
public int maxTriple(int[] nums) {
  int largest = nums[0]; // first
  
  if(largest < nums[nums.length / 2]) // middle
    largest = nums[nums.length / 2];
  
   if (largest < nums[nums.length - 1]) // last
    largest = nums[nums.length - 1];
    
    return largest;
}


// 24
public int[] frontPiece(int[] nums) {
  
  int[] two;
  
    if(nums.length == 0) // 0 length
    {
      two = new int[0];
      return two;
    }
  
    else if(nums.length == 1) // 1 length
    {
      two = new int[1];
      two[0] = nums[0];
    }
    
    else // 2 or more
    {
      two = new int[2];
      two[0] = nums[0];
      two[1] = nums[1];
    }
    
      return two;
  
}



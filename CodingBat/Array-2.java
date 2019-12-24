// 1
public int countEvens(int[] nums) {
  int even = 0;
  
  for(int i = 0 ; i < nums.length; i++)
  {
    if(nums[i] % 2 == 0)
    even++;
  }
  
    return even;
}

// 2
public int bigDiff(int[] num) {
  
  int min = num[0];
  int max = num[0];
  
    for(int i = 1; i < num.length; i++)
    {
      
      min = Math.min(min, num[i]);
      max = Math.max(max, num[i]);

    }
    
    return max - min;
}

// 3
public int centeredAverage(int[] num) 
{
  int min = num[0];
  int max = num[0];
  int sum = 0;
  
    for(int i = 0; i < num.length; i++)
    {
      sum += num[i];
      min = Math.min(min, num[i]);
      max = Math.max(max, num[i]);

    }
    
      sum  -= (min + max);
      return sum / (num.length - 2);
    
    
}

// 4

public int sum13(int[] nums) {
  int sum = 0;
  
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] == 13)
        i++;
        
      else
        sum += nums[i];
    }
    
          return sum;
}

// 5

public int sum67(int[] nums) 
{
  int sum = 0;
  
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] != 6)
      {
        sum += nums[i];
      }
      
      else
      {
        while(nums[i] != 7)
        i++;
      }
    }
    
    return sum;
}

// 6 

public boolean has22(int[] nums) 
{
  boolean two = false;
  
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] == 2)
      {
        if(++i < nums.length && nums[i] == 2)
          two = true;
      }
    }
    
    return two;
}

// 7
public boolean lucky13(int[] nums) 
{

  for(int i : nums)
  {
    if(i == 1 || i == 3)
    {
      return false;
    }
  }
  
  return true;
}

// 8
public boolean sum28(int[] nums) 
{
  int e = 0;
  
  for(int i: nums)
  {
    if(i == 2)
    {
      e += i;
    }
  }
  
  return e == 8;
}

// 9
public boolean more14(int[] nums) {
  int o = 0;
  int f = 0;
  
  for(int i : nums)
  {
    if(i == 1)
    o++;
    
    if(i == 4)
    f++;
  }
  
  return o > f;
}

// 10

public int[] fizzArray(int n) {
  
  // create an array with length n
  int[] neW = new int[n];
  
    for(int i = 0; i < n; i++)
    {
      neW[i] = i;
    }
  
      return neW;
  
}

// 11
public boolean only14(int[] nums) {
  
  boolean oneFour = true;
  
    for(int i : nums)
    {
      if(!(i == 1 || i == 4))
      return false;
    }
    
      return oneFour;
}

// 12
public String[] fizzArray2(int n) {
  
  String[] fizz = new String[n];
  
    for(int i = 0; i < n; i++)
    {
      fizz[i] = String.valueOf(i);
    }
    
      return fizz;
  
}

// 13
public boolean no14(int[] nums) 
{
  boolean one = true, four = true;
  
  for(int i : nums)
  {
    if(i == 1)
    one = false;
    
    else if( i == 4)
    four = false;
    
  }
  
  return one || four;
}

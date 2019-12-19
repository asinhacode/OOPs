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


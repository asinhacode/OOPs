public boolean cigarParty(int cigars, boolean isWeekend) {
  
  if(isWeekend)
    return cigars > 39;
    
  else
    return cigars > 39 && cigars < 61;
}

public int dateFashion(int you, int date) {
  
  if(you < 3 || date < 3){
    return 0;
  }
  
  else if(you > 7 || date > 7)
    return 2;
  
  else
  return 1;
}

public boolean squirrelPlay(int temp, boolean isSummer) {
  
  if(isSummer)
  return temp > 59 && temp < 101;
  
  return temp > 59 && temp < 91;

  
}

public int caughtSpeeding(int speed, boolean isBirthday) {
  
  int five = 0;
  
  if(isBirthday)
  {
    five = 5;
  }
  
  if(speed < (61 + five))
    return 0;
    
  else if(speed < (81 + five))
    return 1;
    
  else
    return 2;
}

public int sortaSum(int a, int b) {
  int sum = a + b;
  
  if(sum > 9 && sum < 21)
  return 20;
  
  else
  return sum;
}

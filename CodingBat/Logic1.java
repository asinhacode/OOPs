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

public String alarmClock(int day, boolean vacation) {
  
  if(vacation)
  {
    if(day == 6 || day == 0)
    return "off";
    
    else
    return "10:00";
  }
  
  else
  {
    if(day == 6 || day == 0)
    return "10:00";
    
    else
    return "7:00";
  }
}


public boolean love6(int a, int b) {
  
  return (a == 6 || b == 6 || a + b == 6 || (Math.abs(a - b) == 6));
  
}

public boolean in1To10(int n, boolean outsideMode) {
  return (outsideMode) ? (n <= 1 || n >= 10) : (n > 0 && n < 11);
}

public boolean specialEleven(int n) { 
  return (n % 11 == 0 || n % 11 == 1); 
}

public boolean more20(int n) {
  
  return (n % 20 == 1) || (n % 20 == 2);
}

public boolean old35(int n) {
  
  return ((n % 5 == 0) != (n % 3 == 0));
  
}

public boolean less20(int n) {
  
  return (n % 20 == 18) || (n % 20 == 19);
}


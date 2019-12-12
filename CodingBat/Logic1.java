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


public boolean nearTen(int num) {
  int nearTen = num % 10;
  
  return nearTen == 2 || nearTen == 1 || nearTen == 0 || nearTen == 8 || nearTen == 9;
    //return nearTen < 3 ||  nearTen == 8 || nearTen == 9;

}

public int teenSum(int a, int b) {
  
  if ( (a > 12 && a < 20) || (b > 12 && b < 20) ) return 19;

  return a + b;
}

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
  if(isAsleep)
  return false;
  
  if(isMorning)
  return isMom;
  
  return true;
}


public boolean lastDigit(int a, int b, int c) {
  // get last digit
  int A = a % 10;
  int B = b % 10;
  int C = c % 10;
  
  return A == B || A == C || B == C;
}

public boolean lessBy10(int a, int b, int c) {
  
  int A = Math.abs(a - b);
  int B = Math.abs(b - c);
  int C = Math.abs(a - c);
  
  return (A > 9 || B > 9 || C > 9);
}

public int withoutDoubles(int die1, int die2, boolean noDoubles) 
{
  if(noDoubles)
  {
    if(die1 == die2) // same value
    {
      ++die1;
      
      if(die1 == 7) // wrap aound to 1 when over 6
      die1 = 1;
    }
  }
      return die1 + die2;
  }

public int maxMod5(int a, int b) 
{
  if(a == b)
  return 0;
  
  else if(a % 5 == b % 5)
  return Math.min(a,b);
  
  else
  return Math.max(a,b);

}

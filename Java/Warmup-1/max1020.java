// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

// max1020(11, 19) → 19
// max1020(19, 11) → 19
// max1020(11, 9) → 11

public int max1020(int a, int b) {
    int check1 = 0, check2 = 0;
    
    if(a >= 10 && a <= 20){
      check1 = 1;
    }
    
    if(b >= 10 && b<= 20){
      check2 = 1;  
    }
    
    if(check1 == 1 && check2 == 1){
      if(a > b){
        return a;
      }
      else{
        return b;
      }
    }
    
    else if(check1 == 0 && check2 == 1){
      return b;
    }
    
    else if(check1 == 1 && check2 == 0){
      return a;
    }
    
    return 0;
  }
  
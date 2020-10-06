/*
Given 2 int values, return true if one is negative and one is positive. 
Except if the parameter "negative" is true, 
then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */

//version 1
public boolean posNeg(int a, int b, boolean negative) {
    if(!negative){
      if((a < 0 && b > 0) || (a > 0 && b < 0)){
      return true;
      }  
    }
    
    else if(a < 0 && b < 0 && negative){
      return true;
    }
    return false;
  }

  //version 2
public boolean posNeg(int a, int b, bollean negative){
    if(!negative){
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
    else{
        return (a < 0 && b < 0);
    }
}  
  
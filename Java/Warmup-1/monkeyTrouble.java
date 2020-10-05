/*
 * We have two monkeys, a and b, 
 * and the parameters aSmile and bSmile indicate if each is smiling. 
 * We are in trouble if they are both smiling or if neither of them is smiling. 
 * Return true if we are in trouble.
 * 
 * monkeyTrouble(true, true) → true
 * monkeyTrouble(false, false) → true
 * monkeyTrouble(true, false) → false
 */

 //version 1
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if(aSmile && bSmile) return true;
    else if(!aSmile && !bSmile) return true;
    else if((aSmile && !bSmile) || (!aSmile && bSmile)) return false;
  
    return true;
    }

//version 2
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if(aSmile && bSmile) return true;
    else if(!aSmile && !bSmile) return true;
    
    return false;
    }

//version 3
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    
    return (aSmile == bSmile);
    }
    


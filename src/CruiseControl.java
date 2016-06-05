// This implements the controller as it stood before the 
// acceleration error was reported. Can you fix it? 
import java.io.*; 
public class CruiseControl { 
// Inputs 
public static final int on = 1; 
public static final int set = 2; 
public static final int brake = 3; 
public static final int accP = 4; 
public static final int accR = 5; 
public static final int resume = 6; 
public static final int correct = 7; 
public static final int slow = 8; 
public static final int fast = 9; 
// Outputs 
public static final int store = 10; 
public static final int inc = 11; 
public static final int dec = 12; 
// States 
public static final int OFF = 13; 
public static final int READY = 14; 
public static final int SET = 15; 
public static final int WAIT = 16; 
public static final int ACC = 17; 

public static void main(String[] args) throws IOException { 
// Initialise Keyboard Input 
BufferedReader keyboard = 
new BufferedReader(new InputStreamReader(System.in)); 
int input = 0; 
int output = 0; 
int state = OFF; // Initial State 
// Repeat Forever 
while(true) { 
// Display Current State 
switch(state) { 
case OFF: System.out.println("State: OFF"); break; 
case READY: System.out.println("State: READY"); break; 
case SET: System.out.println("State: SET"); break; 
case WAIT: System.out.println("State: WAIT"); break; 
case ACC: System.out.println("State: ACC"); break; 
default: System.out.println("Error: Undefined State"); 
System.exit(1); 
} 
// Read input from keyboard 
System.out.print("Input: "); String in = keyboard.readLine(); 
if (in.equals("on")) input = on; 
else if (in.equals("set")) input = set; 
else if (in.equals("brake")) input = brake; 
else if (in.equals("accP")) input = accP; 
else if (in.equals("accR")) input = accR; 
else if (in.equals("resume")) input = resume; 
else if (in.equals("correct")) input = correct; 
else if (in.equals("slow")) input = slow; 
else if (in.equals("fast")) input = fast; 
else input = 0; 
// The state machine is defined below -the system remains in the 
// same state unless a new state is explicitly set. 
if (input != 0) { 
// Clear Output 
output = 0; 
// State Machine Actions 
switch(state) { 
case OFF: // OFF State 
switch(input) { 
case on: state = READY; break; 
default: break; 
} 
break; 
case READY: // READY State 
switch(input) { 
case on: state = OFF; break; 
case set: output = store; state = SET; break; 
default: break; 
}; 
break; 
case SET: // SET State 
switch(input) { 
case on: state = OFF; break; 
case brake: state = WAIT; break; 
case accP: state = ACC; break; 
case fast: output = dec; break; 
case slow: output = inc; break; 
case correct: break; 
default: break; 
} 
break; 
case WAIT: // WAIT State 
switch(input) { 
case on: state = OFF; break; 
case resume: state = SET; break; 
default: break; 
} 
break; 
case ACC: // ACC State 
switch(input) { 
case on: state = OFF; break; 
case accR: state = SET; break; 
default: break; 
} 
break; 
} 
} 
// End of State Machine Definition 
// Display any output 
switch(output) { 
case store: System.out.println("Output: store"); break; 
case inc: System.out.println("Output: inc"); break; 
case dec: System.out.println("Output: dec"); break; 
default: break; 
} 
// Print separator 
System.out.println("--"); 


} 
} 
public int main1(int instate, String in) { 
// Initialise Keyboard Input 
BufferedReader keyboard = 
new BufferedReader(new InputStreamReader(System.in)); 
int input = 0; 
int output = 0; 
int state = OFF; // Initial State 
// Repeat Forever 
while(true) { 
// Display Current State 
switch(instate) { 
case OFF: System.out.println("State: OFF"); break; 
case READY: System.out.println("State: READY"); break; 
case SET: System.out.println("State: SET"); break; 
case WAIT: System.out.println("State: WAIT"); break; 
case ACC: System.out.println("State: ACC"); break; 
default: System.out.println("Error: Undefined State"); 
//System.exit(1); 
} 
// Read input from keyboard 
//System.out.print("Input: "); String in = keyboard.readLine(); 
if (in.equals("on")) input = on; 
else if (in.equals("set")) input = set; 
else if (in.equals("brake")) input = brake; 
else if (in.equals("accP")) input = accP; 
else if (in.equals("accR")) input = accR; 
else if (in.equals("resume")) input = resume; 
else if (in.equals("correct")) input = correct; 
else if (in.equals("slow")) input = slow; 
else if (in.equals("fast")) input = fast; 
else input = 0; 
// The state machine is defined below -the system remains in the 
// same state unless a new state is explicitly set. 
if (input != 0) { 
// Clear Output 
output = 0; 
// State Machine Actions 
switch(instate) { 
case OFF: // OFF State 
switch(input) { 
case on: state = READY; break; 
default: break; 
} 
break; 
case READY: // READY State 
switch(input) { 
case on: state = OFF; break; 
case set: output = store; state = SET; break; 
default: break; 
}; 
break; 
case SET: // SET State 
switch(input) { 
case on: state = OFF; break; 
case brake: state = WAIT; break; 
case accP: state = ACC; break; 
case fast: output = dec; break; 
case slow: output = inc; break; 
case correct: break; 
default: break; 
} 
break; 
case WAIT: // WAIT State 
switch(input) { 
case on: state = OFF; break; 
case resume: state = SET; break; 
default: break; 
} 
break; 
case ACC: // ACC State 
switch(input) { 
case on: state = OFF; break; 
case accR: state = SET; break; 
default: break; 
} 
break; 
} 
} 
// End of State Machine Definition 
// Display any output 
//switch(output) { 
//case store: System.out.println("Output: store"); break; 
//case inc: System.out.println("Output: inc"); break; 
//case dec: System.out.println("Output: dec"); break; 
//default: break; 
//} 
// Print separator 
System.out.println("--"); 
return state;

} 
} 

} 







package problemSolving;
/*
 HackerRank challenge:
 Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains 
 a non-empty String. For each line, print the line number, followed by a single space, and then the line 
 content received as input. 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
            Scanner sc = new Scanner(System.in);
            ArrayList<String> sen = new ArrayList<String>();
            System.out.println("Enter some strings");
            for(int i=0;sc.hasNext();i++){  
            sen.add(sc.nextLine()); 
            System.out.println(i+1 + " "+ sen.get(i));                            
        }
       
        
        
    }
}

// Test case 1
/*
 Hello world
 Hello universe
 This is a third line
 Fourth line is a little longer
 */

//Test case 2
/*
eqi wulp maq
qni d
m gugdsulk
i f
ds j
s
b e xfn
cb
g bukc
hf wuoo imv g
f su ia twh h
e te wr ord
sk f e j
q
glo v s
s x deuwqj
u
gd upf mxdh h
mrcw nx wx

*/





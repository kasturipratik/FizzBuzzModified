# Fizz Program

The "Fizz-Buzz test" is a common interview question. You'll be prepared because you are creating FizzBuzz. But you'll be going beyond that - you're creating the crazy fun insane version of FizzBuzz! Hooray for you!!!

Write a program that implements a method that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

Important: Your main method must not contain any logic for the FizzBuzz program. Use other methods or classes for structuring the code for FizzBuzz. Use only the main method to get input from the user, send output to the display and call the FizzBuzz logic.

Get your FizzBuzz program working as described above before moving on.

Now, put the working version in GitHub with a comment that says: "Working version of FizzBuzz"

Now, modify your FizzBuzz program as follows:

- Make the starting number and ending number each a random number between 1 and 100. If the starting number and ending number are the same then print "Shazam!!"
- Commit the above version to the same GitHub repository and for the commit message write "Shazam version of FizzBuzz".
- If the starting number and ending number are less than 10 digits apart then print "This won't take long" before printing your solution.
- Commit the above version to the same GitHub repository and for the commit message write "This won't take long version of FizzBuzz".
- If the number is a multiple of seven print "this number is a multiple of seven" next to the number.
- Commit the above version to the same GitHub repository and for the commit message write "Multiple of Seven version of FizzBuzz".
- If the ending number is less than the starting number print "Ooops"
 

Sample output:

  _1_  
   _2_  
   _Fizz_  
   _4_  
  _Buzz_  
  _Fizz_  
_7 - multiple of seven_  
_8_  
_Fizz_  
_Buzz_  
_11_  
_Fizz_  
_13_  
_14 - multiple of seven_  
_Fizz Buzz_  
_16_  
  
Bonus:  
Only work on the bonus after you have finished everything else. For the bonus, modify your FizzBuzz program to print Rock Paper Scissors Lizard Spock (Links to an external site.)Links to an external site. next to every even number over ten. Only print one of the words... Rock  or Paper or Scissors, etc ... and after you print Rock then then for the next even number print Paper, then Scissors, etc... So, yes, you have to keep track of the word you just printed and then use the next word in the list.

If the number has a word next to it (as would be the case for 30) then print FizzBuzz Scissors in place of the 30. (note: 30 may not resolve to Scissors depending on your starting number).

Commit the above version to the same GitHub repository and for the commit message write "Bonus version of FizzBuzz - I've got this!".

Example of Bonus output:

1  
2   
Fizz  
4   
Buzz  
6   
7 - multiple of seven  
8   
Fizz  
Buzz - Rock  
11  
Fizz - Paper  
13  
14 - Scissors  
Fizz Buzz  
16 - Lizard  


DOUBLE BONUS:  
For all numbers higher than 20, look at the last digit of the number.   

If the digit has an odd number of letters print "Harry"   
If the digit has an even number of letters print "Potter"

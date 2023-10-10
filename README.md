# CAESAR COMPUTATOR 🔑
This is a simple program, written in [Kotlin](https://kotlinlang.org/), that receives an Integer as the input and prints the correspondent Roman numeral, or receives a Roman numeral and convert it to an Integer value.

     738041            738057720027           750027750837140917          730037150037    19837     
       903              7907  1807             1091  3097  305              88    504     387       
       903              7907  1807             1091  3067  305              88    7803   763        
       903              7907  1807             1091  3097  305              88     109   55         
       903              7907  1807             1091  3097  305              88      206 29          
       902              7907  1807             1091  3067  305              88      79049           
      7902              7901  1801             3083  3097  204              00       3003           
     3222227           322222222223           222222222222222223         73222237     33            
                                                                                                    
                                                                                                    
                                                                   7                         7      
     150043    35043350023     138093    12093320043350053    120063    35063320053350053340021     
       3097     44    88         3803     59    803   087       1097     547   90   180   309       
        505    28     88          2067   397    803   087        206    397    90   180   309       
        7903  197     88           402   93     803   087        7605  191     90   180   309       
         3081 63      88           7903 65      803   087         1081763      90   180   309       
          50445       88            30856       803   087          30655       90   180   309       
           609        00             4097      7003  7087           409        907  3007  309       
           147     72555527           43      3555552555527         147     7355555555555555553     
                                                                                                    
                                                                                                    
      222221  22223                322223  322227222223              322223  322223322222222223     
       7003   195                    606    59    3091                 5097   591   3007  2097      
        7605 793                      2097 65     3097                  3097 55     180   309       
          60997                        30893      3097                   18062      180   309       
           9087                         2003      3097                    2002      180   309       
         1933081                       541905     3097                   247605     180   309       
        191  7003                     65   605    3097                  64   4067   180   309       
     736027   300437               15097   790937150837              12897   790831720037150837     

## Approach
Create 2 arrays, one for storing the values of roman numerals, and other for storing the corresponding numbers.
Create a string object to store the generated value. While comparing the integer and the roman numerals execute the logic below:

1. If input number is >= the highest Roman numeral, add it to the string;
2. Subtract the current int value from the input number;
3. If input number is < the highest Roman numeral, then check with next highest Roman numerals;
4. Repeat the process above until the input number becomes 0.

### Reference
Article [Convert Integer to Roman Numerals in Java](https://www.javatpoint.com/convert-integer-to-roman-numerals-in-java)

### Examples

| Input | Output |
|-------|--------|
| 20    | XX     |
| 32    | XXXII  |
| 50    | D      |

### Licence Apache 2.0

### Author [felipecaparelli](https://github.com/felipecaparelli/)

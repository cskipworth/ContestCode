//AddingWords problem code file
//Author: Clarissa Skipworth

import java.util.Scanner;
import java.util.HashMap;

public class AddingWords {
    static Scanner scanner;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in); 
        //Structs
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
        HashMap<Integer, String> abacus = new HashMap<Integer, String>();

        //Input read and computation per command line
        while(scanner.hasNextLine()){
            String token = scanner.next(); 

            //Each of these automatically leaves the scanner at the very end of their command line, 
            //ready to move to the next command token.

            //Definition command
            if(token.equals("def")){
                //Variables
                String var = scanner.next();
                Integer val = scanner.nextInt();

                //Work
                if(dictionary.containsKey(var)){
                    dictionary.replace(var, val);
                    abacus.replace(val, var);
                }
                dictionary.put(var, val);
                abacus.put(val, var);
            }

            //Clear command
            if(token.equals("clear")){
                dictionary.clear();
                abacus.clear();
            }

            //Calculation command
            if(token.equals("calc")){
                //Variable initiation
                String start = scanner.next();
                String equation = start;
                String answer = "";
                if(!dictionary.containsKey(start))
                    answer = "unknown";
                Integer tot = dictionary.get(start);

                String oper = scanner.next();
                String varS;
                Integer varV;

                //Work
                while(!oper.equals("=")){
                    varS = scanner.next();
                    if(!dictionary.containsKey(varS)){
                        answer = "unknown";
                    }
                    varV = dictionary.get(varS);

                    equation = equation + " " + oper + " " + varS;

                    if(oper.equals("+")){
                        tot = tot + varV;
                    }
                    if(oper.equals("-")){
                        tot = tot - varV;
                    }
                    oper = scanner.next();
                }

                if(!abacus.containsKey(tot)){
                    answer = "unknown";
                } else { 
                    answer = abacus.get(tot);
                }

                //Output
                System.out.println(equation + " = " + answer);

            }
        }
        //End scanner
        scanner.close();
    }



}

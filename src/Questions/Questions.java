/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.*;
import java.io.*;
/**
 *
 * @author Sithara
 */
public class Questions {   
    
    
    
    public static void main(String[] args){
        boolean a = true;
        
        do{
            System.out.println("Hello, Pick a question number between 1-5");
            Scanner s = new Scanner(System.in);
            int qn = s.nextInt();
            
            if(qn<6 && qn>0){
                       
                
                String fileName = "Questions.txt";
        
                try{
                    FileReader fr = new FileReader(fileName);
                    BufferedReader br = new BufferedReader(fr);
                    
                    //j is the line number of the question
                    int j = (4*(qn-1))+1;

                    for(int i=1; i<(j+1); i++){
                        String line = null;
                        //reads the text file line by line
                        line = br.readLine();
                        
                        //when the loop comes to the final loop, if condition become true
                        if(i == j){
                            System.out.println(line); //question line
                            i++;
                            line = br.readLine(); //set of answers line
                            System.out.println(line);
                            i++;
                            line = br.readLine(); //answer line
                            String ans = s.next();
                            


                            if(ans.equals(line)){
                                System.out.println("Congratulations!");
                                a = false;
                                break;
                            }
                            else{
                                System.out.println("Sorry, the answer is "+ line);
                                System.out.println("Do you wnat to generate more? Y/N");
                                String again = s.next();
                                char aans = again.charAt(0);
                                
                                if(aans == 'y' || aans == 'Y'){
                                    a = true;
                                }else{
                                    a = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                catch(FileNotFoundException ex){
                    System.out.println("Unable to open file '"+fileName+"'");
                }
                catch(IOException ex){
                    System.out.println("Error reading file '"+fileName+"'");
                }

            }            
            
        }while(a);
    }
    
    
    
    
}

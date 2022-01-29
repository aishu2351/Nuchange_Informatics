import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



class Nuchange_Inofmatics{
    static HashMap<String, Integer> urlWithUid = new HashMap<>();
    static HashMap<String, Integer> urlWithCount = new HashMap<>();
    static Scanner sc=new Scanner(System.in);

    static void increment(String url){
        int c=0;
        if(urlWithCount.containsKey(url)){
            urlWithCount.put(url,urlWithCount.get(url)+1);
            }
            else{
                c++;
                urlWithCount.put(url,c);
            }
            
      //  System.out.println(urlWithCount);
               
     }

   
    static void get(String url){
        
        
        if(urlWithUid.containsKey(url)){
            System.out.println(urlWithUid.get(url));
            
       
            
        }else{
            System.out.println("Empty Database!.....");
        }
      //  System.out.println("if u want to continue again pls enter ur Argument:");
        String op = sc.nextLine();

        String[ ] inputArray = op.split(" ");
       if(inputArray.length > 1){
            option(inputArray[0], inputArray[1]);
        }
           
       else
           option(inputArray[0].toLowerCase(), "");

    }

    static void count(String url){ 
    
        if(urlWithCount.containsKey(url)){
            System.out.println(urlWithCount.get(url));
           
        }
 
        String op = sc.nextLine();

        String[ ] inputArray = op.split(" ");
        if(inputArray.length > 1){
            option(inputArray[0].toLowerCase(), inputArray[1]);
        }
       
        else
            option(inputArray[0], "");
        

    }

    static void list(){
        
            System.out.println(urlWithCount);
            String op = sc.nextLine();

            String[ ] inputArray = op.split(" ");
            if(inputArray.length > 1){
                option(inputArray[0].toLowerCase(), inputArray[1]);
            }
           
            else
                option(inputArray[0].toLowerCase(), "");
            
        

    }


    static void storeurl(String url){
        

        int min=1, max=100,c=0;
        int uid = (int) (Math.random()*(max-min+1)+min);

        
        if(urlWithUid.containsKey(url)){
            increment(url);
            
        }else{
            urlWithUid.put(url, uid);
            urlWithCount.put(url,c);
        }
        
      //  System.out.println(urlWithUid);
        String op = sc.nextLine();
        if(op.toLowerCase()=="list")
            list();
        else{

        String[ ] inputArray = op.split(" ");
        
        if(inputArray.length > 1){
           option(inputArray[0].toLowerCase(), inputArray[1]);
        }
           
       else
           option(inputArray[0].toLowerCase(), "");
        }
        
  
    }
    
    static void option(String option, String url){
        
        switch(option){
            case "storeurl": storeurl(url);
                 break;
            case "get": get(url);
                break;
            case "count":count(url);
                break;
            case "list": 
                        list();
                        break;
            case "exit":return;
           
        }
    }
    public static void main(String[] args){ 
        
            option(args[0], args[1]);
          
        
    
    }
}
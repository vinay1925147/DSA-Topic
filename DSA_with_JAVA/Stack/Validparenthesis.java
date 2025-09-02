import java.util.*;
public class Validparenthesis {
    public static boolean isValid(String str, Stack<Character> s){
        for(int i=0;i<str.length();i++){//({{}})
            char ch = str.charAt(i);
            if(ch=='('|| ch=='{'||ch=='['){
                s.push(ch);
            } 
            else{
                // if(s.isEmpty()){
                //     return false;
                // }
                if( (s.peek()=='('&& ch==')')
                ||(s.peek()=='{'&& ch=='}')
                ||(s.peek()=='['&& ch==']') )
                { 
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Stack <Character> s= new Stack<Character>();
        String str="()";
        System.out.println(isValid(str,s));


    }
}

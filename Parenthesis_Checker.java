class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s= new Stack<Character>();
        for(int i=0 ; i<x.length();i++){
            char str = x.charAt(i);
            if(str == '('||str=='['||str =='{')
            s.push(str);
            else{
                if(s.isEmpty()) return false;
                else if (isMatching(s.peek(),str)==false)return false ;
                else s.pop();
            }
        }
        return s.isEmpty();
    }
    static boolean isMatching(char a,char b){
        return (a=='('&&b==')'|| a=='['&&b==']'||a=='{'&&b=='}');
    }
}
// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1

class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> s =new Stack<Character>();
        String ans= "";
        for(int i=0 ;i<S.length();i++)
        s.push(S.charAt(i));
        for(int i=0 ;i<S.length();i++)
        ans+=s.pop();
        return ans;
    }

}

// https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1

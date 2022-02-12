class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
//         boolean flag = true;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i) != s.charAt(s.length()-1-i)){
//                 flag = false;
//                 break;
//             }
            
//         }
//         return flag;
        return ispalin(s,0,s.length()-1);
        
    }
    boolean ispalin (String s, int l, int r){
            if(l>=r)
                return true;
            if(s.charAt(l) != s.charAt(r))
                return false;
            return ispalin(s,l+1,r-1);
    }
}

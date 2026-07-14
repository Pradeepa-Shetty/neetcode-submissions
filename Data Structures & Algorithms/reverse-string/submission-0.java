class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        char temp[]=new char[s.length];
        while(j>=0){
            temp[i]=s[j];
            i++;
            j--;
        }
        for( i=0;i<s.length;i++){
            s[i]=temp[i];
        }
    }
}
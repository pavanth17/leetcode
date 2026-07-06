class Solution {
    public String sortSentence(String s) {
        String[] w=s.split(" ");
        String[] a=new String[w.length];
        for(String word:w){
            int in=word.charAt(word.length()-1)-'1';
            a[in]=word.substring(0,word.length()-1);
        }
        return String.join(" ",a);
    }
}
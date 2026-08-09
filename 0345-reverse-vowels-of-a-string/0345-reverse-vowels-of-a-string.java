class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            //MOVE LEFT UNTIL WE FIND A VOWEL
            while(left<right && !isVowel(arr[left])){
                left++;
            }
            //MOVE RIGHT UNTIL WE FIND A VOWEL
            while(left<right && !isVowel(arr[right])){
                right--;
            }
            //SWAP VOWELS
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);  
    }
    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||
        ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
            return true;
        }
        return false;
    }
}
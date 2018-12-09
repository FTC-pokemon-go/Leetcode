class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
		for(int index = s.length()-1 ; index >=  0 ; index--) {
			char letter = s.charAt(index);
            sb.append(letter);
		}
        return sb.toString();
    }
}

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
           return "";
         int[] tFreq = new int[128]; 
        for (char c : t.toCharArray())
           tFreq[c]++;
           int left = 0, right = 0, required = t.length();
           int minLen = Integer.MAX_VALUE, minStart = 0;
        while (right < s.length()) {
            tFreq[lChar]++;
            if (tFreq[lChar] > 0) required++;
             left++;
           }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }
    }

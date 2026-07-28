class Solution:
    def smallestPalindrome(self, s: str) -> str:
        count = Counter(s)
        half = ""
        middle = ""

        for ch in sorted(count):
            freq = count[ch]
            if freq % 2 == 1 and middle == "":
                middle = ch
            half += ch * (freq // 2)
        
        return half + middle + half[::-1]
class Solution:
    def sumPrefixScores(self, a: List[str]) -> List[int]:
        return (z:=Counter(s[:i+1] for s in a for i in range(len(s)))) and [sum(z[s[:i+1]] for i in range(len(s))) for s in a]
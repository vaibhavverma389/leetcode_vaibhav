class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.lstrip()  
        if not s:
            return 0

        sign = 1
        i = 0

        if s[0] in ['-', '+']:
            if s[0] == '-':
                sign = -1
            i += 1

        r = 0
        while i < len(s) and s[i].isdigit():
            r = r * 10 + int(s[i])
            i += 1

        r *= sign

        a, b = -2**31, 2**31 - 1
        if r < a:
            return a
        if r > b:
            return b
        return r

        
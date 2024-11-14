class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        ops = ["+", "-", "*", "/"]
        stack = []

        res = 0
        for c in tokens:
            if c not in ops:
                stack.append(c)
            else:
                n2 = int(stack.pop())
                n1 = int(stack.pop())

                if c == "+":
                    res = n1 + n2
                if c == "-":
                    res = n1 - n2
                if c == "*":
                    res = n1 * n2
                if c == "/":
                    res = n1 / n2
                stack.append(res)

        if stack:
            res = int(stack.pop())

        return res
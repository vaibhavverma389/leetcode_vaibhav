class Solution:
    def createGrid(self, m, n):
        grid = []

        grid.append('.' * n)

        for i in range(1, m):
            grid.append('#' * (n - 1) + '.')

        return grid
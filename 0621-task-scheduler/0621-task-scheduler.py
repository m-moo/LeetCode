class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        task_cnt = Counter(tasks)

        max_freq = max(task_cnt.values())
        max_cnt = sum(1 for count in task_cnt.values() if count == max_freq)

        res = (max_freq - 1) * (n + 1) + max_cnt
        return max(len(tasks), res)
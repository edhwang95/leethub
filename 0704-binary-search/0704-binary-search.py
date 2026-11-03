class Solution:
    def search(self, nums: List[int], target: int) -> int:
        lt = 0
        rt = len(nums) - 1

        while lt <= rt:
            key = (lt + rt) // 2

            if nums[key] == target:
                return key

            elif nums[key] < target:
                lt = key + 1

            else:
                rt = key - 1

        return -1
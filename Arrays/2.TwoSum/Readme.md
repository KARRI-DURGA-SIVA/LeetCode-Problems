1. Two Sum
🔗 Problem

Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.

LeetCode: Easy

💡 Pattern
HashMap
Complement Lookup
🧠 Approach
Create a HashMap to store each number and its index.
Traverse the array.

Calculate the complement:

complement = target - nums[i]
If the complement exists in the map, return both indices.
Otherwise, store the current number and its index.
⏱️ Time Complexity
O(n)
💾 Space Complexity
O(n)
✅ Test Cases
Example 1
Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]
Example 2
Input:
nums = [3,2,4]
target = 6

Output:
[1,2]
Example 3
Input:
nums = [3,3]
target = 6

Output:
[0,1]
Edge Case 1
Input:
nums = [-1,-2,-3,-4,-5]
target = -8

Output:
[2,4]
Edge Case 2
Input:
nums = [0,4,3,0]
target = 0

Output:
[0,3]
Edge Case 3
Input:
nums = [1000000,-1000000]
target = 0

Output:
[0,1]
# DSA_Leetcode_problems
Solving Data Structures and Algorithms problems from LeetCode in Java. Preparing for coding interviews and internships.

##  Two Sum Problem

The **Two Sum** problem asks us to find two distinct indices in an array such that the numbers at those indices add up to a given target value.
To solve this efficiently, we use a **HashMap** to store each number and its corresponding index as we iterate through the array. For every number in the array, we calculate its **complement** (i.e., target - current number). If this complement already exists in the map, it means we have previously seen a number that can pair with the current number to reach the target. In that case, we return the indices of both numbers.
If not, we store the current number and its index in the map and continue iterating.
This approach ensures that we solve the problem in **linear time O(n)** and use **O(n)** space for the HashMap.
**Example:**  
Input: [2, 7, 11, 15], Target: 9  
Output: [0, 1]  
Explanation: 2 + 7 = 9 → indices [0, 1]


### Best Time to Buy and Sell Stock

This problem involves finding the maximum profit that can be achieved by buying and then selling a stock at different days given in an array of prices. The goal is to buy at the lowest possible price and sell at the highest price after the buying day.
To solve this, we use a greedy approach:
- We keep track of the minimum price seen so far (min).
- For each day, we calculate the potential profit by subtracting the minimum price from the current price.
- We update the maximum profit if the current profit is higher.
This approach works in linear time O(n) and constant space O(1).
**Example:**
Input: [7, 1, 5, 3, 6, 4] 
Output: 5  
Explanation: Buy at price 1 and sell at price 6.


# Remove Duplicates from Sorted Array

This problem asks us to remove duplicate elements from a sorted integer array **in-place**, such that each element appears only once. The function should return the new length of the array after removing duplicates, and the array should be modified to show the result in the first k elements.

## Problem Explanation
Given a **sorted** array nums, we want to remove duplicates in-place such that each element appears only once and return the new length. The relative order of the elements should be preserved, and extra space is not allowed (O(1) space constraint).
### Example:
**Input:**  
nums = [0,0,1,1,1,2,2,3,3,4]  
**Output:**  
5  
**Modified array:**  
[0,1,2,3,4,...] 
## Approach
- We use **two pointers**:  
  - j: points to the position of the last unique element  
  - i: iterates through the array from start to end
- At each step, if nums[i] is different from nums[j], it means we found a new unique element, so we:
  - increment j
  - assign nums[j] = nums[i]
- Finally, we return j + 1, which represents the number of unique elements.



**Sort Colors Problem**
The "Sort Colors" problem from LeetCode asks us to sort an array consisting of only 0s, 1s, and 2s in-place and in a single pass. The optimal solution uses the Dutch National Flag algorithm, which efficiently partitions the array using three pointers: low, mid, and high.
We start with low and mid at the beginning and high at the end of the array. As we iterate:
If the element at mid is 0, we swap it with low and move both forward.
If it's 1, we move mid forward.
If it's 2, we swap it with high and move high backward.
This ensures all 0s are placed first, followed by 1s, then 2s, in O(n) time and O(1) space.
**Example:**
Input: [2, 0, 2, 1, 1, 0]
Output: [0, 0, 1, 1, 2, 2]


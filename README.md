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

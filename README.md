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

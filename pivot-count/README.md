## Peak Index in a Mountain Array

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-orange)

### Problem Statement
You are given an integer **mountain** array `nums` of length `n` where the values increase to a **peak element** and then decrease.

Return the index of the peak element.

Your task is to solve it in **O(log(n))** time complexity.

---

### Function Signature
```java
class Solution {
    public int peakE(int[] nums);
    public int peakC(int[] nums);
}
```

---

### Example 1:
**Input:**
```java
nums = [0,1,0]
```
**Output:**
```java
1
```

### Example 2:
**Input:**
```java
nums = [0,2,1,0]
```
**Output:**
```java
1
```

### Example 3:
**Input:**
```java
nums = [0,10,5,2]
```
**Output:**
```java
1
```

---

### Constraints
- `3 <= nums.length <= 10^5`
- `0 <= nums[i] <= 10^6`
- `nums` is **guaranteed** to be a mountain array.

---

### Approach
This solution uses **binary search** to efficiently find the peak element in **O(log n)** time. The function `peakE(nums)` identifies the index of the peak element by adjusting the search range based on whether the mid-value is greater than its neighbors. The function `peakC(nums)` returns the index of rotation, ensuring it remains within bounds.

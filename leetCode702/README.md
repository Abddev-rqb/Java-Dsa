## [Search in a Sorted Array of Unknown Size](https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/)
<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />  

---

### Problem Statement
You are given an **infinite** integer array `arr`, sorted in **ascending order** (with no duplicates). However, you **do not know** its length. The array is represented by an **ArrayReader** interface that provides the following method:

```java
int get(int index)
```
- Returns the value at index `index` (0-based indexing).
- Returns `2³¹ - 1` (which is `Integer.MAX_VALUE`) if the index is out of bounds.

You are given an integer `target`, and your task is to **search** for `target` in `arr`.
If `target` exists, return its **index**. Otherwise, return `-1`.

---

### Examples

#### **Example 1:**
```plaintext
Input: arr = [-1,0,3,5,9,12,...] (infinite sorted array)
target = 9
Output: 4
```
**Explanation:** The element `9` is found at index `4`.

#### **Example 2:**
```plaintext
Input: arr = [-1,0,3,5,9,12,...] (infinite sorted array)
target = 2
Output: -1
```
**Explanation:** The target `2` is not found in the array, so return `-1`.

---

### **Constraints:**
- `-10⁴ ≤ arr[i], target ≤ 10⁴`
- `arr` is **sorted** in strictly increasing order.
- `target` is an integer.
- You can only use `ArrayReader.get(index)`, and you **cannot** access the array directly.
- The solution must run in **O(log n) time complexity**.

---

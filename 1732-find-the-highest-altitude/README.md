# 1732. Find the Highest Altitude

| | |
|---|---|
| **Difficulty** | Easy |
| **Tags** | Array, Prefix Sum |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 43308000 |
| **Submitted** | 2026-08-03T18:41:29.000Z |
| **Link** | [https://leetcode.com/problems/find-the-highest-altitude/](https://leetcode.com/problems/find-the-highest-altitude/) |

## Problem

There is a biker going on a road trip. The road trip consists of `n + 1` points at various altitudes. The biker starts his trip on point `0` with altitude equal `0`.

You are given an integer array `gain` of length `n` where `gain[i]` is the **net gain in altitude** between points `i`​​​​​​ and `i + 1` for all (`0 

**Example 2:**

**Input:** gain = [-4,-3,-2,-1,4,3,2]
**Output:** 0
**Explanation:** The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

 

**Constraints:**

	- `n == gain.length`

	- `1 <= n <= 100`

	- `-100 <= gain[i] <= 100`

## Solution

See [`solution.java`](./solution.java).

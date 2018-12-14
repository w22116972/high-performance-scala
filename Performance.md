

# Profiling
> analyze the internal characteristics of application

- Where CPU cycles are spent
- How memory is used, and where objects are instantiated and released (or not, if you have a memory leak!)
- Where IO operations are performed
- Which threads are running, blocked, or idle

# benchmark + profiling

1. Run a benchmark against the current version of the code to establish a performance baseline.
2. Use a profiler to analyze the internal behavior and locate a bottleneck.
3. Improve the section causing a bottleneck.
4. Run the same benchmark from step 1 against the new code.
5. Compare the results from the new benchmark against the baseline benchmark to determine the effectiveness of your changes.
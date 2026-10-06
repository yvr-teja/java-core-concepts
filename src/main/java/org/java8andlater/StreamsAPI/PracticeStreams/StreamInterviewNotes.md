Interview formula:
Stream = Source → Intermediate Operations → Terminal Operation

Example:
List → stream() → filter() → map() → sorted() → collect()

Important Stream Operations
filter()    → select/filter data
map()       → transform data
sorted()    → sort data
distinct()  → remove duplicates
limit()     → take first N elements
skip()      → skip first N elements
forEach()   → perform action
collect()   → convert to Collection/Map
count()     → count elements
reduce()    → combine elements into one Result

Main Stream terminal operators to know for interviews
forEach()       → performs an action on every element
collect()       → collects elements into a List, Set, Map, etc.
count()         → returns the number of elements
reduce()        → combines elements into one result
min()           → finds the minimum element
max()           → finds the maximum element
findFirst()     → returns the first element
findAny()       → returns any element
anyMatch()      → checks if at least one element matches
allMatch()      → checks if all elements match
noneMatch()     → checks if no elements match
toArray()       → converts the stream into an array
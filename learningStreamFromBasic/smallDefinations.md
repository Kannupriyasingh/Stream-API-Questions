### Easy/Basic

a) map()
Convert one type to another.

List<String> names = Arrays.asList("ram", "shyam");
List<String> upper = names.stream()
                          .map(String::toUpperCase)
                          .collect(Collectors.toList());

b) filter()
Keep only matching elements.

List<Integer> nums = Arrays.asList(10, 20, 3, 5);
List<Integer> result = nums.stream()
                           .filter(n -> n > 10)
                           .collect(Collectors.toList());

c) sorted()
nums.stream().sorted().forEach(System.out::println);

d) collect()
Convert stream → list/set/map

e) reduce = reduce many values into one value

Examples:
Sum of numbers
Max value
Min value
Concatenate strings
Multiply numbers

* reduce() takes two things:
-> Initial value (starting point)
-> A function that combines 2 elements into 1

Example:

int sum = numbers.stream()
                 .reduce(0, (a, b) -> a + b);

Here:
0 → starting value
(a, b) -> a + b → take old value + next value

### Move to intermediate problems

Example:

✔ Group by first letter
names.stream()
     .collect(Collectors.groupingBy(s -> s.charAt(0)));

✔ Convert List<Person> → List<String>
people.stream()
      .map(Person::getName)
      .collect(Collectors.toList());

✔ Create Map from List
items.stream().collect(Collectors.toMap(Item::getId, Item::getName));



### Learn advanced Stream concepts

Once basics are strong:

flatMap()
groupingBy()
partitioningBy()
reduce()
parallelStream()
custom collectors


✅ 1. flatMap() — Flatten + Map
Definition:

flatMap() converts multiple nested lists/streams into a single stream.

Use case:

When you have a list of lists and want one combined list.

Example:
List<List<Integer>> list = Arrays.asList(
    Arrays.asList(1, 2),
    Arrays.asList(3, 4),
    Arrays.asList(5)
);

List<Integer> result = list.stream()
        .flatMap(x -> x.stream())
        .toList();

System.out.println(result);

Output
[1, 2, 3, 4, 5]

✅ 2. groupingBy() — Group items by a key
Definition:

Used to group items based on a property (like SQL’s GROUP BY).

Use case:

Group employees by department, group words by length, etc.

Example:
Map<String, List<String>> groups =
    Arrays.asList("bat", "tab", "eat", "tea", "tan")
        .stream()
        .collect(Collectors.groupingBy(String::length));

Output
3 = [bat, tab, eat, tea, tan]


###### IMPORTANT ######3
<!-- Basic Syntax
Map<K, List<T>> result = list.stream()
        .collect(Collectors.groupingBy(item -> key));

Where:
K = key by which you group
T = type of elements in list -->

✅ 3. partitioningBy() — Split into TRUE and FALSE groups
Definition:

Splits data into two groups based on a condition:

true

false

Use case:

Split numbers into even/odd, adults/minors, valid/not valid.

Example:
Map<Boolean, List<Integer>> parts =
    Arrays.asList(1, 2, 3, 4, 5, 6).stream()
        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

Output
true  -> [2, 4, 6]
false -> [1, 3, 5]

✅ 4. reduce() — Combine Stream Elements
Definition:

Used to reduce a stream to a single value (sum, max, min, product).

Use case:

sum of salaries

find max/min

count using reduce

concatenate strings

Example:

Sum of numbers:

int sum = Arrays.asList(1, 2, 3, 4)
        .stream()
        .reduce(0, (a, b) -> a + b);

Output
10

✅ 5. parallelStream() — Run operations in parallel
Definition:

Processes elements in parallel using multiple CPU cores.

Use case:

Large data processing where speed is needed.

Example:
List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

nums.parallelStream()
    .forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));

Output (order is random):
1 ForkJoinPool.commonPool-worker-4
2 ForkJoinPool.commonPool-worker-7
...

⚠️ Note:

Faster for big data, slow for small data

Avoid for operations that require shared mutable state
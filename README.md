# Triangle code review

## To refactor
1. Prefer `get*`, `set*` for private field acesss methods;
2. Prefer `is*` prefix for methods returning boolean: `isEquilateral` instead of `equilateral`;
3. Prefer `getArea()` over just `area()`
4. The constructor accepting three sides doesn't do valication.
  - negative values
  - sum of two sides exceeds the third one
5. The `area()` computes `0.5*perim()` three times, but may just once
6. Implementation of `equilateral()` can have the `if` statement inlined
7. Use some epsilon when comparing sides of type `double`
8. By the way, a Java record would probably suit more here

## Suggestions 
1. As the sides are of `double` type, the `toString()` implementation might use rounding to let's say to 2 decimals

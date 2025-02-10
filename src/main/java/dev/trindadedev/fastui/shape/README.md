# FastUI Shapes

# How to use
## Kotlin

``` kotlin
import dev.trindadedev.fastui.shape.shape

*SomeView.shape(*SomeShape())

```

## Java
```java
new *SomeShape().applyTo(*SomeView);
```

### RoundedCornersShape

``` Kotlin
import dev.trindadedev.fastui.shape.RoundedCornersShape

// Signatures in Kotlin style
RoundedCornersShape(
  topStart: Int,
  topEnd: Int,
  bottomEnd: Int,
  bottomStart: Int
)

RoundedCornersShape(
  topStart: Float,
  topEnd: Float,
  bottomEnd: Float,
  bottomStart: Float
)

RoundedCornersShape(
  all: Int
)

RoundedCornersShape(
  all: Float
)
```
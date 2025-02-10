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

### RoundedCornerShape

``` Kotlin
import dev.trindadedev.fastui.shape.RoundedCornerShape

// Signatures in Kotlin style
RoundedCornerShape(
  topStart: Int,
  topEnd: Int,
  bottomEnd: Int,
  bottomStart: Int
)

RoundedCornerShape(
  topStart: Float,
  topEnd: Float,
  bottomEnd: Float,
  bottomStart: Float
)

RoundedCornerShape(
  all: Int
)

RoundedCornerShape(
  all: Float
)
```
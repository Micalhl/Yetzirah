# Yetzirah
Powerful plugin for simulating real world within the Minecraft

## API

```kotlin
repositories {
    maven("http://repo.mcstarrysky.com:10086/repository/releases") {
        isAllowInsecureProtocol = true
    }
}

dependencies {
    // If you want to import other modules, please change `core` to the module you want.
    compileOnly("me.mical.yetzirah:core:0.0.1-development-1")
}
```

Then, you can get API by using `Yetzirah.xxx`.

For example, you want to get MarriageManager:

```java
MarriageManager manager = Yetzirah.INSTANCE.getMarriageManager();
manager.xxx();
```

```kotlin
val manager: MarriageManager = Yetzirah.getMarriageManager()
manager.xxx()
```
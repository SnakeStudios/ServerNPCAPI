# ServerNPC-API

### Maven
Add this to your `pom.xml`

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.SnakeStudios</groupId>
        <artifactId>ServerNPCAPI</artifactId>
        <version>v1.0.1</version>
    </dependency>
</dependencies>
```

### Gradle
Add this to your `build.gradle`

```gradle
repositories {
    maven { url = 'https://jitpack.io' }
}

dependencies {
    compile('com.github.SnakeStudios:ServerNPCAPI:v1.0.1')
}
```

### Examples
```java
//Name of the NPC || 16 length longer.
String name = "testNPC";

// Location of the NPC
Location loc = new Location(Bukkit.getWorld("world"), 0, 100, 0);

// Settings for the NPC
NPCSettings npcSettings = new NPCSettings();

// UUID of the NPC
UUID uuid = UUID.randomUUID();

// Skin Information - Also you can use nicks.
SkinData skinData = new SkinData("value", "signature", uuid);

// Creating the NPC || It returns SnakeNPC if you need it.
Main.getAPI().createNPC(name, uuid, npcSettings, skinData, loc, null);
```

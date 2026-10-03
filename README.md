# GreenCore

[![License: MIT](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)
[![Platform: libGDX](https://img.shields.io/badge/platform-libGDX-red.svg)](https://libgdx.com/)

A lightweight wrapper for building 2D games on top of [libGDX](https://libgdx.com/).
GreenCore gives you three building blocks — **screens**, **layers**, and **models** —
plus a batteries-included asset loader so you can focus on your game logic instead
of plumbing.

## Install

GreenCore can be pulled in through [JitPack](https://jitpack.io) in any
Gradle-based libGDX project. In the **root** `build.gradle`:

```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Then add the dependency to every backend that needs it (`core`, `desktop`,
`android`, `html`, `ios`):

```groovy
dependencies {
    implementation 'com.github.ahcobos:GreenCore:master-SNAPSHOT'
}
```

If you prefer a drop-in jar, grab the latest build from
[deploy/Greencore.jar](deploy/Greencore.jar) and add it to each backend's
classpath manually.

## Hello, GreenCore

A minimal game that boots into a single screen with one layer:

```java
public class MyGdxGame extends GCGame {
    @Override
    public void create() {
        new AssetsLoaderModel();
        this.setScreen(new MyMenuScreen(this));
    }
}

public class MyMenuScreen extends GCBaseScreen {
    public MyMenuScreen(Game game) {
        super(game);
        this.addLayer(new MenuFirstLayer("menu"));
    }
}

public class MenuFirstLayer extends GCBaseLayer {
    public MenuFirstLayer(String name) {
        super(name);
    }
}
```

That's it — you now have a running libGDX game using GreenCore's lifecycle.

## Core concepts

### GCGame

Your main class extends `GCGame`, which itself extends libGDX's `Game`
(and therefore `ApplicationListener`). You get the standard libGDX
lifecycle methods to override:

```java
public void create();
public void dispose();
public void pause();
public void resume();
public void render();
public void resize(int width, int height);
```

**Recommendation:** load all your assets inside `create()` via
`AssetsLoaderModel`, then switch to your first screen.

### GCBaseScreen

A screen is a collection of layers that make up a part of your game —
main menu, play screen, credits screen, and so on. Create one by
extending `GCBaseScreen`:

```java
public class MyMenuScreen extends GCBaseScreen {
    public MyMenuScreen(Game game) {
        super(game);
    }
}
```

Each screen owns a `Camera` and a `SpriteBatch`. The parts of the world
you want visible are controlled through the camera.

**Key methods:**

| Method | What it does |
| --- | --- |
| `getLayers()` | Returns a `LinkedHashMap` of all layers in this screen. |
| `setLayers(LinkedHashMap<String, GCLayer>)` | Replaces the full layer list. |
| `addLayer(GCLayer)` | Adds a single layer. |
| `removeLayer(String key)` | Removes a layer by key. |
| `getCamera()` / `setCamera(Camera)` | Access or replace the screen camera. |
| `getBatch()` / `setBatch(SpriteBatch)` | Access or replace the sprite batch. |

### GCBaseLayer

A layer is a collection of models. Models are added by key (e.g. `"my_runner"`),
which makes them easy to look up later.

```java
public class MenuFirstLayer extends GCBaseLayer {
    public MenuFirstLayer(String name) {
        super(name);
    }
}
```

**Key methods:**

| Method | What it does |
| --- | --- |
| `getName()` / `setName(String)` | Layer name. |
| `update()` | Called for every layer right before the screen renders. Override to drive game logic. |
| `getElements()` / `setElements(HashMap<String, GCModel>)` | Access or replace all models in this layer. |
| `addElement(String key, GCModel)` | Adds a model. |
| `removeElement(String key)` | Removes a model. |
| `getRenderer()` / `setRenderer(GCRenderer)` | Advanced: swap in a custom renderer. |

### GCBaseModel

A model is an actor with **states** — running, jumping, walking, idle,
and so on. In a classic jumper game, every platform, every enemy type,
and your jumper would each be a model.

### GCBaseState

States are the heart of a model: a state is a piece of visual + behavioral
information for one phase of the model's life. GreenCore ships two kinds:

- **`GCStaticState`** — a single-image state. Example: a door, which is
  either `openState` or `closedState`.
- **`GCAnimatedState`** — a sequence of frames. Example: the same door's
  `openingAnimation` and `closingAnimation`.

### Graphics sources

Attach visuals to a state through a `GCGraphicsSourceManager`. Two
built-in implementations:

**From a TexturePacker atlas:**

```java
this.setGraphicsSourceManager(
    new GCOpenTexturePackerSource("pack_name", "item_from_pack")
);
```

**From a single texture or texture region:**

```java
this.setGraphicsSourceManager(new GCTextureSource("base_image"));
```

## Features

- Screens, layers, and models
- Static and animated states
- Integrated Box2D physics
- Direct asset loading from TexturePacker atlases
- Gesture input processors (tap, pan, pinch, zoom, long-press, fling)

## License

MIT — see [LICENSE](LICENSE).

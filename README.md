# Greencore

This is meant to be a powerfull wrapper for 2D game creators with LibGDX

## How to install
It's very easy to use, you don't need to clone our whole repo, in https://github.com/ahcobos/GreenCore/blob/master/deploy you will find all our releases, for stable
versions dowload https://github.com/ahcobos/GreenCore/raw/master/deploy/Greencore.jar and add it to your libGdx Project, an important thing is that you
have to add it to every backend in your project (Core, Desktop, Android, Web and Ios)

## How to use
The following sections will be about how to use GreenCore Classes and an overview of how it works

### GCGame Class
After you install the .jar you should inherit your main class from GCGame, this one inherits from Game which inherits from ApplicationListener. this class allows you to have Scenes in your game
scenes can be used to swith between direfent parts of your game such as main screen, play screen, credis screen and more.
As always you are able to override the following methods 

>public void dispose ()
>public void pause ()
>public void resume ()
>public void render ()
>public void resize (int width, int height)

Going on, your game class should looks like this
> public class MyGdxGame extends GCGame
As a recomendation you should load all your assets in the create() method, Greencore comes with an Assets Loader that you will know soon
for now your create() method should looks like this 

>       @Override
>        public void create() {
>                new AssetsLoaderModel();
>        }

in your game class you can declare all your screens and set your game to one of them 

>       @Override
>        public void create() {
>                new AssetsLoaderModel();
>                this.setScreen(new MyMenuScreen(this));
>        }

### GCBaseScreen
In Greencore an screen is a collection of layers which have all your game items, and a game is composed of screens.
The Screen holds some important Features. A camera and a SpriteBatch, basically if you want to manipule the piece of world that is being drawn
you will have to do that in the screen.
you can create your own screen simply extending from GCBaseScreen so it would be some like 

>public class MyMenuScreen extends GCBaseScreen {
>
>        public MyMenuScreen(Game mGame) {
>                super(mGame);
>        }


GCBaseScreen has a couple of important methods you need to know
#### getLayers()
This method returns an LinkedHashMap with all the layers of your Screen

#### setLayers(LinkedHashMap<String, GCLayer> layers)
This method set the list of layers for your screen

#### addLayer(GCLayer mLayer)
This method add a layer to your Screen

#### removeLayer(String key);
Removes a layer from your Screen by a given key

#### getCamera();
Returns the camera of the screen and manipulate it as you want to

#### setCamera(Camera mCamera);
Sets the camera of your Screen, it can be any camera inherits from Camera

#### getBatch();
Returns the SpriteBatch of the screen

#### setBatch(SpriteBatch mBatch);
Sets the SpriteBatch of the screen


### GCBaseLayer
As I said before a layer is a collection of models, this models can be added to the layer with a key for example "my_runner"
This is an example of a prety basic Layer

>public class MenuFirstLayer extends GCBaseLayer {
>
>        public MenuFirstLayer(String name) {
>                super(name);
>        }
>}

And there are the methods you need to know

#### String getName()
Every layer has a name so this method returns it

#### setName(String name);
Sets the name of the layer

#### update()
Method Called for every layer right before to render the screen

#### HashMap<String, GCModel> getElements();
Returns all the models for the layer

#### setElements(HashMap<String, GCModel> elements);
Sets the whole list of elements in your layer

#### addElement(String key, GCModel element);
Adds a model for your layer

#### removeElement(String key);
Removes an element of your layer

#### GCRenderer getRenderer(); 
Advanced stuff, explained later ;), for now, this is the component which renders your layer

#### setRenderer(GCRenderer mRenderer);
Sets the renderer for your layer, you can create your own renderer, explained later ;)

### GCBaseModel
This is the place where GreenCore becomes more useful for your game.
A model is understood as an actor which have states (running, jumping, walking), so lets thing we are building a clasic Jumper Game, in that case 
the platforms would be a model, each kind of enemy would be a model and of course our Jumper would be another model

### GCBaseState
States are the key part in your models, A state is a part of your model, for example, our Jumper jumping.
Basically we have developed two kind of states, StaticState and AnimatedState

#### GCStaticState
A Static state, as its name says, represents an static state of a model, for example a door, a door would be composed of two static states, openState and closedState.
none of those states is "Animated", they both are composed of a single image, the open door and the close door

#### GCAnimatedState
An Animated state represents a part of a model where de model is moving or is animated, as an example, the door would be composed of two animated states,
door opening (animation of the door openning) and closing door (animation of the closing door)


## Some Features
 * Models
 * Layers
 * Integrated Physics 
 * Direct assets loading from Texture Packer

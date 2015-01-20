package com.ahcobos.greencore.assests;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class AssetsLoaderModel{
	
	// ===========================================================
	// Fields
	// ===========================================================

	private static HashMap<String,Texture> textures;
	private static HashMap<String,Sound> sounds;
	private static HashMap<String,Music> music;
	private static HashMap<String,BitmapFont> fonts;
	private static HashMap<String,TextureAtlas> packs;
	private static HashMap<String, Pixmap> pixmaps;
	public static BitmapFont font;
	
	// ===========================================================
	// Constructors
	// ===========================================================

	public AssetsLoaderModel(){		
		this.textures = new HashMap<String, Texture>();
		this.sounds = new HashMap<String, Sound>();
		this.music = new HashMap<String, Music>();
		this.fonts = new HashMap<String, BitmapFont>();
		this.pixmaps = new HashMap<String, Pixmap>();
		this.packs = new HashMap<String, TextureAtlas>();
	}
	
	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public static HashMap<String,Texture> getTextures() {
		return textures;
	}

	public static void setTextures(HashMap<String,Texture> textures) {
		AssetsLoaderModel.textures = textures;
	}
	
	public static HashMap<String, TextureAtlas> getPacks() {
		return packs;
	}

	public static void setPacks(HashMap<String, TextureAtlas> packs) {
		AssetsLoaderModel.packs = packs;
	}
	
	public static HashMap<String,Sound> getSounds() {
		return sounds;
	}
	

	public static void setSounds(HashMap<String,Sound> sounds) {
		AssetsLoaderModel.sounds = sounds;
	}
	
	public static HashMap<String, Pixmap> getPixmaps(){
		return pixmaps;
	}
	
	public static void setPixmaps(HashMap<String, Pixmap> pixmaps){
		AssetsLoaderModel.pixmaps = pixmaps;
	}
	
	// ===========================================================
	// Methods
	// ===========================================================
	
	public static void addTexture(String TextureLocation)
	{
		Texture mTexture = new Texture(Gdx.files.internal(TextureLocation));
		String key =  TextureLocation.substring(TextureLocation.lastIndexOf("/")+1,
						TextureLocation.lastIndexOf("."));
		AssetsLoaderModel.textures.put(key, mTexture);
	}
	
	public static void addTexture(String TextureLocation, String key)
	{
		Texture mTexture = new Texture(Gdx.files.internal(TextureLocation));
		AssetsLoaderModel.textures.put(key, mTexture);
	}
	
	public static Texture getTexture(String key)
	{
		return AssetsLoaderModel.textures.get(key);
	}
	
	public static boolean removeTexture(String key)
	{
		Texture t = AssetsLoaderModel.textures.remove(key);
		if (t != null)
		{
			t.dispose();
			return true;
		}
		return false;
	} 
	
	public static void addPixmap(String PixmapLocation){
		Pixmap pixmap = new Pixmap(Gdx.files.internal(PixmapLocation));
		String key = PixmapLocation.substring(PixmapLocation.lastIndexOf('/')+1, PixmapLocation.lastIndexOf('.'));
		pixmaps.put(key, pixmap);
	}
	
	public static void addPixmap(String PixmapLocation, String key){
		Pixmap pixmap = new Pixmap(Gdx.files.internal(PixmapLocation));
		if(pixmaps.containsKey(key))
			System.err.println("Error. Key of pixmap already exists");
		else
			pixmaps.put(key, pixmap);
	}
	
	public static Pixmap getPixmap(String key){
		return pixmaps.get(key);
	}
	
	public static boolean removePixmap(String key){
		Pixmap pixmap = pixmaps.get(key);
		if(pixmap != null){
			pixmap.dispose();
			return true;
		}
		return false;
	}
	
	public static void addSound(String SoundLocation)
	{
		Sound mSound = Gdx.audio.newSound(Gdx.files.internal(SoundLocation));
		String key =  SoundLocation.substring(SoundLocation.lastIndexOf("/")+1,
						SoundLocation.lastIndexOf("."));
		AssetsLoaderModel.sounds.put(key, mSound);
	}
	
	public static Sound getSound(String key)
	{
		return AssetsLoaderModel.sounds.get(key);
	}
	
	public static boolean removeSound(String key)
	{
		Sound t = AssetsLoaderModel.sounds.remove(key);
		if (t != null)
		{
			t.dispose();
			return true;
		}
		return false;
	} 

	public static void initFont()
	{
		AssetsLoaderModel.font = new BitmapFont(Gdx.files.internal("data/font.fnt"), Gdx.files.internal("data/font.png"), false);
	}
	
	public static TextureAtlas getPack(String key)
	{
		return AssetsLoaderModel.getPacks().get(key);
	}
	
	public static void addPack(String packLocation, String key)
	{
		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("and_engine.pack"));
		AssetsLoaderModel.packs.put(key, atlas);
	}
	
	public static boolean removePack(String key)
	{
		TextureAtlas pack = AssetsLoaderModel.packs.get(key);
		if (pack != null)
		{
			pack.dispose();
			return true;
		}
		return false;
	}
	
}

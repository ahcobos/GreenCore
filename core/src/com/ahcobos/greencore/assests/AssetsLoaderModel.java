package com.ahcobos.greencore.assests;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class AssetsLoaderModel{
	
	private static HashMap<String,Texture> textures ;
	private static HashMap<String,Sound> sounds ;
	private static HashMap<String,Music> music ;
	private static HashMap<String,BitmapFont> fonts ;
	
	public static BitmapFont font;
	
	public AssetsLoaderModel(){
		
		this.textures = new HashMap<String, Texture>();
		this.sounds = new HashMap<String, Sound>();
		this.music = new HashMap<String, Music>();
		this.fonts = new HashMap<String, BitmapFont>();
	}
	
	public static HashMap<String,Texture> getTextures() {
		return textures;
	}

	public static void setTextures(HashMap<String,Texture> textures) {
		AssetsLoaderModel.textures = textures;
	}
	
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
		System.out.println("a intsertar textura "+ TextureLocation);
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
	
	public static HashMap<String,Sound> getSounds() {
		return sounds;
	}

	public static void setSounds(HashMap<String,Sound> sounds) {
		AssetsLoaderModel.sounds = sounds;
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
}

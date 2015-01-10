package com.ahcobos.greencore.inputprocesors;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCZoom {
	
	private float initialDistante, distance;
	
	public GCZoom() {}

	public GCZoom(float initialDistance, float distance) {
		this.initialDistante = initialDistance;
		this.distance = distance; 
	}

	public float getInitialDistante() {
		return initialDistante;
	}

	public void setInitialDistante(float initialDistante) {
		this.initialDistante = initialDistante;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}
}

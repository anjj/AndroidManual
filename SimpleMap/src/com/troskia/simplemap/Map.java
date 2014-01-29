package com.troskia.simplemap;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/*SE DECLARA COMO FRAGMENTACTIVITY porque se va a trabajar con fragmentos*/
public class Map extends FragmentActivity  {

	private GoogleMap map;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		/*Obtenemos el objeto mapa para poder trabajar con el*/
		map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		
		/*Cambiar el modo de vista del mapa*/
		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		
		/*Añadir un marker al mapa*/
		map.addMarker(
			 	new MarkerOptions()
                .title("Hola soy un Marker")
                .position(new LatLng(41.65407, -0.83251))
                .snippet("Hola, soy el Snppet"));
		
		/*Mover el mapa y Zoomear, donde 14 es el nivel de ZOOM*/
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(41.65407, -0.83251), 14));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

}

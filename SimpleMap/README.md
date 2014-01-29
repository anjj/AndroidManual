GOOGLE MAP for API 8
====================
![alt tag](http://www.hosteriamirasierra.com/images/GOOGLE-MAPAS.jpg)

* * *
Añadir los siguientes permisos al AndroidManifest.xml para poder utilizar las funciones de Google Map:

	<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
	<uses-permission android:name="android.permission.INTERNET" />
	<uses-permission android:name="com.google.android.providers.gsf.permission.READ_GSERVICES" />
	<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
	<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
	<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

Añadimos la opcion que pueda usar el motor gráfico en AndroidManifest.xml

	<uses-feature
		ndroid:glEsVersion="0x00020000"
		android:required="true" />
        
Finalmente añadimos los meta-data para usar la API Key
	<meta-data
	        android:name="com.google.android.maps.v2.API_KEY"
		android:value="AIzaSyAFqqUyLB30YYLkaAo9vpDyI_H74QCe88Q" />
        
        <meta-data
                android:name="com.google.android.gms.version"
                android:value="@integer/google_play_services_version" />
        


**Obtenemos el objeto mapa para poder trabajar con el**

	map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		
**Cambiar el modo de vista del mapa**

	map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		
**Añadir un marker al mapa**

	map.addMarker(
		new MarkerOptions()
	    .title("Hola soy un Marker")
	    .position(new LatLng(41.65407, -0.83251))
	    .snippet("Hola, soy el Snppet"));
		
**Mover el mapa y Zoomear, donde 14 es el nivel de ZOOM**

	map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(41.65407, -0.83251), 14));

AndroidManual
=============

Android Manual 4 Dummies
* * *
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

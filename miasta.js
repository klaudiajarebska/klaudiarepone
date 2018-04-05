var deg2rad = x => x/180.0 * Math.PI

var rad2deg = x => x/Math.PI * 180

// wzór na podstawie Wikipedii
var haversine = ( r, fi1, fi2, la1, la2 ) => 2 * r * Math.asin(
	Math.sqrt(
		Math.pow(
			Math.sin( ( fi2 - fi1 ) / 2 ),
			2
		)
		+ 
		Math.cos( fi1 )
		* Math.cos( fi2 )
		* Math.pow(
			Math.sin( ( la2 - la1 ) / 2 ),
			2
		)
	)
)

var dist = ( gps1, gps2 ) => haversine(
	6371, // średni promień Ziemi w km
	deg2rad( gps1[0] ), deg2rad( gps2[0] ),
	deg2rad( gps1[1] ), deg2rad( gps2[1] )
)

var town_dist = ( t1, t2 ) => dist( t1.gps, t2.gps )


// DODATKOWA FUNKCJONALNOSC

var bearing = ( fi1, fi2, la1, la2 ) => Math.atan2(
	Math.sin( la2 - la1 ) * Math.cos( fi2 ),
	Math.cos( fi1 ) * Math.sin( fi2 )
	- Math.sin( fi1 ) * Math.cos( fi2 ) * Math.cos( la2 - la1 )
)

var direction = ( gps1, gps2 ) => rad2deg( bearing(
	deg2rad( gps1[0] ), deg2rad( gps2[0] ),
	deg2rad( gps1[1] ), deg2rad( gps2[1] )
) )

var town_direction = ( t1, t2 ) => direction( t1.gps, t2.gps )

var compass = x => "N NE E SE S SW W NW".split(" ")[ Math.round(((x+360)/360*8)) % 8 ]


//Posicion aleatoria dentro de España

double lat = 36.0 + Math.random() * (43.8 - 36.0)
double lon = -9.3 + Math.random() * (3.3 + 9.3)

vars.put("lat", String.format("%.6f", lat))
vars.put("lon", String.format("%.6f", lon))
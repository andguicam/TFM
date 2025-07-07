// Obtener valores anteriores
double lat = (vars.get("lat") ?: "37.38") as double
double lon = (vars.get("lon") ?: "-5.99") as double

// Movimiento leve aleatorio (~±50 m)
lat += (Math.random() - 0.5) * 0.001
lon += (Math.random() - 0.5) * 0.001

// Limitar dentro de España (península)
lat = Math.max(36.0, Math.min(43.8, lat))
lon = Math.max(-9.3, Math.min(3.3, lon))

vars.put("lat", String.format("%.6f", lat))
vars.put("lon", String.format("%.6f", lon))

// Velocidad aleatoria: 0–120 con 0.01% probabilidad de superar
double speed
if (Math.random() <= 0.0001) {
    speed = 120 + Math.random() * 50  // hasta 170
} else {
    speed = Math.random() * 120
}
vars.put("speed", String.format("%.2f", speed))

// Timestamp ISO8601
def now = java.time.ZonedDateTime.now(java.time.ZoneId.of("Europe/Madrid"))
vars.put("vehicle_timestamp", now.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ")))
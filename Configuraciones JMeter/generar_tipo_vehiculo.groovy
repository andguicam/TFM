def random = new Random()

def tiposVehiculo = [
    "turismo",
    "motocicleta",
    "furgoneta",
    "tractor",
    "autobus",
    "trailer",
    "taxi",
    "emergencia",
    "construccion",
    "agricola"
]

def tipo = tiposVehiculo[random.nextInt(tiposVehiculo.size())]
vars.put("vehicle_type", tipo)

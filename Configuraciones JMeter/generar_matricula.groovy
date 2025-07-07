def threadNum = ctx.getThreadNum()
def propKey = "plate_number_" + threadNum

if (!props.containsKey(propKey)) {
    def digits = (1000 + new Random().nextInt(9000)).toString()
    def consonants = ('B'..'Z').findAll { !['A','E','I','O','U'].contains(it) }
    def letters = ''
    def maxLetters = 'MZZ'

    def random = new Random()

    // Generar hasta que sea menor o igual a ZZZ
    while (true) {
        letters = (1..3).collect { consonants[random.nextInt(consonants.size())] }.join()
        if (letters.compareTo(maxLetters) <= 0) break
    }

    def plate = digits + letters
    props.put(propKey, plate)
}

vars.put("plate_number", props.get(propKey))
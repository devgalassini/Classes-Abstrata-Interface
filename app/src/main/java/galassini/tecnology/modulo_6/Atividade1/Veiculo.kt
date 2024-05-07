package galassini.tecnology.modulo_6.Atividade1

abstract class Veiculo {
    var velocidade = 0

    abstract fun acelerar(valor: Int)
}

class Carro : Veiculo() {
    override fun acelerar(valor: Int) {
        velocidade += valor
    }
}

class Moto : Veiculo() {
    override fun acelerar(valor: Int) {
        velocidade += valor
    }

    init {
        velocidade = 5
    }
}

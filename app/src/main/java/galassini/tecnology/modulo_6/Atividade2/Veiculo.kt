package galassini.tecnology.modulo_6.Atividade2

interface VeiculoInterface {
    var velocidade: Int
    fun acelerar(valor: Int)
}

class CarroInterface : VeiculoInterface {
    override var velocidade = 0

    override fun acelerar(valor: Int) {
        velocidade += valor
    }
}

class MotoInterface : VeiculoInterface {
    override var velocidade = 5

    override fun acelerar(valor: Int) {
        velocidade += valor
    }
}

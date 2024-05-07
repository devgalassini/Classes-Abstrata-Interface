package galassini.tecnology.modulo_6.Atividade3

import galassini.tecnology.modulo_6.Atividade1.Carro
import galassini.tecnology.modulo_6.Atividade1.Moto
import galassini.tecnology.modulo_6.Atividade1.Veiculo


object VeiculoFactory {
    fun criarVeiculo(tipo: String): Veiculo? {
        return when (tipo.toLowerCase()) {
            "carro" -> Carro()
            "moto" -> Moto()
            else -> null
        }
    }
}

fun main() {
    val listaVeiculos = mutableListOf<Veiculo>()

    // Utilizando a factory para criar uma moto e um carro e adicionando-os à lista
    val carro = VeiculoFactory.criarVeiculo("carro")
    val moto = VeiculoFactory.criarVeiculo("moto")
    carro?.let { listaVeiculos.add(it) }
    moto?.let { listaVeiculos.add(it) }

    // Percorrendo a lista e acelerando cada veículo
    listaVeiculos.forEach { it.acelerar(10) }

    // Imprimindo a velocidade de cada veículo da lista
    listaVeiculos.forEachIndexed { index, veiculo ->
        println("Velocidade do veículo ${index + 1}: ${veiculo.velocidade}")
    }
}

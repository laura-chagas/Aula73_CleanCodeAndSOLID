package I

interface FazSom{
    fun fazerSom()
}
interface Movimentar{
    fun andar()
}
class Cachorro: FazSom, Movimentar{
    override fun fazerSom() {
        return println("Au Au")
    }

    override fun andar() {
        println("Cachorro andando")
    }

}
class Gato : FazSom, Movimentar{
    override fun fazerSom() {
        println("Miau")
    }

    override fun andar() {
        println("Gato andando.")
    }
}
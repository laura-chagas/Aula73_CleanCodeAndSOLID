package l

open class Name {
    open fun getName(){
        println("Meu nome é A")
    }
}
class B : Name(){
    override fun getName() {
        println("Meu nome é B")
    }
}
fun showName(objeto: Name){
    objeto.getName()
}
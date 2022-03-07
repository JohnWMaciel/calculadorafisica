import com.sun.org.apache.xalan.internal.lib.ExsltMath.PI
import com.sun.tools.doclint.Entity.Pi
import kotlin.math.sqrt
import kotlin.math.pow



fun main(args: Array<String>){

    val calculadora: Calculadora = Calculadora()

}
class Calculadora {


    fun ForcaPeso(num1: Float, num2: Float):Float {
        return num1 * num2

    }

    fun ForcaCentripeta(num1: Float, num2: Float, num3: Float): Float {
        return num1 * num2 / num3
        //num1 = massa do corpo, num2 = velocidade, num3 = distancia

    }

    fun variacaoTemperatura(num1: Float, num2: Float): Float {
        return num1 - num2

    }

    fun impulso(num1: Float, num2: Float): Float {
        return num1 * num2
        // num2 é a variação de temperatura, encontrado no anterior

    }

    fun ForcaElastica(num1: Float, num2: Float): Float {
        return num1 * num2
        //num1= constante elastica do corpo, num2= deformação percebida no corpo
    }

    fun velocidadeMedia(num1: Float, num2: Float): Float {
        return num1 / num2
        //velocidademedia = num1(intevalo de deslocamento) / num2(intervalo de tempo)

    }

    fun MovimentoRetilineoUniforme(num1: Float, num2: Float, num3: Float): Float {
        return num1 + num2 * num3
        //num1= posição inicial + num2= velocidade de movimento * num3= tempo de deslocamento

    }

    fun MovimentoRetilineoUniformeVariado(num1: Float, num2: Float): Float {
        return num1 / num2
        //num1= variação de tempo, num2= variação de tempo

    }
}
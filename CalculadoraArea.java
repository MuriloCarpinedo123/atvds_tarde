package figura;


public class CalculadoraArea {
    public static void main(String[] args) {
        //encapsulando os metodos construtores
        public void setAlturaQ(int alturaQ) {
            this.alturaQ = alturaQ;
        }
        public void setBaseQ(int baseQ) {
            this.baseQ = baseQ;
        }
        
        public void setAlturaT(int alturaT) {
            this.alturaT = alturaT;
        }
        public void setBaseT(int baseT) {
            this.baseT = baseT;
        }
        
        //pedindo os numeros que serao usados nas operações
        System.out.println("escreva a base do triangulo:");

        System.out.println("escreva a altura do triangulo");

        System.out.println("escreva a base do quadrado:");

        System.out.println("escreva a altura do quadrado:");

        //gettando os numeros que o usuario colocou
        public int getBaseT(){
            return(baseT); //retornando a base do triangulo
        }
        public int getaAturaT(){
            return(alturaT); //retornando a altura do triangulo
        }
        public int getBaseQ(){
            return(baseQ); //retornando a base do quadrado
        }
        public int getAlturaQ(){
            return(alturaQ); //retornando a altura do quadrado
        }

        //definindo a função que vai mostrar o resultado pro usuario
        calc.areaQuadrado(baseQ*alturaQ);
        calc.areaTriangulo((baseT*alturaT)/2);
    }
    
}

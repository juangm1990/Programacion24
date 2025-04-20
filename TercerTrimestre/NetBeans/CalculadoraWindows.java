/*
///////////////////////////////////////
Panel (Todo el espacio)   || Propiedades || background: azul

    - Label  || Propiedades || background: azul, border 1px, opaque, texto derecha (eliminar texto)
    - Button (Para los botones de la calculadora)
///////////////////////////////////////

1. CENTRAR CALCULADORA PANTALLA

public Calculadora() {
        initComponents();

//// DEBAJO

this.setLocationRelativeTo(null);

1. CAMBIAR NOMBRE JLABEL

Botón derecho
    - Change variable name: "resultado"
 
2. CONFIGURAR NÚMEROS

this.resultado.setText(this.resultado.getText()+"0");


3. CONFIGURAR FUNCIONES

///////////////
/// C - Borrado entero
///////////////

this.resultado.setText("");
    this.primernumero = 0;
    this.segundonumero = 0;
    this.operador = "";


///////////////
/// CE - Borrar números
///////////////

this.resultado.setText("");


///////////////
/// Borrar - Un número
///////////////

String texto = this.resultado.getText();
    if (!texto.isEmpty()) {
        this.resultado.setText(texto.substring(0, texto.length() - 1));
    }

4. CONFIGURAR OPERADORES

Crear una variable pública

public class CalculadoraWindows extends javax.swing.JFrame {
    
  	public double primernumero;
	public double segundonumero;
	public String operador;

///////////////
/// OPERADORES
///////////////

this.primernumero=Double.parseDouble(this.resultado.getText());
        this.operador="+";
        this.resultado.setText("");


///////////////
/// IGUAL
///////////////

        this.segundonumero=Double.parseDouble(this.resultado.getText());
        
        switch(this.operador){
            case "+": this.resultado.setText(Double.toString(this.primernumero+this.segundonumero)); break;
            case "-": this.resultado.setText(Double.toString(this.primernumero-this.segundonumero)); break;
            case "/": this.resultado.setText(Double.toString(this.primernumero/this.segundonumero)); break;
            case "*": this.resultado.setText(Double.toString(this.primernumero*this.segundonumero));break;
        }

        /////////////// CAMBIAR PARA QUITAR EL .0

        this.segundonumero=Double.parseDouble(this.resultado.getText());
        
        switch(this.operador){
            case "+": this.resultado.setText(sincero(this.primernumero+this.segundonumero)); break;
            case "-": this.resultado.setText(sincero(this.primernumero-this.segundonumero)); break;
            case "*": this.resultado.setText(sincero(this.primernumero*this.segundonumero)); break;
            case "/": if(this.segundonumero == 0){ this.resultado.setText("No se divide entre 0");}

            else {
                
                this.resultado.setText(sincero(this.primernumero/this.segundonumero));}break;
        }
     
        
///////////////
/// PUNTO
///////////////

if (!(this.resultado.getText().contains("."))){
            this.resultado.setText(this.resultado.getText()+".");
        }

///////////////
/// QUITAR .0
///////////////

Crear una función al final de los botones

      public String sincero (double resultadofinal){
        String retorno="";
        
        retorno = Double.toString(resultadofinal);
                if (resultadofinal%1==0){
                    retorno=retorno.substring(0, retorno.length ()- 2);
                }
        
        return retorno;
        
    }

    cambiar Double.toString por sincero que es nuestra función


/////////////////////////////////////
/// FUNCIONES DE LA CALCULADORA
/////////////////////////////////////


///////////
/// 1/x - MITAD

if (!this.resultado.getText().isEmpty()) {
        double numero = Double.parseDouble(this.resultado.getText());
        if (numero == 0) {
            this.resultado.setText("Inverso de 0 no definido");
        } else {
            double inverso = 1 / numero;
            this.resultado.setText(sincero(inverso));
        }
    }

///////////
/// X²

if (!this.resultado.getText().isEmpty()) {
        double numero = Double.parseDouble(this.resultado.getText());
        double cuadrado = numero * numero;
        this.resultado.setText(sincero(cuadrado));
    }

///////////
/// Raiz cuadrada

if (!this.resultado.getText().isEmpty()) {
        double numero = Double.parseDouble(this.resultado.getText());
        if (numero < 0) {
            this.resultado.setText("Raíz no válida");
        } else {
            double raiz = Math.sqrt(numero);
            this.resultado.setText(sincero(raiz));
        }
    }

///////////
/// Cambiar signo

if (!this.resultado.getText().isEmpty()) {
        double numero = Double.parseDouble(this.resultado.getText());
        numero = numero * -1;
        this.resultado.setText(sincero(numero));
    }

///////////
/// %

if (!this.resultado.getText().isEmpty()) {
        double numero = Double.parseDouble(this.resultado.getText());
        numero = numero * -1;
        this.resultado.setText(sincero(numero));
    }



/////////////////////////////////////
/// OTRAS FUNCIONALIDADES DE LA CALCULADORA
/////////////////////////////////////


 */
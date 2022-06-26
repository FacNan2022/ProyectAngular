export class Persona{
Id?:number;
Nombre:String;
Apellido: String;
Img: String;

constructor(Nombre: String,
    Apellido:String, Img:String){
    this.Nombre= Nombre; 
    this.Apellido= Apellido;
    this.Img= Img;
    }
}

public class Horario{
	int hora;
	int minuto;
	int segundo;
	 
	 void incSegundo(){
		 segundo+=1;
		 if(segundo>=60){
			 minuto+=1;
			 segundo=0;
		 }
		 if(minuto>=60){
			 hora+=1;
			 minuto=0;
		 }
		 
	 }
}
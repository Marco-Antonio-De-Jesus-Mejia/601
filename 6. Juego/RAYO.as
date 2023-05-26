package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class RAYO extends MovieClip{
		private var vel : int = 5;
		private var a: int=5;
		

		public function RAYO(posX, posY){
			// constructor
			x = posX + 40;
			y = posY + 40;
			scaleX = .8;
			scaleY = .9;
			addEventListener(Event.ENTER_FRAME, mover);
			addEventListener(Event.ENTER_FRAME, actualiza);
		}
		
		function mover(e:Event){
			y+= vel;
			if(y>=340){
				vel=0;
				this.removeEventListener(Event.ENTER_FRAME, mover);
				stage.removeChild(this);
			}
			if(this.hitTestObject(Setup.Loki_new.Punto_colision)){
				//trace("Colision");
				vel=0;
				this.removeEventListener(Event.ENTER_FRAME, mover);
				stage.removeChild(this);
				
				Setup.puntos+=1;
			}
		}
		
		function actualiza(e:Event){
			if(Setup.puntos>=a){
				vel += a;
				a+=5;
			}
			//a+=5;
		}
	}
	
}
